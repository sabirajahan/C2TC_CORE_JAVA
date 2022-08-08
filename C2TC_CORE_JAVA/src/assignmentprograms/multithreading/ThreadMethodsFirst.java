package assignmentprograms.multithreading;

class Test extends Thread
{ //Test Thread 
	
	@Override
	public void run()
	{ 
		
		for(int i=0; i<10; i++) 
		{	
			Thread.currentThread().setName("MyThread"); 
			System.out.println("Test thread name is: " +Thread.currentThread().getName()); 
		}
		
	}
}

public class ThreadMethodsFirst 
{

	public static void main(String[] args) 
	{ //Main thread 
		
		Test t = new Test(); 
		t.start();
		System.out.println(t.isAlive()); 
		
		System.out.println("Main thread is executed by: "+Thread.currentThread().getName());  
		System.out.println(Thread.currentThread().isAlive()); 
		
		
		for(int i=0; i<10; i++)  
		{ 
			System.out.println("I am Main Thread");
				
		}
	}

}
