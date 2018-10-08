public class DecimalToBinary {
	public static void main(String[] args) {
			int a;
			String x = "";
			int n=29;
			while(n >= 1){
				a = n % 2;
				x = a+ "" + x;
				n = n / 2;
			}
			System.out.println("Binary number : "+x);
		}
	}


