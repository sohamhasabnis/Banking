package com.lti.web.controllers;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.core.entities.Benificary;
import com.lti.core.entities.Passwords;
import com.lti.core.entities.Sha1;
import com.lti.core.entities.Status;
import com.lti.core.exceptions.AccountException;
import com.lti.core.exceptions.PassException;
import com.lti.core.services.BeneficaryService;
import com.lti.core.services.LoginService;
import com.lti.core.services.PasswordService;
import com.lti.core.services.UserService;

@Controller
public class PasswordController {

	@Autowired
	private PasswordService service;
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	BeneficaryService beneficaryService;
	
	@Autowired
	JavaMailSender sender;
	private String emailSender ="<onlinebanking111221@gmail.com>";
	
	public PasswordController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("pass.usr")
	public String pass() {
		return "Password";
	}
	
	@PostMapping("pass.usr")
	public String setAccountPassword(Passwords pass,HttpSession session) throws PassException {
		pass.setUserId(	(String)session.getAttribute("user"));
		pass.setAccPassword(Sha1.encryptThisString(pass.getAccPassword()));
		pass.setTxnPassword(Sha1.encryptThisString(pass.getTxnPassword()));
		service.setPassword(pass);
		SetAccountStatus(session);
		addBeneficary();
		return "Password";
	}
	
	private void addBeneficary() {
		Benificary benificary = new Benificary();
		benificary.setB_name("soham");
		benificary.setFromAcNo(1001);
		benificary.setToAcNo(1002);
		beneficaryService.addBeneficary(benificary);
	}
	
	private void SetAccountStatus(HttpSession session) {
		Status status = new Status();
		status.setStatus("Processing");
		status.setAccount_no((long)session.getAttribute("acc_no"));
		status.setUserId((String)session.getAttribute("user"));
		loginService.addStatus(status);
	}
	
	@GetMapping("validate.usr")
	public String validateOTP(@RequestParam("") String otp2, 
			@RequestParam("") String password,
			HttpSession session ) throws PassException {
			Object obj =session.getAttribute("otp");
			String userId =(String)session.getAttribute("user");
			String otp="";
			if(obj != null)
				otp=obj.toString();
			if(otp.contentEquals(otp2)) {
				int result = service.updateAccPassword(Sha1.encryptThisString(password), userId);
				if(result>0)
					return "redirect:login.usr";
				else
					return "OTP NOT VALID";
			}
		return "mail.usr";
	}
	
	@PostMapping("mailotp.usr")
	public String sentOtp(Model model, @RequestParam("emailToRecipient")final String emailToRecipient,@RequestParam("userId") final String userId,HttpSession session)
	{
		int randomPin=(int)(Math.random()*9000)+1000;
		//variable must be final as it is used inside nested inner class
		final String otp1=String.valueOf(randomPin);
		sender.send(new MimeMessagePreparator(){
		public void prepare(MimeMessage mimeMessage) {
	
			try {
				MimeMessageHelper mimeMsgHelperObj=new MimeMessageHelper(mimeMessage, true,"UTF-8");
				mimeMsgHelperObj.setTo(emailToRecipient);
				mimeMsgHelperObj.setFrom(emailSender);
				mimeMsgHelperObj.setText("Your otp for Airline Online site. Please put this as it is ."+otp1);
				mimeMsgHelperObj.setSubject("Your otp is:");
			} catch (MessagingException e) {
				
				e.printStackTrace();
			}
		}
	});
	session.setAttribute("otp",otp1);
	session.setAttribute("email",emailToRecipient);
	session.setAttribute("userId", userId);
	
	System.out.println("\nMssage send successfully!\n");
	model.addAttribute("msg","Mail sent");
	return"forgetPassword";
	}
}