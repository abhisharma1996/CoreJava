public class OneTwoThreeDigitNumbers {
	public static void main(String []args){
		int []num={1,23,456,7,8,9,123};
		int i;
		int count=0,count1=0,count2=0;
		for(i=0;i<num.length;i++){
			if(num[i]/10==0)
				count++;
			else if (num[i]/100==0)
				count1++;
			else
				count2++;
		}
		System.out.println("Number of one digit numbers are : "+count);
		System.out.println("Number of two digit numbers are : "+count1);
		System.out.println("Number of three digit numbers are : "+count2);
	}
 }
	

