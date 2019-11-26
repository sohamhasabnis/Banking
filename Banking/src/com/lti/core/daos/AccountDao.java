package com.lti.core.daos;

import com.lti.core.entities.Account;
import com.lti.core.exceptions.AccountException;

public interface AccountDao 
{
	public boolean insertAccount(Account account) throws AccountException;
	public Account getAccDetails(long toAcNo) throws AccountException;
	public String getAccountType(long acno) throws AccountException;
	public int getAccountBalance(long acno) throws AccountException;
	public boolean setAccountBalance(long acno,int amount,boolean flg) throws AccountException;
}