package com.cg.banking.daoservices;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.banking.beans.Account;

public interface AccountDAO {
	Account  save(Account account) throws SQLException;
Account findOne(long accountNo);
	ArrayList<Account> findAll();
}