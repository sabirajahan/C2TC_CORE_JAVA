package assignmentprograms.array;

//Question - Write a program to find whether an array is sorted or not

public class ArrayEight 
{

	public static void main(String[] args) 
	{
		int[] arr2 = {1, 21, 3, 400, 5, 34, 67};
		boolean isSorted = true;
		for(int i=0; i<arr2.length-1; i++) 
		{
			if(arr2[i] > arr2[i+1])
			{
				isSorted = false;
				break;
			}
		}
		if(isSorted)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}


	}

}