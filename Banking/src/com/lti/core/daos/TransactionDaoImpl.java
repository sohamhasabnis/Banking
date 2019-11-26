package com.lti.core.daos;
import com.lti.core.daos.AccountDao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.entities.Account;
import com.lti.core.entities.Transaction;
//import com.lti.core.exceptions.TransactionException;

@Repository("Transactiondao")
@Scope("singleton")
public class TransactionDaoImpl implements TransactionDao{
	@PersistenceContext
	EntityManager manager;

	@Override
	@Transactional
	public boolean addTransaction(Transaction transaction) {
		manager.persist(transaction);
		return true;
	}

	@Override
	public List<Transaction> getTransactions(Date fromDate,Date toDate,long account_no) {
		Query qry = manager.createQuery("select t from trans t where t.date_of_Transaction = :date1 and t.account_no=:acc_no");
		qry.setParameter("date1", fromDate);
	//	qry.setParameter("date2", toDate);
		qry.setParameter("acc_no", account_no);
		List<Transaction> transactions = qry.getResultList();
		return transactions;
	}
}