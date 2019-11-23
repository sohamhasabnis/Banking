package com.lti.core.services;

import com.lti.core.entities.Passwords;
import com.lti.core.exceptions.PassException;

public interface PasswordService {
	public boolean setPassword(Passwords pass) throws PassException;
}
