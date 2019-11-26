package com.lti.core.daos;

import java.util.List;

import com.lti.core.entities.Status;

public interface StatusDao {
	public String getUserId(String userId);
	public String getStatus(String userId);
	public long getAccount(String userId);
	public boolean setStatusLog(Status status);
	public List<Status> getUser(String status);
	public boolean updateStatus(String status,String userId);
}
