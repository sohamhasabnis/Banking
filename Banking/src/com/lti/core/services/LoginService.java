package com.lti.core.services;

import com.lti.core.entities.Status;
import com.lti.core.exceptions.PassException;

public interface LoginService {
	public boolean validateUser(String userId);
	public boolean validateStatus(String userId);
	public boolean validatePassword(String userId,String password) throws PassException;
	public void addStatus(Status status);
}
