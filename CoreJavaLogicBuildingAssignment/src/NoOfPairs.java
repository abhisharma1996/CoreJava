public class NoOfPairs {

	public static void main(String[] args) {
		int []a={3,5,6,3,3,5};
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(i<j && a[i]==a[j]){
					count++;
				}
			}
			}
		System.out.println(count);

	}

}
