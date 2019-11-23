package com.lti.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.core.entities.Passwords;
import com.lti.core.entities.User;
import com.lti.core.exceptions.PassException;
import com.lti.core.services.PasswordService;

@Controller
public class PasswordController {

	@Autowired
	private PasswordService service;
	public PasswordController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("pass.usr")
	public String pass() {
		return "Password";
	}
	
	@PostMapping("pass.usr")
	public String setAccountPassword(Passwords pass,HttpSession session) throws PassException
	{
	
		pass.setUserId(	(String)session.getAttribute("user"));
		service.setPassword(pass);
		return "Password";
	}
}