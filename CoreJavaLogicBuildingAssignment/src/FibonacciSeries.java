
public class FibonacciSeries {
	public static void main(String[] args) {
				int maxNumber = 10, previousNumber = 0, nextNumber = 1;
				System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
				for (int i = 1; i <= maxNumber; ++i){
					System.out.print(previousNumber+" ");
					int sum = previousNumber + nextNumber;
					previousNumber = nextNumber;
					nextNumber = sum;
				}
			}
		}



