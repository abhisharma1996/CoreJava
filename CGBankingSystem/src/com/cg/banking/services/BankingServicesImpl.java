package com.cg.banking.services;
import java.sql.SQLException;
import java.util.List;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.daoservices.AccountDAO;
import com.cg.banking.daoservices.AccountDAOServicesImpl;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;

public class BankingServicesImpl implements BankingServices {
		private static AccountDAO accountDAO= new AccountDAOServicesImpl();
	@Override
	public long openAccount(String accountType, float initBalance)
			throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException {
		
		Account account=new Account( accountType, initBalance);
		account.setAccountBalance(initBalance);
		if(account.getAccountBalance()<1000) throw new InvalidAmountException("Enter the right amount");
		if(!(account.getAccountType().equalsIgnoreCase("Savings")||account.getAccountType().equalsIgnoreCase("Current")))throw new InvalidAccountTypeException("Account Type Not Correct");
		else{
			account.setStatus("OPEN");
			try {
				account=accountDAO.save(account);
				return account.getAccountNo();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			
			return 0;
		
	}

	@Override
	public float depositAmount(long accountNo, float amount)
			throws AccountNotFoundException, BankingServicesDownException, AccountBlockedException {
		Account account=accountDAO.findOne(accountNo);
		if(account==null)throw new AccountNotFoundException("Account Not Found");
		else
			account.setTran(amount, "Deposit");
		account.setAccountBalance(account.getAccountBalance()+amount);
		return account.getAccountBalance();
	}

	@Override
	public float withdrawAmount(long accountNo, float amount, int pinNumber) throws InsufficientAmountException,
			AccountNotFoundException, InvalidPinNumberException, BankingServicesDownException, AccountBlockedException {
	Account acc=accountDAO.findOne(accountNo);
	if(acc==null)throw new AccountNotFoundException("Account Number Not Found");
	if(acc.getPinNumber()!=pinNumber) throw new InvalidPinNumberException("Pin Number is incorrect");
	if(acc.getAccountBalance()-amount<0)throw new InsufficientAmountException("Withdraw is Not possible");
	else
		acc.setTran(amount, "Withdraw");
		acc.setAccountBalance(acc.getAccountBalance()-amount);
			return acc.getAccountBalance();
		
	
	}

	@Override
	public boolean fundTransfer(long accountNoTo, long accountNoFrom, float transferAmount, int pinNumber)
			throws InsufficientAmountException, AccountNotFoundException, InvalidPinNumberException,
			BankingServicesDownException, AccountBlockedException {
		Account acc1=accountDAO.findOne(accountNoTo);
		Account acc2=accountDAO.findOne(accountNoFrom);
		if(acc2.getPinNumber()!=pinNumber)throw new InvalidPinNumberException("Pin Number Not Found") ;
		else
		acc1.setAccountBalance(acc1.getAccountBalance()+transferAmount);
		acc2.setAccountBalance(acc2.getAccountBalance()-transferAmount);
		return true;
	}

	@Override
	public Account getAccountDetails(long accountNo) throws AccountNotFoundException, BankingServicesDownException {
		if(accountDAO.findOne(accountNo)==null)throw new AccountNotFoundException("Account Not Found");
		return accountDAO.findOne(accountNo);
	}

	@Override
	public List<Account> getAllAccountDetails() throws BankingServicesDownException {
		
	return accountDAO.findAll();
	
	}

	@Override
	public List<Transaction> getAccountAllTransaction(long accountNo)
			throws BankingServicesDownException, AccountNotFoundException {
		Account acc=accountDAO.findOne(accountNo);
		if(acc==null)throw new AccountNotFoundException("Account Not Found");
		return acc.getTrans();
	}

	@Override
	public String accountStatus(long accountNo)
			throws BankingServicesDownException, AccountNotFoundException, AccountBlockedException {
			Account account =accountDAO.findOne(accountNo);
			if(!(account.getStatus().equalsIgnoreCase("OPEN"))) throw new AccountNotFoundException("Account not found");
			else
				return account.getStatus();
	}

}
