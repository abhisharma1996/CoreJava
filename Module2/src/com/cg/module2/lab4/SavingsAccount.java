package com.cg.module2.lab4;

class SavingsAccount extends Account{
			final private double minimumbalance=500;

			public SavingsAccount(double balance, Person accountHolder) {
				super(balance, accountHolder);
				// TODO Auto-generated constructor stub
			}

			@Override
			public void withdraw(double w) {
				this.balance=balance-w;
				if(this.balance<minimumbalance){
					this.balance = balance+w;
					System.out.println("Limit Exceeded");
					
				}
			}

}
