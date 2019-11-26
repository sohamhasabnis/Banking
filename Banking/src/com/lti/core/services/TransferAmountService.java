package com.lti.core.services;

import com.lti.core.entities.Transaction;
import com.lti.core.exceptions.AccountException;

public interface TransferAmountService {
	public int transferAmount(long fromAcNo, long toAcNo, int balence,Transaction transaction,Transaction transaction2) throws AccountException ;
}
