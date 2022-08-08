package session.multithreading;

class Adarsh extends Thread //Thread 1 Adarsh
{
	@Override
	public void run() 
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Adarsh Thread");
			
			try 
			{
				Thread.sleep(3000); 
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}
	
}

public class JoinDemoFirst {

	public static void main(String[] args) throws InterruptedException { //Thread 2 Amol
		Adarsh a = new Adarsh();
		a.start();
		a.join();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Amol Thread");
		}
	}
}
