package assignmentprograms.array;

//Question- Write a program to find out whether a given integer is present
//in an array or not

import java.util.Scanner;

public class ArraySecond 
{

	public static void main(String[] args) 
	{
		int[] val = {20,30,48,29,59};
		System.out.println("Enter the integer: ");
		try (Scanner sc = new Scanner(System.in)) 
		{
			int n = sc.nextInt();
			boolean isInArray = false; //By default we say that number is not in array
		  //so if the number n is present than it need to be true
			for(int element:val)
			{
				if(n==element)                  
				{
					isInArray = true;
					break;
				}
			} //for loop will be end if it is true
			if(isInArray)
			{
				System.out.println("Integer is present in array");
			}
			else
			{
				System.out.println("Integer is not present in array");
			}
		}

	}

}
