public class ThreadClass extends Thread {

	public ThreadClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		if(this.getName().equals("Even"))	
			for(int i=2;i<=100;i=i+2)
				System.out.println("Even : "+i);
		else if(this.getName().equals("Odd"))	
			for(int i=1;i<100;i=i+2)
				System.out.println("Odd : "+i);
	}
}



