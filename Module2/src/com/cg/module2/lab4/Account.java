package com.cg.module2.lab4;

public class Account {
	 static long accNum=101406013;
	 double balance;
	Person accountHolder;
	
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Account( double balance, Person accountHolder) {
			super();
			accNum++;
			this.balance = balance;
			this.accountHolder = accountHolder;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getBalance() {
			return balance;
		}
			
		public Person getAccountHolder() {
			return accountHolder;
		}

		public void setAccountHolder(Person accountHolder) {
			this.accountHolder = accountHolder;
		}

		@Override
		public String toString() {
			return "Account [accNum=" + accNum+  ", balance=" + balance
					+ ", accountHolder=" + accountHolder + "]";
		}
		
		public void deposit(double d){
			this.balance=balance+d;
		}
		
		public void withdraw(double w){
			this.balance=balance-w ;
		}
}
