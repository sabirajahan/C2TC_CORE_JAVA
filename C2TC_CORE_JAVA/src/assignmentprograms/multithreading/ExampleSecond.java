package assignmentprograms.multithreading;

class FirstThread extends Thread
{ //First Thread t1
	
	@Override
	public void run()
	{
		int i=0;
		while(i<10) 
		{
		System.out.println("I am First Thread");
		}
	}
}

class SecondThread extends Thread
{ //Second Thread t2
	
	@Override
	public void run() 
	{
		int i=0;
		while(i<10)
		{
			System.out.println("I am Second Thread");
		}
	}
	
}


public class ExampleSecond
{

	public static void main(String[] args) 
	{
		FirstThread t1 = new FirstThread();
		SecondThread t2 = new SecondThread();
		
		t1.start();
		
		try {
			t1.join(); //Join method invoked
		} 
		catch (InterruptedException e)
		{
			System.out.println();
		}
		
		t2.start();


	}

}