package com.lti.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.core.daos.PassDao;
import com.lti.core.daos.StatusDao;
import com.lti.core.entities.Status;
import com.lti.core.exceptions.PassException;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	StatusDao dao;
	
	@Autowired
	PassDao passDao;
	
	public LoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateUser(String userId) {
		String user = dao.getUserId(userId);
		if(user.equals("") || user == null)
			return false;
		return true;
	}

	@Override
	public boolean validateStatus(String userId) {
		String status = dao.getStatus(userId);
		if(status.equals("lock") ||status.equals("processing"))
			return false;
		return true;
	}

	@Override
	@Transactional
	public void addStatus(Status status) {
		dao.setStatusLog(status);
	}

	@Override
	public boolean validatePassword(String userId, String password) throws PassException {
		String pass = passDao.getAccPassword(userId);
		if(pass.equals(password))
			return true;
		return false;
	}

	@Override
	public long getAccount(String userId) {
		return dao.getAccount(userId);
	}

	@Override
	public List<Status> getUsers(String status) {
		// TODO Auto-generated method stub
		return dao.getUser(status);
	}

	@Override
	public boolean updateStatus(String status, String userId) {
		// TODO Auto-generated method stub
		return dao.updateStatus(status, userId);
	}
}
