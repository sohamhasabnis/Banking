package com.lti.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="status101")
@Table(name="STATUS_LOG")

public class Status {
	@Id
	@Column(name="USER_ID")
	String userId;
	
	@Column(name="ACCOUNT_NO")
	long account_no;

	@Column(name="STATUS")
	String status;
	
	public Status() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getAccount_no() {
		return account_no;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}