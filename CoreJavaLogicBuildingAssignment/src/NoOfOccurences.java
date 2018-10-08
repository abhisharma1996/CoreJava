public class NoOfOccurences {
	public static void main(String[] args) {
		int num[]={1,1,2,3,4,2,5,6,7,7,7,7};
		int t[]=new int[num.length];
		int count=0;
		for(int i=0;i<num.length;i++){
			if (t[i]==1)
				continue;
			for(int j=i+1;j<num.length;j++){
				if(num[j]==num[i]){
					count++;
					t[j]=1;
				}
			}
			System.out.println("The number of occurences of "+num[i]+" is "+(count+1));
			count=0;
		}
	}
}

