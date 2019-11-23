package com.lti.core.daos;

import com.lti.core.entities.User;
import com.lti.core.exceptions.UserException;

public interface UserDao {
	public boolean insertUser(User user) throws UserException;
	public User getUser(String userId) throws UserException;
	//public boolean getStatus(String userId) throws UserException;
	public String getPassword(String userId) throws UserException;
	public boolean updateUser(User user) throws UserException;
	
}
