package com.lti.core.entities;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

public class Authorize {

	public Authorize() {
		// TODO Auto-generated constructor stub
	}
	
	static public String authorize(HttpSession session, Model model, String reqUrl) {
		Object user = session.getAttribute("loggedInUser");
		if(user!=null) {
			System.out.println("User has logged in as "+user);
			return reqUrl;
		}
		System.out.println("Login required!");
		List<String> errors = new ArrayList<>();
		errors.add("please login to continue...");
		model.addAttribute("errors",errors);
		model.addAttribute("target",reqUrl+".usr");
		return "redirect:login.usr";
	}
}
