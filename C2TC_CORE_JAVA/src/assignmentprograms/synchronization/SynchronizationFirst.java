package assignmentprograms.synchronization;

class First
{
	public synchronized void display(String msg)
	{
		System.out.println("["+msg +"]");
		
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}


public class SynchronizationFirst {

	public static void main(String[] args) throws InterruptedException {
		First f = new First();
		
		Thread t =  new Thread(new Runnable()
				{

					@Override
					public void run() 
					{
						int i=0;
						while(i<10)
						{
							f.display("Welcome");
						}
						
					}
			
				});
		
		Thread t1 =  new Thread(new Runnable()
		{

			@Override
			public void run() 
			{	
				int i=0;
				while(i<10)
				{
					f.display("Programmer");
				}
				
			}
	
		});
				
		t.start();
		t1.start();
		
		t.join(3000);

	}

}
