package com.lti.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="trans")
@Table(name="transaction")
@SequenceGenerator(name="app_seq1", sequenceName="sequence_name", initialValue= 1001,allocationSize=1)
public class Transaction {
	@Column(name="ACCOUNT_NO")
	long account_no;

	@Id
	@Column(name="B_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="app_seq1")
	int b_id;
	
	@Column(name="TX_ID")
	long transaction_id;

	@Column(name="AMOUNT")
	int amount;
	
	@Column(name="DESCRIPTION")
	String description;
	
	@Column(name="TXDATE")
	Date date_of_Transaction;
	
	public long getAccount_no() {
		return account_no;
	}	

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	
	public long getTransaction_id() {
		return transaction_id;
	}
	
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_of_Transaction() {
		return date_of_Transaction;
	}
	
	public void setDate_of_Transaction(Date date_of_Transaction) {
		this.date_of_Transaction = date_of_Transaction;
	}
}
