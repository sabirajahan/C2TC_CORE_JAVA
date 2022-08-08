package assignmentprograms.exercise;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		
		String rev= new StringBuffer(str).reverse().toString();
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String");
		}

	}

}
