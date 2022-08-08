package assignmentprograms.multithreading;

class MyTest extends Thread
{    //MyTest Thread
	
	@Override
	public void run() 
	{
		if(Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread");
		}
		else 
		{
			System.out.println("Child thread");
		}
	}
}

public class ThreadMethodsSecond 
{

	public static void main(String[] args)
	{  // Main Thread
		System.out.println("I am Main thread"); 
		System.out.println(Thread.currentThread().isDaemon()); 
		
		MyTest d = new MyTest();
		d.setDaemon(true); 
		d.start();
		System.out.println(d.isDaemon()); 		
	}
}
