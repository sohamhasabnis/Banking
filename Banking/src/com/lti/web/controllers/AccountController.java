package com.lti.web.controllers;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.core.entities.Account;
import com.lti.core.exceptions.AccountException;
import com.lti.core.services.AccountService;

@Controller
public class AccountController {

	@Autowired
	private AccountService service;
	public AccountController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("addAccount.usr")
	public String addAccountDetails() throws AccountException
	{
		Account acc = new Account();
		acc.setType("savings");
		if(service.addAccount(acc))
			System.out.println("Donee");
		else
			System.out.println("Not DOne");
			
		return "thanks";
	}
}
