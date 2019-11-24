package com.lti.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping("login.usr")
	public String login() {
		return "login";
	}
	
	@PostMapping("login.usr")
	public String getLogin(@RequestParam("user_id") String userId,
			@RequestParam("pass") String password) throws PassException {
		
		password = Sha1.encryptThisString(password);
		if(loginService.validateUser(userId)) {
			if(loginService.validateStatus(userId)) {
				if(loginService.validatePassword(userId, password))
				{
					return "thanks";
				}
				else
					return "login";
			}
			else
				return "login";
		}
		return"login";
	}	
}