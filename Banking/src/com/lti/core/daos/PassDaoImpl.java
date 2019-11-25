package com.lti.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.entities.Passwords;
import com.lti.core.exceptions.PassException;

@Repository("passDao")
@Scope("singleton")
public class PassDaoImpl implements PassDao {
@PersistenceContext
private EntityManager manager;
	public PassDaoImpl()  {
		
	}

	@Override
	public String getAccPassword(String userId) throws PassException {
		Query qry = manager.createQuery("Select e from pass e where e.userId=:arg1");
		qry.setParameter("arg1", userId);
		Passwords pass = (Passwords)qry.getSingleResult();
		return pass.getAccPassword();
	}

	@Override
	public String getTransPassword(String userId) throws PassException {
		Query qry = manager.createQuery("Select e from pass e where e.userId=:arg1");
		qry.setParameter("arg1", userId);
		Passwords pass = (Passwords)qry.getSingleResult();
		return pass.getTxnPassword();
	}

	@Override
	@Transactional
	public boolean setPassword(Passwords pass) throws PassException {
		manager.persist(pass);
		return true;
	}

	@Override
	public int updateLoginPassword(String accPassword,String userId) throws PassException {
		Query qry = manager.createQuery("update pass p set p.accPassword=:accpass where p.userId=:arguser");
		qry.setParameter("accpass", accPassword);
		qry.setParameter("arguser", userId);
		int rowsUpdate=qry.executeUpdate();
		return rowsUpdate;
	}

	@Override
	public int updateTransactionPassword(String transPassword,String userId) throws PassException {
		Query qry = manager.createQuery("update pass p set p.txnPassword=:txnpass where p.userId=:arguser");
		qry.setParameter("accpass", transPassword);
		qry.setParameter("arguser", userId);
		int rowsUpdate=qry.executeUpdate();
		return rowsUpdate;
	}
}
