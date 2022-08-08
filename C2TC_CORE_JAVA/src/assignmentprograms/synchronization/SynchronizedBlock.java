package assignmentprograms.synchronization;

class BookSeat
{
	int totalSeats = 10;
	
	public void bookseat(int seats) 
	{	
		System.out.println("Hello I am " + Thread.currentThread().getName());
		System.out.println("Hello I am " + Thread.currentThread().getName());
		System.out.println("Hello I am " + Thread.currentThread().getName());
		System.out.println("Hello I am " + Thread.currentThread().getName());
		System.out.println("Hello I am " + Thread.currentThread().getName());
		
		synchronized(this)
		{
			if(totalSeats >= seats) 
			{
				System.out.println(seats+ " seats are booked Successfully");	
				totalSeats = totalSeats - seats;
				System.out.println("Seats left " +totalSeats);
			}
			else
			{
				System.out.println("Sorry seats cannot be Booked...!!");
				System.out.println("Seats left " +totalSeats);
			
			}
		}
		
		System.out.println("Hello I am " + Thread.currentThread().getName());
		System.out.println("Hello I am " + Thread.currentThread().getName());
		System.out.println("Hello I am " + Thread.currentThread().getName());
		System.out.println("Hello I am " + Thread.currentThread().getName());
		System.out.println("Hello I am " + Thread.currentThread().getName());
	}
}


public class SynchronizedBlock {

	public static void main(String[] args) 
	{
	
		BookSeat b = new BookSeat();
		
		//First Thread
		Thread deepak = new Thread(new Runnable() 
		{

			@Override
			public void run() 
			{
				b.bookseat(7);	
			}
					
		});
		
		
//		//Second Thread
		Thread riya = new Thread(new Runnable() 
		{

			@Override
			public void run() 
			{
				b.bookseat(6);	
			}
					
		});
				
		deepak.start();
		riya.start();
		
						

	}

}
