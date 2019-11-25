package com.lti.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.BenificaryDao;
import com.lti.core.entities.Benificary;

@Service("beneService")
public class BenficaryServiceImpl implements BeneficaryService {

	@Autowired
	BenificaryDao dao;
	public BenficaryServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addBeneficary(Benificary benificary) {
		dao.insertBenificary(benificary);
		return true;
	}

	@Override
	public int getBenficary(int account_no, String name) {
		// TODO Auto-generated method stub
		return dao.getBenficary(account_no, name);
	}

}
