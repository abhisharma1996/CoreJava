public class HCFAndLCM {
	static int HCF(int first,int second){
		int value=(first<second?first:second);
			for (int i=value;i>=1;i--){
				if (first%i==0&&second%i==0)
					return i;
		}
					return 1;
}
 
 static int LCM(int first,int second){
		int value=(first>second?first:second);
			for(int i=value;i<=first*second;i++){
				if (i%first==0&&i%second==0)
					return i;
		}
					return first*second;
	}
 
 public static void main(String[] args) {
	 int x=7;int y=5;
	 	System.out.println(HCF(x,y));
		System.out.println(LCM(x,y));
	}
 }
	


