package com.lti.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="benf")
@Table(name="BENEFICIARY")
@SequenceGenerator(name="app_seq", sequenceName="b_seq",allocationSize=1)
public class Benificary {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="app_seq")
	@Column(name="B_ID")
	int b_id;
	
	@Column(name="BENE_NAME")
	String b_name;
	
	@Column(name="HOLDER_ACCNO")
	long fromAcNo;
	
	@Column(name="RECEIVER_ACCNO")
	long toAcNo;
	
	public Benificary() {
		// TODO Auto-generated constructor stub
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public long getFromAcNo() {
		return fromAcNo;
	}

	public void setFromAcNo(long fromAcNo) {
		this.fromAcNo = fromAcNo;
	}

	public long getToAcNo() {
		return toAcNo;
	}

	public void setToAcNo(long toAcNo) {
		this.toAcNo = toAcNo;
	}
}