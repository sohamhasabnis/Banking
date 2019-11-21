package com.lti.core.daos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lti.core.entities.User;
import com.lti.core.exceptions.UserException;

@Repository("UserDao")
@Scope("singleton")
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean insertUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(String userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword(String userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return false;
	}

}
