
public class RunnableResorce implements Runnable{

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		if(t.getName().equals("Odd"))
			for(int i=2;i<=100;i=i+2)
				System.out.println("Even : "+i);
		else if(t.getName().equals("Odd"))	
			for(int i=1;i<100;i=i+2)
				System.out.println("Odd : "+i);
		
	}
	

}
