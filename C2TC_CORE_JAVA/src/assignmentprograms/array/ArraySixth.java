package assignmentprograms.array;

//Question- Write a program to find the maximum element in an array

public class ArraySixth 
{

	public static void main(String[] args) 
	{
		// Question6
		int[] arr = {1, 21, 3, 400, 5, 34, 67};
//		int max = 0;
		int max = Integer.MIN_VALUE;
		for(int element: arr)
		{
			if(element>max)
				max = element;
		}
		System.out.println("The value of maximum element is: " +max);
		
		
		
		//Will get min & max value
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
		
		

	}

}