package com.lti.core.services;
import java.util.Date;
import java.util.List;

import com.lti.core.entities.Transaction;

public interface TransactionService {
	public boolean addTransactions(Transaction transaction);
	public List<Transaction> getTransactions(Date fromDate,Date toDate,long account_no);
}
