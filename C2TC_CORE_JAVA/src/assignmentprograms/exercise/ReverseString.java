package assignmentprograms.exercise;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = s.nextLine();
		
		String rev = " ";
		
		int l = str.length();
		for(int i=l-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
	}

}