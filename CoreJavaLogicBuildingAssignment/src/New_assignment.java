public class New_assignment {
	public static void main(String[] args) {
		int []num={1,5,3,3,4,7};
		boolean a=solution(num);
		if(a==true)
			System.out.println("False");
		else
			System.out.println("True");
		
	}

public static boolean solution (int[] A){
int i,j = 0,k=0,temp=0;
int count=0,t=0,q=0;
for(i=0,j=1;i<A.length-1&&j>i;i++,j++){
	if(A[i]<A[j])
		continue;
	else{
		for(k=j+1;k<A.length-1;k++){
			if(A[k+1]<A[k])
				continue;
			else{
				temp=A[i];
				A[i]=A[k];
				A[k]=temp;
				t=1;
				break;
			}
			}
		}
}
	for(i=0;i<A.length;i++){
		if(A[i]<A[i+1])
			continue;
		else
			q=1;
		break;
	}


		if(q==0||t==0)
			return true;
		else
			return false;
	}
}