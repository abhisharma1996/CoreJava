import java.util.Scanner;

import com.cg.person.exceptions.FirstNameNullException;
import com.cg.person.exceptions.LastNameNullException;

enum Gender{
	M,F;
}

public class PersonClass {
	private String firstName,lastName;
	private Gender gender;
	private long phno;
	@Override
	public String toString() {
		return "PersonClass [firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", phno=" + phno + "]";
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public PersonClass() {
		super();
	}
	public PersonClass(String firstName, String lastName, Gender gender)throws FirstNameNullException,LastNameNullException {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		if(firstName==null ||firstName.equals(""))
			throw new FirstNameNullException("First Name Not Available");
		if(lastName==null||lastName.equals(""))
				throw new LastNameNullException("Last Name Not Available");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void show(){
		 	System.out.println("Person Details");
			System.out.println("____________");
			System.out.println();
			System.out.println("First Name: "+firstName);
			System.out.println("Last Name: "+lastName);
			System.out.println("Gender: "+gender);
	}
	public void display(){
		 System.out.println(toString());
	}
	public long phoneEntry(){
		System.out.println("Enter the Phone Number");
		Scanner sc=new Scanner(System.in);
		long phno=sc.nextLong();
		return phno;
	}
	
}
