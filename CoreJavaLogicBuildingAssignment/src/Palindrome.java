public class Palindrome {
	public static void main(String[] args) {
		int num = 1443, reversedNumber = 0, remainder, originalNumber;
		originalNumber = num;
		while( num != 0 ){
            remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num  /= 10;
        }
        if (originalNumber == reversedNumber)
            System.out.println(originalNumber + " is a palindrome.");
        else
            System.out.println(originalNumber+ " is not a palindrome.");
    }
}

