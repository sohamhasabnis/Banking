package com.lti.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.UserDaoImpl;
import com.lti.core.entities.User;
import com.lti.core.exceptions.UserException;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDaoImpl dao;
	public UserServiceImpl()  {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User getUser(String userId) throws UserException {
		// TODO Auto-generated method stub
		return dao.getUser("3ABC78");
	}

}
