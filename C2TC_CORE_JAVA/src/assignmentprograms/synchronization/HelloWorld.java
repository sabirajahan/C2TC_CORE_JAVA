package assignmentprograms.synchronization;

class Person
{
	public synchronized void sendText(String txt)
	{	
		System.out.println(txt);
		
		try 
		{	
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(txt + " sent");
	}
}

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException 
	{
		Person p = new Person();
		
		//First Thread
		Thread msg1 = new Thread(new Runnable()
		{
			@Override
			public void run() 
			{	
				for(int i=0; i<10; i++)
				{
					p.sendText("Hello World!");
				}
			}		
		});
		
		//Second Thread
		Thread msg2 = new Thread(new Runnable()
		{
			@Override
			public void run() 
			{	
				for(int i=0; i<10; i++)
				{
					p.sendText("Good Morning");
				}
			}		
		});
		
		msg1.start();
		msg2.start();
	}
}