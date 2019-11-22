package com.lti.core.entities;

import java.sql.Date;

public class Transaction {
	

int account_no;
int transaction_id;
double amount;
String description;
String type;
Date Date_of_Transaction;
public int getAccount_no() {
	return account_no;
}
public void setAccount_no(int account_no) {
	this.account_no = account_no;
}
public int getTransaction_id() {
	return transaction_id;
}
public void setTransaction_id(int transaction_id) {
	this.transaction_id = transaction_id;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Date getDate_of_Transaction() {
	return Date_of_Transaction;
}
public void setDate_of_Transaction(Date date_of_Transaction) {
	Date_of_Transaction = date_of_Transaction;
}



}
