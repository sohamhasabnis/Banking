package com.lti.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.AccountDao;
import com.lti.core.entities.Transaction;
import com.lti.core.exceptions.AccountException;

@Service("tranService")
public class TransferAmountServiceImpl implements TransferAmountService {

	@Autowired
	AccountDao dao;
	
	@Autowired
	TransactionService service;
	public TransferAmountServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int transferAmount(long fromAcNo, long toAcNo,int amount, Transaction transaction, Transaction transaction2) throws AccountException {
			int bal = dao.getAccountBalance(fromAcNo);
			if(dao.getAccDetails(toAcNo)==null)
				return -2;
			if(bal< amount)
				return -1;
			
			service.addTransactions(transaction);
			service.addTransactions(transaction2);
			dao.setAccountBalance(fromAcNo, amount, false);
			dao.setAccountBalance(toAcNo, amount, true);
		return 1;
	}
}
