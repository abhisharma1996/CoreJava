public class ArrayConversion{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9};
		int k=0,j=0;
		System.out.print("{");
		for(k=0,j=arr.length-1;j>0&&k<=j;k++,j--){
					System.out.print(arr[j]);
						if(k==j)
						break;
					System.out.print(",");
					System.out.print(arr[k]);
					System.out.print(",");
			}
					System.out.print("}");
	}
}
