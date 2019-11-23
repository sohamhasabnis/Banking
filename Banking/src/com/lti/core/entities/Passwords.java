package com.lti.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="pass")
@Table(name="LOGIN")
public class Passwords {
	@Id
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="LOGIN_PASS")
	private String accPassword;
	
	@Column(name="TXN_PASS")
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
