package session.multithreading;

class MyThreadAdarsh extends Thread //Thread 1 Adarsh
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


public class JoinDemoThird {

	public static void main(String[] args) throws InterruptedException { //Thread 2 Amol
		MyThreadAdarsh a = new MyThreadAdarsh();
		a.start();
		a.join(3000, 1000);
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Amol Thread");
		}

	}

}
