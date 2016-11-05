package thread;

public class DaemonThread extends Thread{

	public void run()
	{
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread is running");
		}
		else 
			System.out.println("User thread is running");
	}
	public static void main(String[] args)
	{
		DaemonThread dt1 = new DaemonThread();
		DaemonThread dt2 = new DaemonThread();
		dt1.setDaemon(true);
		dt1.start();
		dt2.start();
	}

}
