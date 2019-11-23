package com.lti.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.AccountDao;
import com.lti.core.entities.Account;
import com.lti.core.exceptions.AccountException;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDao dao;
	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean setAccount(Account account) throws AccountException {
		
		return dao.insertAccount(account);
	}

	@Override
	public Account getAccDetails(int acno) throws AccountException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAccount(Account account) throws AccountException {
		// TODO Auto-generated method stub
		return dao.insertAccount(account);
	}

}
