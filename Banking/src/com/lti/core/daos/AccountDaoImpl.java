package com.lti.core.daos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lti.core.exceptions.AccountException;

@Repository("Accountdao")
@Scope("singleton")
public class AccountDaoImpl implements AccountDao
{
	
	List<Account> Accounts;

	@Override
	public String getAccDetails() throws AccountException {
	
		return Accounts;
	}

	@Override
	public String getAccountType(String type) throws AccountException {
		
		return type;
	}

	@Override
	public int getAccountBalance(int balance) throws AccountException {
		
		return balance ;
	}
	

}
