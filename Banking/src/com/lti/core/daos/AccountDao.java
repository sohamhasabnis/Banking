package com.lti.core.daos;

import com.lti.core.entities.Account;
import com.lti.core.exceptions.AccountException;

public interface AccountDao 
{
	public boolean insertAccount(Account account) throws AccountException;
	public Account getAccDetails(int acno) throws AccountException;
	public String getAccountType(int acno) throws AccountException;
	public int getAccountBalance(int acno) throws AccountException;
	public boolean setAccountBalance(int acno,int amount,boolean flg) throws AccountException;
}