package thread;

public class threadsleep extends Thread
{
	
	public void run()
	{
		
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);  
			}
			System.out.println(i);
		}
	}	public static void main(String args[]) {
		
		threadsleep t1 = new threadsleep();
		threadsleep t2 = new threadsleep();
		
		System.out.println("Name of " +t1.getName());
		System.out.println("Name of " +t2.getName());
		t1.start();
		t2.start();
	//	t2.start();//we can not start same thread again 
	/*	t1.run();
		t2.run();
		try 
		{
			t1.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		} */
	}
}
