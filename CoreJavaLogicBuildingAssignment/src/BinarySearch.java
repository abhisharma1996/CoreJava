public class BinarySearch {
	public static void main(String[] args) {
		int arr[]={5,2,4,1,3};
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
		int a=0,b=arr.length-1,n=4;
		int mid;
		while(a<=b){
			mid=(a+b)/2;
			if(arr[mid]==n){
				System.out.println("The index is : "+mid);
				break;
			}
			if(arr[mid]>n)
				b=mid-1;
			else
				a=mid+1;
		}

	}

}
