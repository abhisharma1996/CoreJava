import java.util.Scanner;


public class PositiveOrNegativeString {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String st=s.nextLine();
		StringBuilder sb= new StringBuilder(st);
		int c=0;
		
		for(int i=0,j=i+1;i<j&&j<sb.length();i++,j++){
			int a=(int)(sb.charAt(i));
			int b=(int)(sb.charAt(j));
			c++;
			if(a<b||a==b)
				continue;
			else
				System.out.println("Negative Number");
				break;
		}
		if(c==sb.length()-1)
		System.out.println("Positive Number");

	}

}
