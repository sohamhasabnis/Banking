package com.lti.core.services;

import com.lti.core.entities.Account;
import com.lti.core.exceptions.AccountException;

public interface AccountService {
	public  boolean setAccount(Account account) throws AccountException;
	public Account getAccDetails(int acno) throws AccountException;
	public boolean addAccount(Account account) throws AccountException;
	
}
