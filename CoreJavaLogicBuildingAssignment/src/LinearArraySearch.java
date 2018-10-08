
public class LinearArraySearch {

	public static void main(String[] args) {
		int num[]={1,23,45,67,87};
		int x=2;
		int flag=0;
		for(int i=0;i<num.length;i++)
			if(num[i]==x){
				System.out.println("Desired Number is found at index "+i);
				flag=1;
				break;
			}
		if(flag==0)
			System.out.println("Number not found");
	}
}

