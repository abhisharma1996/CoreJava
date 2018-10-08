public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int first=45;
		int second=60;
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("First Number is "+first);
		System.out.println("Second Number is "+second);
	}
}
