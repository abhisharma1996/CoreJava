package com.cg.module2.lab4;

public class CurrentAccount extends Account{
	private final int overdraftlimit=5000;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, Person accountHolder) {
		super(balance, accountHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double w) {
		// TODO Auto-generated method stub
		super.withdraw(w);
		if(w>overdraftlimit)
			this.balance+=w;
			System.out.println("Overdraft Limit exceeded");
		
	}
  
	
	

}
