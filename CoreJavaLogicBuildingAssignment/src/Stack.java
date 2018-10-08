public class Stack {
	static void push(int arr[],int position,int value){
		int len=arr.length;
			if(position>=len){
				System.out.println("Stack is full");
				return;
		}
		arr[position]=value;
		return; 
	}
 
	static int pop(int arr[],int position){
		if (position<0){
			System.out.println("Stack is empty");
			return -1;
		}
		int value =arr[position];
		return value;
	}
	public static void main(String[] args) {
		int stack[] = new int[10];
		int position=0;
		push(stack,position++,10);
		push(stack,position++,20);
		push(stack,position++,30);
		System.out.println(pop(stack,--position));
		System.out.println(pop(stack,--position));
		System.out.println(pop(stack,--position));
		System.out.println(pop(stack,--position));
		}
}
