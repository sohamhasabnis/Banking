package com.lti.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.core.entities.Authorize;
import com.lti.core.entities.Sha1;
import com.lti.core.exceptions.PassException;
import com.lti.core.services.LoginService;
import com.lti.core.services.PasswordService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@Autowired
	PasswordService passwordService;
	
	public LoginController() {
		// TODO Auto-generated constructor stub
		
	}
	
	@RequestMapping("home.usr")
		public String homePage() {
			return "home";
	}
	
	@RequestMapping("dashboard.usr")
	public String goToDashboard(HttpSession session,Model model) {
		//String view = Authorize.authorize(session,model,"dashboard");
		return "dashboard";
	}
	@GetMapping("login.usr")
	public String login(HttpSession session,Model model) {
		return "login";
	}
	
	@PostMapping("login.usr")
	public String getLogin(@RequestParam("user_id") String userId,
			@RequestParam("pass") String password, HttpSession session,Model model) throws PassException {
	//	String view = Authorize.authorize(session,model,"login");
		password = Sha1.encryptThisString(password);
		if(loginService.validateUser(userId)) {
			if(loginService.validateStatus(userId)) {
				if(loginService.validatePassword(userId, password))
				{
					session.setAttribute("acc_no",(long)loginService.getAccount(userId));
					return "redirect:dashboard.usr";
				}
				else {
					model.addAttribute("msg","invalid password is wrong");
				}
				
					return "login";
			}
			else
				model.addAttribute("msg","Your Account is either locked or yet to be approved");
				return "login";
		}
		return"login";
	}	
}