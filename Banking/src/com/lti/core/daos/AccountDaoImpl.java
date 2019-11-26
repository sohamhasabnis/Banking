package com.lti.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.query.criteria.internal.compile.CriteriaQueryTypeQueryAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.exceptions.AccountException;
import com.lti.core.entities.Account;;

@Repository("accountDao")
@Scope("singleton")
public class AccountDaoImpl implements AccountDao
{
	@PersistenceContext
	EntityManager manager;
	
	@Override
	public Account getAccDetails(long acno) throws AccountException {
	Query qry = manager.createQuery("Select e from acc e where e.account_no=:arg1 ");
	qry.setParameter("arg1", acno);
	Account acc = (Account)qry.getSingleResult();
	return acc;
	}


	@Override
	public String getAccountType(long acno) throws AccountException {
		Query qry = manager.createQuery("Select e from acc e where e.account_no=:arg1 ");
		qry.setParameter("arg1", acno);
		Account acc = (Account)qry.getSingleResult();
		//return acc;
		
		return acc.getType();
	}

	@Override
	public int getAccountBalance(long acno) throws AccountException {
		Query qry = manager.createQuery("Select e from acc e where e.account_no=:arg1 ");
		qry.setParameter("arg1", acno);
		Account acc = (Account)qry.getSingleResult();
		return acc.getBalance();
	}


	@Override
	@Transactional
	public boolean insertAccount(Account account) throws AccountException {
		manager.persist(account);
		return true;
	}

	@Override
	@Transactional
	public boolean setAccountBalance(long acno, int amount,boolean flg) throws AccountException {
		// TODO Auto-generated method stub
		Account acc= getAccDetails(acno);
		if(flg)
			acc.setBalance(acc.getBalance()+amount);
		else
			acc.setBalance(acc.getBalance()-amount);
		manager.merge(acc);
		return true;
	}
}
