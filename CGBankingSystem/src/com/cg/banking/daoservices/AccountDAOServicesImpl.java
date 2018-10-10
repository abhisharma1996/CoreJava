package com.cg.banking.daoservices;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.banking.beans.Account;

public class AccountDAOServicesImpl implements AccountDAO {
	HashMap<Integer, Account> accounts=new HashMap<>();
	
	@Override
	public Account save(Account account) {
		accounts.put((int)account.getAccountNo(),account);
		return account;
	}

}
