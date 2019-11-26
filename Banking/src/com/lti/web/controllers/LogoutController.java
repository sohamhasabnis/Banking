package com.lti.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	public LogoutController() {
		// TODO Auto-generated constructor stub
	}
	@GetMapping("logout.usr")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login.usr?msg=successfully+logged+out";
	}
	
	
}
