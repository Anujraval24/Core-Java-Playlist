package thread;

public class Createthread extends Thread{ //using extends thread
 
	public void run(){
		System.out.println("Thread running by Extending thread...");
	}
	public static void main(String[] args) 
	{
		Createthread t1 = new Createthread();
		t1.start();
		
	}

}
