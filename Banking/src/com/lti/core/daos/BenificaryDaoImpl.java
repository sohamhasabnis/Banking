package com.lti.core.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.entities.Benificary;

@Repository("beneDao")
@Scope("singleton")
public class BenificaryDaoImpl implements BenificaryDao{

	@PersistenceContext
	EntityManager manager;
	public BenificaryDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public boolean insertBenificary(Benificary benificary) {
		manager.persist(benificary);
		return true;
	}

	@Override
	public int getBenficary(long account_no,String name) {
		Query qry = manager.createQuery("select b. toAcNo  from benf where b.fromAcNo=:account_no and b.b_name=:na");
		qry.setParameter("account_no", account_no);
		qry.setParameter("na", name);
		return (int)qry.getSingleResult();
	}
}
