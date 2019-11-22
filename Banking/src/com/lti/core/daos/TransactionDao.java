package com.lti.core.daos;

import com.lti.core.exceptions.UserException;

public interface TransactionDao {
	public String showTransactionDetails() throws UserException;
	public boolean debit() throws UserException;
	public boolean credit() throws UserException;

}
