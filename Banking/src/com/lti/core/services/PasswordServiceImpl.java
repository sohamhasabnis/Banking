package com.lti.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.PassDao;
import com.lti.core.entities.Passwords;
import com.lti.core.exceptions.PassException;

@Service("passService")
public class PasswordServiceImpl implements PasswordService{

	@Autowired
	PassDao dao;
	public PasswordServiceImpl() {
	}
	@Override
	public boolean setPassword(Passwords pass) throws PassException {
		// TODO Auto-generated method stub
		return dao.setPassword(pass);
	}
	@Override
	public int updateAccPassword(String password, String userId) throws PassException {
	
		return dao.updateLoginPassword(password, userId);
	}
	@Override
	public int updateTxnPassword(String password, String userId) throws PassException {
		return dao.updateTransactionPassword(password, userId);
	}

}
