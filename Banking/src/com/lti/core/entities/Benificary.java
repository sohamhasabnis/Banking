package com.lti.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="benf")
@Table(name="BENEFICIARY")
public class Benificary {

	@Column(name="BENE_NAME")
	String name;
	
	@Column(name="HOLDER_ACCNO")
	long fromAcNo;
	
	@Column(name="RECEIVER_ACCNO")
	long toAcNo;
	
	public Benificary() {
		// TODO Auto-generated constructor stub
	}

}
