import java.util.Arrays;
import java.util.Collections;
public class HighestNumberMadeUpOfNumber {
	public static void main(String[] args) {
		int number = 34617,  i = 0;
		int extra = number;
		int[] numList = new int[5];
		while(number!=0){
			numList[i] = number%10;
			number/=10;
			i++;
		}
		System.out.print("Highest number: ");
		for (int element: numList){
			System.out.print(element);
		}
		Arrays.sort(numList);
		System.out.println("");
		System.out.print("Smallest number: ");
		for (int element: numList){
			System.out.print(element);
		}
	}
}
