package com.lti.web.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.core.entities.Account;
import com.lti.core.entities.User;
import com.lti.core.exceptions.AccountException;
import com.lti.core.exceptions.UserException;
import com.lti.core.services.AccountService;
import com.lti.core.services.UserService;

@Controller
public class UserController {
	// http://localhost:8082/Banking/userDetails.usr?id=abc
	@Autowired
	private UserService service;
	
	@Autowired
	private AccountService accService;
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    dateFormat.setLenient(true);
	    webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("home.usr")
	public String showHome()
	{
		return "addUser";
	}
	
	@PostMapping("home.usr")
	public String addUser(User user,HttpServletRequest request,Map model,
			@RequestParam("birth") Date birth, HttpSession session
			)throws UserException, AccountException
	{
		try {
	String	rad = request.getParameter("Address1")+" "+request.getParameter("Address2")+" "+request.getParameter("Landmark")+" "+request.getParameter("State")+" "+request.getParameter("City")+" "+request.getParameter("Pincode");
	String	pad =request.getParameter("Address11")+" "+request.getParameter("Address21")+" "+request.getParameter("Landmark1")+" "+request.getParameter("State1")+" "+request.getParameter("City1")+" "+request.getParameter("Pincode1"); 
		user.setrAddr(rad);
		user.setpAddr(pad);
		user.setDob(birth);
		session.setAttribute("user",user.getUserId());
		service.addUser(user);
		createAccount(session);
		return "redirect:pass.usr";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("userDetails.usr")
	public ModelAndView getUserDetails(@RequestParam("id") String userId ) throws UserException {
		User usr = service.getUser(userId);
		String jspName="UserDetails";
		ModelAndView mnv = new ModelAndView();
		mnv.addObject("usr",usr);
		mnv.setViewName(jspName);
		return mnv;
	}
	
	@RequestMapping("Thanks.usr")
	public String redirect(HttpSession session) {
		
		return "thanks";
	}
	
	private void createAccount(HttpSession session) throws AccountException
	{
		Account acc = new Account();
		acc.setType("savings");
		accService.addAccount(acc);
		session.setAttribute("acc_no",acc.getAccount_no());
	}
}