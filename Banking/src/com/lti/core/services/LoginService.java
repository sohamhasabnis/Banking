package com.lti.core.services;

import java.util.List;

import com.lti.core.entities.Status;
import com.lti.core.exceptions.PassException;

public interface LoginService {
	public boolean validateUser(String userId);
	public boolean validateStatus(String userId);
	public boolean validatePassword(String userId,String password) throws PassException;
	public void addStatus(Status status);
	public long getAccount(String userId);
	public List<Status> getUsers(String status);
	public boolean updateStatus(String status, String userId);
}
