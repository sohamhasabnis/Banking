package com.lti.core.services;

import com.lti.core.entities.User;
import com.lti.core.exceptions.UserException;

public interface UserService {
 
	public User getUser(String userId) throws UserException;
}
