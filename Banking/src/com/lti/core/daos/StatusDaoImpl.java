package com.lti.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.entities.Status;

@Repository("statusDao")
@Scope("singleton")
public class StatusDaoImpl implements StatusDao {

	@PersistenceContext
	EntityManager manager;
	public StatusDaoImpl()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getUserId(String userId) {
		Query qry = manager.createQuery("select s from status101 s where s.userId=:arg1");
		qry.setParameter("arg1", userId);
		Status sts = (Status)qry.getSingleResult();
		return sts.getUserId();
	}

	@Override
	public String getStatus(String userId) {
		Query qry = manager.createQuery("select s from status101 s where s.userId=:arg1");
		qry.setParameter("arg1", userId);
		Status sts = (Status)qry.getSingleResult();
		return sts.getStatus();
	}
	
	@Override
	public boolean setStatusLog(Status status) {
		manager.persist(status);
		return true;
	}

	@Override
	public long getAccount(String userId) {
		Query qry = manager.createQuery("select s from status101 s where s.userId=:arg1");
		qry.setParameter("arg1", userId);
		Status sts = (Status)qry.getSingleResult();
		return sts.getAccount_no();
	}

	@Override
	public List<Status> getUser(String status) {
		List<Status> list= new ArrayList<>();
		Query qry = manager.createQuery("select s from status101 s where s.status=:arg1");
		qry.setParameter("arg1", status);
		list = qry.getResultList();
		
		return list;
	}

	@Override
	@Transactional
	public boolean updateStatus(String status,String userId) {
		// TODO Auto-generated method stub
		Query qry = manager.createQuery("update status101 s set s.status=:arg1 where s.userId=:arg2 ");
		qry.setParameter("arg1",status);
		qry.setParameter("arg2", userId);
		return true;
	}
}