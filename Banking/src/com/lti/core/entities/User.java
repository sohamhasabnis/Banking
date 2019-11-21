package com.lti.core.entities;

import java.sql.Date;

import javax.persistence.Entity;

@Entity(name="users")
public class User {

	String userId;
	String firstName;
	String middleName;
	String lastName;
	String fatherName;
	String email;
	long mobileNumber;
	Date dob;
	String rAddr;
	String pAddr;
	String occupation;
	long income;
	boolean atmCard;
	boolean netBank;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getrAddr() {
		return rAddr;
	}
	
	public void setrAddr(String rAddr) {
		this.rAddr = rAddr;
	}
	
	public String getpAddr() {
		return pAddr;
	}
	
	public void setpAddr(String pAddr) {
		this.pAddr = pAddr;
	}
	
	public String getOccupation() {
		return occupation;
	}
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public long getIncome() {
		return income;
	}
	
	public void setIncome(long income) {
		this.income = income;
	}
	
	public boolean isAtmCard() {
		return atmCard;
	}
	
	public void setAtmCard(boolean atmCard) {
		this.atmCard = atmCard;
	}
	
	public boolean isNetBank() {
		return netBank;
	}
	
	public void setNetBank(boolean netBank) {
		this.netBank = netBank;
	}
}
