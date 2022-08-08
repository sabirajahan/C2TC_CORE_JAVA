package assignmentprograms.synchronization;

class BookTheaterSeat
{
	int totalSeats = 10;
	
	public synchronized void bookseat(int seats) 
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
}

public class MovieBookApp {
	public static void main(String[] args) 
	{
		BookTheaterSeat b = new BookTheaterSeat();
		
		//First Thread
		Thread deepak = new Thread(new Runnable() 
		{

			@Override
			public void run() 
			{
				b.bookseat(7);	
			}
					
		});
		
		
		//Second Thread
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
