package assignmentprograms.array;

//Question - Write a program to find the minimun element in a 
public class ArraySeventh
{

	public static void main(String[] args)
	{
		int[] arr1 = {1, 21, 3, 400, 5, 34, 67};
		int min = Integer.MAX_VALUE;
		for(int element: arr1)
		{
			if(element<min)
				min = element;
		}
		System.out.println("The value of minimum element is: " +min);

	}

}
