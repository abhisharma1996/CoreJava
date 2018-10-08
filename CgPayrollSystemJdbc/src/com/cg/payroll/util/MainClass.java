package com.cg.payroll.util;

public class MainClass {

	public static void main(String[] args) {
	if(ConnectionProvider.getDBConnection()!=null)
		System.out.println("Connection Open");
	else
		System.out.println("Connection Closed");

	}

}
