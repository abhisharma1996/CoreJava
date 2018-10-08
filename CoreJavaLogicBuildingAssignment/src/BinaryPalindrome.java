public class BinaryPalindrome {
	static int reverse(int num){
		int rev=0;
		while(num!=0){
			rev+=num%10;
			num/=10;
			rev*=10;
		}
		return rev/10;
	}
 
	static int binary(int num){
		int bin=0;
		while (num!=0){
			bin=bin+num%2;
			num/=2;
			bin*=10;
		}
		return reverse(bin/10);
 }
	public static void main(String[] args) {
		int num=27;
		int binaryNumber=binary(num);
		int reverseBinary=reverse(binaryNumber);
 
		if (reverseBinary==binaryNumber)
			System.out.println("Binary Number is palindrome");
		else 
			System.out.println("Binary Number is not palindrome");
	}
}
