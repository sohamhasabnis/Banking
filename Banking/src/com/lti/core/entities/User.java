package com.lti.core.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="users")
@Table(name="USER_INFO")
public class User {

	@Id
	@Column(name="USER_ID")
	String userId;

	@Column(name="FIRST_NAME")
	String firstName;

	@Column(name="MIDDLE_NAME")
	String middleName;

	@Column(name="LAST_NAME")
	String lastName;

	String fatherName;

	@Column(name="EMAIL_ID")
	String email;

	@Column(name="MOBILE_NO")
	long mobileNumber;

	@Column(name="DOB")
	Date dob;
	
	@Column(name="R_ADDRESS")
	String rAddr;

	@Column(name="P_ADDRESS")
	String pAddr;

	@Column(name="OCC")
	String occupation;

	@Column(name="INCOME")
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
