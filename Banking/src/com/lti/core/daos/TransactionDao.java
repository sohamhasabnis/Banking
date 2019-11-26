package com.lti.core.daos;

import java.util.Date;
import java.util.List;

import com.lti.core.entities.Transaction;
import com.lti.core.exceptions.UserException;

public interface TransactionDao {
	public boolean addTransaction(Transaction transaction);
	public List<Transaction> getTransactions(Date fromDate,Date toDate, long account_no);
}
