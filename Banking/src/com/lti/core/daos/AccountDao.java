package com.lti.core.daos;

import java.util.List;

import com.lti.core.entities.Account;
import com.lti.core.exceptions.AccountException;
import com.lti.core.exceptions.UserException;

public interface AccountDao 
{
	public List<Account> getAccDetails() throws AccountException;
	public String getAccountType(String type) throws AccountException;
	public int getAccountBalance(int Balance) throws AccountException;
}
