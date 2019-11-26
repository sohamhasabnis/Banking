package com.lti.web.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.core.entities.Status;
import com.lti.core.exceptions.PassException;
import com.lti.core.services.LoginService;
import com.lti.core.services.UserService;

@Controller
public class AdminController {
	
	@Autowired
	LoginService service;
	
	public AdminController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("admin.usr")
	public String loginAdmin(HttpSession session,Model model) {
		
		return "login";
	}
	
	@PostMapping("admin.usr")
	public String getAdminLogin(@RequestParam("user_id") String userId,
			@RequestParam("pass") String password, HttpSession session,Model model) throws PassException {
		
		if(userId.equals("admin"))
		{
			if(password.equals("admin"))
				return"admin";
			model.addAttribute("msg","invalid cridentials");
			return "redirect:login.usr";
		}
		model.addAttribute("msg","invalid cridentials");
		return "redirect:login.usr";
	}
	
	@RequestMapping("approve.usr")
	public String approveAccount(HttpSession session,Model model) {	
		List<Status> list = service.getUsers("Processing");
		model.addAttribute("status",list);
		return "admin";
	}
	
/*	@RequestMapping("approved.usr")
	public String ApprovedAccount(HttpSession session,Model model) {
		
		service.updateStatus("active", userId);
		return "admin";
	}*/
	
	@RequestMapping("active.usr")
	public String activeAccount(HttpSession session,Model model) {	
		List<Status> list = service.getUsers("active");
		model.addAttribute("status",list);
		return "admin";
	}
}
