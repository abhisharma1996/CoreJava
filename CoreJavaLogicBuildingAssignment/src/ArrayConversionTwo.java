public class ArrayConversionTwo {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int k=0,j=0;
		System.out.print("{");
		for(k=0,j=arr.length-1;j>0&&k<j;k++,j--){
					System.out.print(arr[j]);
					System.out.print(",");
					System.out.print(arr[k]);
					if(k+1!=j)
					System.out.print(",");
			}
					System.out.print("}");
	}
}
