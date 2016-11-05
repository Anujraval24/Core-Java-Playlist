package thread;

public class ThreadPriority extends Thread {

	private static ThreadPriority tp = new ThreadPriority();
	private ThreadPriority(){}
	public void run()
	{
		System.out.println("Running Thread name --> "+Thread.currentThread().getName());
		System.out.println("Running Thread Priority -->"+Thread.currentThread().getPriority());
	}
	
	
	public static void main(String args[])
	{
		 ThreadPriority t1 = new ThreadPriority();
		 ThreadPriority t2 = new ThreadPriority();
		 t1.setPriority(Thread.MIN_PRIORITY);
		 t2.setPriority(Thread.MAX_PRIORITY);
		 t1.start();
		 t2.start();
	}
	
	public static ThreadPriority getInstance(){
		return tp;
	}
}
