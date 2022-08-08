package session.multithreading;

//Creating a thread using Thread class


class ChildThread extends Thread{ //Thread
	@Override
	public void run()  
	{ 
		for(int i=0; i<10; i++) 
		{
			System.out.println("I am MyThread");
		}	
	}
}

public class MultithreadingFirst {

	public static void main(String[] args) { //Main thread
		ChildThread t = new ChildThread();
		t.start();
		
		for(int i=0; i<10; i++) 
		{
			System.out.println("I am Main thread");
		}

	}

}