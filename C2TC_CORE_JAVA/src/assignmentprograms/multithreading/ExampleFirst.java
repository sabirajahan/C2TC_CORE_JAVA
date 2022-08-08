//Invoking yield method 

package assignmentprograms.multithreading;

class HelloThread implements Runnable
{ //Thread 

	@Override
	public void run() 
	{
		for(int i=0; i<20; i++) 
		{
		System.out.println("Hello Good Morning");
		}
	}
	
}


public class ExampleFirst 
{

	public static void main(String[] args) 
	{ //Main thread
		HelloThread thr = new HelloThread();
		Thread t = new Thread(thr);
		t.start();
		
		for(int i=0; i<20; i++) 
		{
			System.out.println("Welcome");
			Thread.yield(); //yield method invoked
		}

	}

}