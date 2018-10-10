package com.cg.banking.main;

import com.cg.banking.beans.Account;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;

public class MainClass {
	public static void main(String[] args)  {
		BankingServices bankservices=new BankingServicesImpl();
		BankingServices bankservices2=new BankingServicesImpl();
		Account account=new Account();
		System.out.println(account.getAccountBalance());
		try {
			System.out.println(bankservices.depositAmount(bankservices.openAccount("Savings", 1000), 4000));
		} catch (AccountNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (BankingServicesDownException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (AccountBlockedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalidAmountException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvalidAccountTypeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
			/*try {
				System.out.println(bankservices.openAccount("Savings", 1000));
				System.out.println(bankservices.openAccount("Current", 1000));
				} catch (InvalidAccountTypeException e) {
				e.printStackTrace();
			} catch (BankingServicesDownException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				catch (InvalidAmountException e) {
			e.printStackTrace();
		}*/
		
	}
}
