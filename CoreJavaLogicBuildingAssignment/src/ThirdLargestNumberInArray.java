public class ThirdLargestNumberInArray {
	public static void main(String[] args) {
		int arr[]={1,1,2,2,3,4,5,5,5};
		int count=0;
		for(int i = arr.length-1;i>=0;i--){
			if(arr[i]==arr[i-1])
				continue;
			else{
				count++;
				if(count==2){
					System.out.println(arr[i-1]);
					break;
				}
				else 
					continue;
			}
		}
	}
}
