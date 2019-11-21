package com.lti.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lti.core.entities.Passwords;
import com.lti.core.exceptions.PassException;

@Repository("PassDao")
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
}
