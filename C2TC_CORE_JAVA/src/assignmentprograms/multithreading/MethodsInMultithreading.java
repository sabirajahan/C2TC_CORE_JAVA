package assignmentprograms.multithreading;

class MyChildThread extends Thread
{ //Thread
	
	@Override
	public void run() 
	{
		for(int i=0; i<10; i++) 
		{
			System.out.println("I am Child Thread");
			Thread.yield(); //yield method invoked
		}
	}
}

public class MethodsInMultithreading 
{

	public static void main(String[] args) 
	{ //Main thread
		MyChildThread t = new MyChildThread();
		t.start();
		
		for(int i=0; i<10; i++) 
		{
			System.out.println("I am Main Thread");
		}

	}

}
