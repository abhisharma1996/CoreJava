public class Factorial {
	static int factorial(int num){
			if (num==0||num==1)
				return 1;
			return num*factorial(num-1);
		}
	public static void main(String[] args) {
		int x=6;
		int fact=factorial(x);
			System.out.println("Factorial of "+x+" is "+fact);
	}
}
