package com.lti.core.daos;

import java.util.Date;

import com.lti.core.entities.Transaction;
import com.lti.core.exceptions.UserException;

public interface TransactionDao {
	public String showTransactionDetails() throws UserException;
	public boolean debit() throws UserException;
	public boolean credit() throws UserException;
	public Transaction getTransactions(Date fromDate,Date toDate);
}
