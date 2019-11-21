package com.lti.core.daos;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lti.core.entities.User;
import com.lti.core.exceptions.PassException;
import com.lti.core.exceptions.UserException;

@Repository("UserDao")
@Scope("singleton")
public class UserDaoImpl implements UserDao {

@PersistenceContext
private EntityManager manager;

	@Autowired
	PassDaoImpl pass;
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean insertUser(User user) throws UserException {
		manager.persist(user);
		return true;
	}

	@Override
	public User getUser(String userId) throws UserException {
	Query qry = manager.createQuery("select u from users where u.userId=:arg1");
	qry.setParameter("arg1",userId);
	User user =(User)qry.getSingleResult();
		return user;
	}

	@Override
	public String getPassword(String userId) throws UserException,PassException {
		return pass.getAccPassword(userId);
		
	}

	@Override
	public boolean updateUser(User user) throws UserException {
		manager.merge(user);
		return true;
	}

}
