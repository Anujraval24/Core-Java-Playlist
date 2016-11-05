package thread;

public class Createthread1 implements Runnable { //Thread implements using Runnable interface
	
	public void run(){
		
		System.out.println("Thread running by implementing Runnable interface");
	}
	
	public static void main(String args [])
	{
		Createthread1 ct1 = new Createthread1();
		Thread t1 = new Thread(ct1);
		t1.start();
		
		
	}
	

}
