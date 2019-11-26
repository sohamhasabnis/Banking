package com.lti.core.daos;

import com.lti.core.entities.Benificary;

public interface BenificaryDao {
	public boolean insertBenificary(Benificary benificary);
	public int getBenficary(long account_no,String name);
}
