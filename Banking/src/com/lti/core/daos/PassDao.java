package com.lti.core.daos;

import com.lti.core.exceptions.PassException;

public interface PassDao {
public String getAccPassword(String userId) throws PassException;
public String getTransPassword(String userId) throws PassException;
}
