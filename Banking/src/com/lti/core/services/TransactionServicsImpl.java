package com.lti.core.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.TransactionDao;
import com.lti.core.entities.Transaction;

@Service("transactionService")
public class TransactionServicsImpl implements TransactionService {

	@Autowired
	TransactionDao dao;
	
	@Override
	public boolean addTransactions(Transaction transaction) {
		dao.addTransaction(transaction);
		return true;
	}

	@Override
	public List<Transaction> getTransactions(Date fromDate, Date toDate, long account_no) {
		List<Transaction> transactions = dao.getTransactions(fromDate, toDate, account_no);
		return transactions;
	}
}