package com.lti.web.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.core.entities.Account;
import com.lti.core.entities.Transaction;
import com.lti.core.exceptions.AccountException;
import com.lti.core.services.AccountService;
import com.lti.core.services.TransactionService;

@Controller
public class AccountController {

	@Autowired
	TransactionService service;
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    dateFormat.setLenient(true);
	    webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true)); 
	}
	@GetMapping("summary.usr")
	public String getTransactions() {
		return "accountSummery";
	}
	
	@PostMapping("summary.usr")
		public String getTransactions(HttpSession session, Model model, @RequestParam("dt1") Date date1, @RequestParam("dt2") Date date2) {
			List<Transaction> list =  service.getTransactions(date1, date2, (long)session.getAttribute("acc_no"));
			model.addAttribute("list",list);
			System.out.println(date1.toString());
			return "accountSummery";
	}
}
