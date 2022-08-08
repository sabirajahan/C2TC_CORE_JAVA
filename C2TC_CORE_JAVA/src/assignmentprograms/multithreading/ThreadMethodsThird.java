package assignmentprograms.multithreading;

class NewTest implements Runnable
{ //NewTest Thread

	@Override
	public void run() 
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("I am NewTest thread");
		}
	}
	
}

class ChildTest implements Runnable
{  //ChildTest Thread 2

	@Override
	public void run() 
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("I am ChildTest thread");
		}	
	}
	
}

public class ThreadMethodsThird 
{

	public static void main(String[] args) 
	{
		NewTest n =  new NewTest();
		Thread t1 = new Thread(n);
		t1.start();
	
		ChildTest c = new ChildTest();
		Thread t2 = new Thread(c);
		t2.start();
		
		System.out.println("Priority of NewTest thread is " +t1.getPriority()); 
		
		t2.setPriority(10); 
		System.out.println("Priority of ChildTest thread is " +t2.getPriority()); 
	}

}