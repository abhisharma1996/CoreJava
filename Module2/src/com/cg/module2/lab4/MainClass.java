package com.cg.module2.lab4;

public class MainClass {

	public static void main(String[] args) {
	Account a=new Account( 2000, new Person("Smith", 20));
	Account b=new Account( 3000, new Person("Kathy", 21));
	a.deposit(4000);
	System.out.println(a.getBalance());
	SavingsAccount s= new SavingsAccount(3000, new Person("Kathy", 21));
	s.withdraw(2200);
	System.out.println(s.getBalance());
	CurrentAccount c=new CurrentAccount(4000, new Person("Kathy", 21));
	c.withdraw(5000);
	System.out.println(c.getBalance());
	
	
	}
}
