
package com.lti.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity(name="acc")
@Table(name="ACCOUNT")


@SequenceGenerator(name="app_seq", sequenceName="seq", initialValue= 1000,allocationSize=1)

public class Account
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="app_seq")
	@Column(name="ACCOUNT_NO")
	private long account_no;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="BALANCE")
	private int Balance=0;
	
	
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	
}