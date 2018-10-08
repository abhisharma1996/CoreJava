import java.util.Scanner;

public class StringOperations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder str=new StringBuilder(s);
		System.out.println("1.Add the String to itself");
		System.out.println("2.Replace odd positions with #");
		System.out.println("3.Remove duplicate characters in the String");
		System.out.println("4.Change odd characters to uppercase");
		int num=sc.nextInt();
		switch(num){
		case 1:
			str=str.append(str);
			System.out.println(str);
			break;
		case 2:
			for (int i = 0; i < str.length(); i++)
				if(i%2!=0)
					str.setCharAt(i, '#');
					System.out.println(str);
					break;
		case 3:
			for (int i = 0; i < str.length(); i++){
				for (int j = i+1; j < str.length(); j++){ 
					if(str.charAt(i)==str.charAt(j))
						{str.deleteCharAt(j);
						 	j--;}
				
				}
				
		}
			System.out.println(str);
			break;
			/*for (int i = 0; i < str.length(); i++) 
				if(str.charAt(i)==str.charAt(i+1))
				str.deleteCharAt(i);
			
						System.out.println(str);*/
						
		case 4:
					StringBuilder b= new StringBuilder();
					for (int i = 0; i < str.length(); i++) {
						char c=str.charAt(i);
						if(i%2!=0)
							b.append(Character.toUpperCase(c));
						else
							b.append(c);
					}
					System.out.println(b);
					break;
					
		
					default:
					break;
				}
				
			}
			
}


