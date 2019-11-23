package com.lti.core.daos;

import java.util.List;

import com.lti.core.entities.Account;
import com.lti.core.exceptions.AccountException;
import com.lti.core.exceptions.UserException;

public interface AccountDao 
{
	public boolean insertAccount(Account account) throws AccountException;
	public Account getAccDetails(int acno) throws AccountException;
	public String getAccountType(int acno) throws AccountException;
	public int getAccountBalance(int acno) throws AccountException;
	
}
