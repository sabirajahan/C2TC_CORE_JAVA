//Creating a thread using Runnable Interface

package session.multithreading;

class MyThread implements Runnable{ //Thread

	@Override
	public void run() { //Overridden Method
		for(int i=0; i<5; i++) {
			System.out.println(i);
			}
		}	
	}	



public class MultithreadingSecond {

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread s = new Thread(obj);
		s.start();


	}

}