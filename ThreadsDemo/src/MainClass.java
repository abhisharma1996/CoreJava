
public class MainClass {

	public static void main(String[] args) {
		Runnable r1=new RunnableResorce();
		Thread th1=new Thread(r1,"Odd");
		Thread th2=new Thread(r1,"Even");
		th1.start();
		th2.start();

	}

}
