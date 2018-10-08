package com.cg.payroll.client;
 
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.exceptions.PayrollServicesDownException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
 
public class MainClass {
	public static void main(String[] args) {
 
		PayrollServices payrollServices=new PayrollServicesImpl(); 
		try {
			payrollServices.acceptAssociateDetails("Abhishek", "Sharma", "a@gmail.com", "ADM", "SR.Con", "GLNPS2442Q", 11000, 12000, 2000, 2000, 58480980, "Citi", "6932642");
		} catch (PayrollServicesDownException e) {
			e.printStackTrace();
			System.out.println("Payroll Services has down");
		}
		try {
			System.out.println("Net Salary : " + payrollServices.calculateNetSalary(101));
		} catch (AssociateDetailsNotFoundException
				| PayrollServicesDownException e) {
			e.printStackTrace();
			System.out.println("Associate Detail Not Found");
 
		}
 
		try {
			payrollServices.getAssociateDetails(101);
		} catch (PayrollServicesDownException e) {
			System.out.println("Payroll Services has down");
			e.printStackTrace();
		} catch (AssociateDetailsNotFoundException e) {
			System.out.println("Associate Detail Not Found");
			e.printStackTrace();
		}
 
		try {
			payrollServices.getAllAssociatesDetails();
		} catch (PayrollServicesDownException e) {
			System.out.println("Payroll Services has down");
			e.printStackTrace();
		}
	}
}