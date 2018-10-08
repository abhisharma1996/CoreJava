package com.cg.inheritance.beans;

public class PEmployee extends Employee{
	int hra,ta,da;

	public PEmployee() {
		
	}

	public PEmployee(int hra, int ta, int da) {
		this.hra = hra;
		this.ta = ta;
		this.da = da;
	}

	public PEmployee(int employeeId, String firstName, String lastName,
			int basicSalary, int totalSalary) {
		super(employeeId, firstName, lastName, basicSalary, totalSalary);
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getTa() {
		return ta;
	}

	public void setTa(int ta) {
		this.ta = ta;
	}

	public int getDa() {
		return da;
	}

	public void setDa(int da) {
		this.da = da;
	}
	
	 /*public String toString(){
		return (super.toString()+"hra"+hra+",ta"+ta+",da="+da);
	}*/

	
	/*public void calculateTotalSalary() {
		hra=(this.getBasicSalary()*10)/100;
		da=(this.getBasicSalary()*10)/100;
		ta=(this.getBasicSalary()*10)/100;
		this.setTotalSalary(getBasicSalary()*4);}*/
}
