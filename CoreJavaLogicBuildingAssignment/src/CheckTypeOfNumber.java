public class CheckTypeOfNumber {
	static int even(int number)
	{
		if (number%2==0)
			return 1;
		else return 0;
	}
 
	static int odd(int number)
	{
		if (number%2==1)
			return 1;
		else return 0;
	}
 
	static int prime(int number)
	{
		for (int i=2;i<=number/2;i++)
		{
			if (number%i==0)
				return 0;
		}
		return 1;
	}
 
	static int palindrome(int number)
	{
		int original=number;
		int reverse=0;
		int remainder=0;
		while(original!=0)
		{
			remainder=original%10;
			reverse+=remainder;
			original/=10;
			reverse*=10;
		}
		reverse/=10;
 
		if(number==reverse)
			return 1;
		else return 0;
	}
	public static void main(String[] args) {
		int numbers[]={11,243,7,87,999,5911,111321};
		int even=0,prime=0,odd=0,palindrome=0;
 
		for(int i=0;i<numbers.length;i++){
			even+=even(numbers[i]);
			odd+=odd(numbers[i]);
			prime+=prime(numbers[i]);
			palindrome+=palindrome(numbers[i]);
		}
		System.out.println("even numbers are "+even);
		System.out.println("odd numbers are "+odd);
		System.out.println("prime numbers are "+prime);
		System.out.println("palindrome numbers are "+palindrome);
	}
}
