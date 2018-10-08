package com.cg.inheritance.client;

import com.cg.inheritance.beans.Employee;
import com.cg.inheritance.beans.PEmployee;

public class MainClass {

	public static void main(String[] args) {
		PEmployee emp1=new PEmployee(111, "arnav", "sharma", 12000, 62969);
		Employee emp=new Employee(111, "abhi", "sharma", 11000, 58698);
		PEmployee emptest =new PEmployee();
		emp1.setBasicSalary(11000);
		emp1.calculateTotalSalary();
		emptest.setFirstName("Rahul");
		/*System.out.println(emp.getTotalSalary());
		System.out.println(emp1.toString());*/
		System.out.println(emptest.getHra());
		System.out.println(emptest.getFirstName());
		}
}
