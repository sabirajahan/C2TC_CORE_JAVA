package assignmentprograms.exercise;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int r; 
		
		while(n>0)
		{
			r = n % 10;
			n = n/10;
			sum = sum + r*r*r;
		}
		if(temp == sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}

	}

}