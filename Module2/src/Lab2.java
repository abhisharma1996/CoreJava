import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Lab2 {

	public static void main(String[] args) {
		/* 2.1
		 System.out.println("Person Details");
		System.out.println("____________");
		System.out.println();
		System.out.print("First Name: ");
		System.out.println("Divya");
		System.out.print("Last Name: ");
		System.out.println("Bharathi");
		System.out.print("Gender: ");
		System.out.println("F");
		System.out.print("Age: ");
		System.out.println(20);
		System.out.print("Weight: ");
		System.out.println(85.55);*/
		
		
	
	/*2.2
	 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num>0)
			System.out.println("Input Number is Positive");
		else
			System.out.println("Input Number is Negative");*/
		
	
		/*3.7
		 Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int d=st.length();
		int c=0;
		StringBuilder s=new StringBuilder(st);
		StringBuilder t=new StringBuilder("_job");
		int a=t.length();
		for (int i = s.length()-a, j=0; i < s.length()&&j<t.length(); i++,j++) {
			if(t.charAt(j)==(st.charAt(i))){
				c++;
			    d--;
			}
		}
		if(c==a&&d>=8)
			System.out.println("True");
		else
			System.out.println("False");

		*/
		
		ArrayList<String> arr= new ArrayList<>();
		arr.add("zoRA");
		arr.add("arnav");
		arr.add("nIKhil");
		arr.add("abhi");
		arr.add("flint");
		Collections.sort(arr);
		/*for (String string : arr) {
			System.out.println(string);
		}*/
		
		if((arr.size())%2==0){   
			for (int i = 0; i < arr.size()/2; i++){
			arr.set(i, arr.get(i).toUpperCase());
			}
			for (int i = arr.size()/2; i <arr.size() ; i++)
			arr.set(i,arr.get(i).toLowerCase());
		}
		else{
			for (int i = 0; i < arr.size()/2+1; i++) {
				arr.set(i, arr.get(i).toUpperCase());
				}
			for (int i = arr.size()/2+1; i <arr.size() ; i++)
				arr.set(i,arr.get(i).toLowerCase());
		}
	
		System.out.println(arr);
	}		
}


