package assignmentprograms.array;

//Question- Calculate average marks from an array containing marks of all students 
//in Physics using for-each loop
public class ArrayThird 
{

	public static void main(String[] args)
	{
	
		int[] mrks = {50, 65, 35, 67, 40};
		int sum = 0;
		for(int element:mrks)
		{
			sum = sum + element;
		}
		System.out.println("The average of mrks is: " +sum/mrks.length);
	}

}
