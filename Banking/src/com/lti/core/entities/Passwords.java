package com.lti.core.entities;

import javax.persistence.Entity;

@Entity(name="pass")
public class Passwords {
	private String userId;
	private String accPassword;
	private String txnPassword;
	
	public Passwords() {
		
	
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccPassword() {
		return accPassword;
	}

	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}

	public String getTxnPassword() {
		return txnPassword;
	}

	public void setTxnPassword(String txnPassword) {
		this.txnPassword = txnPassword;
	}
	

}
