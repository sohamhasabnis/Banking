package com.lti.core.services;

import com.lti.core.entities.Benificary;

public interface BeneficaryService {
	public boolean addBeneficary(Benificary benificary);
	public  int getBenficary(int account_no,String name);
}
