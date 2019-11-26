package com.lti.web.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.core.entities.Transaction;
import com.lti.core.exceptions.AccountException;
import com.lti.core.services.AccountService;
import com.lti.core.services.TransferAmountService;

@Controller
public class PaymentsController {
	
	@Autowired
	AccountService accountService;	
	
	@Autowired
	TransferAmountService service;
	public PaymentsController() {
		// TODO Auto-generated constructor stub
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    dateFormat.setLenient(true);
	    webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@GetMapping("neft.usr")
	public String neftTransfer(ModelMap model,HttpSession session) {
		model.addAttribute("acno", (long)session.getAttribute("acc_no"));
		return "neft";
	}
	
	@PostMapping("neft.usr")
	public String neftTransfer(
			@RequestParam("toacc") long toAcNo, 
			@RequestParam("amount") int amount,  
			@RequestParam("remark") String remarks,
			ModelMap model,HttpSession session) throws AccountException {
			System.out.println(""+amount);
			int fromAcNo = Math.toIntExact((long)session.getAttribute("acc_no"));
			Transaction transaction=new Transaction();
			transaction.setTransaction_id((new Date()).getTime());
			transaction.setAccount_no(fromAcNo);
			transaction.setAmount(amount);
			transaction.setDescription(remarks);
			transaction.setDate_of_Transaction(new Date());
			
			Transaction transaction2 = new Transaction();
			transaction2.setTransaction_id(transaction.getTransaction_id());
			transaction2.setAccount_no(toAcNo);
			transaction2.setAmount(transaction.getAmount());
			transaction2.setDate_of_Transaction(transaction.getDate_of_Transaction());
			transaction2.setDescription(transaction.getDescription());
			int flg = service.transferAmount(fromAcNo, toAcNo, amount,transaction,transaction2);
			if(flg == -1)
				model.addAttribute("error", "low balence");
			if(flg == -2)
				model.addAttribute("error", "invalid recipents account number");
			if(flg == 1)
				model.addAttribute("error", "Amount Noted Will be Transfer within 24 hrs");
		return "neft";
	}
	
	
	@GetMapping("rtgs.usr")
	public String rtgsTransfer(ModelMap model,HttpSession session) {
		model.addAttribute("acno", (long)session.getAttribute("acc_no"));
		return "rtgs";
	}
	
	@PostMapping("rtgs.usr")
	public String rtgsTransfer(
			@RequestParam("toacc") long toAcNo, 
			@RequestParam("amount") int amount,  
			@RequestParam("remark") String remarks,
			ModelMap model,HttpSession session) throws AccountException {
			System.out.println(""+amount);
			int fromAcNo = Math.toIntExact((long)session.getAttribute("acc_no"));
			Transaction transaction=new Transaction();
			transaction.setTransaction_id((new Date()).getTime());
			transaction.setAccount_no(fromAcNo);
			transaction.setAmount(amount);
			transaction.setDescription(remarks);
			transaction.setDate_of_Transaction(new Date());
			
			Transaction transaction2 = new Transaction();
			transaction2.setTransaction_id(transaction.getTransaction_id());
			transaction2.setAccount_no(toAcNo);
			transaction2.setAmount(transaction.getAmount());
			transaction2.setDate_of_Transaction(transaction.getDate_of_Transaction());
			transaction2.setDescription(transaction.getDescription());
			int flg = service.transferAmount(fromAcNo, toAcNo, amount,transaction,transaction2);
			if(flg == -1)
				model.addAttribute("error", "low balence");
			if(flg == -2)
				model.addAttribute("error", "invalid recipents account number");
			if(flg == 1)
				model.addAttribute("error", "Amount Noted Will be Transfer within 24 hrs");
		return "rtgs";
	}
	
	
	@GetMapping("imps.usr")
	public String impsTransfer(ModelMap model,HttpSession session) {
		model.addAttribute("acno", (long)session.getAttribute("acc_no"));
		return "imps";
	}
	
	@PostMapping("imps.usr")
	public String impsTransfer(
			@RequestParam("toacc") long toAcNo, 
			@RequestParam("amount") int amount,  
			@RequestParam("remark") String remarks,
			ModelMap model,HttpSession session) throws AccountException {
			System.out.println(""+amount);
			int fromAcNo = Math.toIntExact((long)session.getAttribute("acc_no"));
			Transaction transaction=new Transaction();
			transaction.setTransaction_id((new Date()).getTime());
			transaction.setAccount_no(fromAcNo);
			transaction.setAmount(amount);
			transaction.setDescription(remarks);
			transaction.setDate_of_Transaction(new Date());
			
			Transaction transaction2 = new Transaction();
			transaction2.setTransaction_id(transaction.getTransaction_id());
			transaction2.setAccount_no(toAcNo);
			transaction2.setAmount(transaction.getAmount());
			transaction2.setDate_of_Transaction(transaction.getDate_of_Transaction());
			transaction2.setDescription(transaction.getDescription());
			int flg = service.transferAmount(fromAcNo, toAcNo, amount,transaction,transaction2);
			if(flg == -1)
				model.addAttribute("error", "low balence");
			if(flg == -2)
				model.addAttribute("error", "invalid recipents account number");
			if(flg == 1)
				model.addAttribute("error", "Amount Will be Transfer within 24 hrs");
		return "imps";
	}
}
