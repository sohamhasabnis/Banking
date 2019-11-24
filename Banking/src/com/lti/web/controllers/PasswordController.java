package com.lti.web.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.core.entities.Passwords;
import com.lti.core.entities.Sha1;
import com.lti.core.entities.Status;
import com.lti.core.exceptions.AccountException;
import com.lti.core.exceptions.PassException;
import com.lti.core.services.LoginService;
import com.lti.core.services.PasswordService;
import com.lti.core.services.UserService;

@Controller
public class PasswordController {

	@Autowired
	private PasswordService service;
	
	@Autowired
	private LoginService loginService;
	
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
		pass.setAccPassword(Sha1.encryptThisString(pass.getAccPassword()));
		pass.setTxnPassword(Sha1.encryptThisString(pass.getTxnPassword()));
		service.setPassword(pass);
		SetAccountStatus(session);
		return "Password";
	}
	
	private void SetAccountStatus(HttpSession session)
	{
		Status status = new Status();
		status.setStatus("Processing");
		status.setAccount_no((long)session.getAttribute("acc_no"));
		status.setUserId((String)session.getAttribute("user"));
		loginService.addStatus(status);
	}
}