package assignmentprograms.exercise;

import java.util.*;

class A
{   Scanner sc= new Scanner(System.in);
    int i,j,n,r,c;
	int first[][]=new int[2][2];
		int second[][]= new int[2][2];
		int sum[][]= new int[2][2];
	void insert()
	{
		System.out.println("enter row and column no of the matrix");
		r=sc.nextInt();
		c=sc.nextInt();
		
		System.out.println("enter the first matrix");
		for(int i=0;i<r;i++)
		{
	      for(int j=0;j<c;j++)
		  {
			  first[i][j]= sc.nextInt();
		  }
		}
		System.out.println("enter the 2nd matrix");
		for(int i=0;i<r;i++)
		{
	      for(int j=0;j<c;j++)
		  {
			 second[i][j]= sc.nextInt();
		  }
		}
	}
	void addition()
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum[i][j]= first[i][j]+second[i][j];
			}
		}
	}
	void display()
	{
	  System.out.println("the first  matrix is ");
	  {
		  for(int i=0;i<r;i++)
		{
	      for(int j=0;j<c;j++)
		  {
			  System.out.print(first[i][j]+" ");
		  }
		  System.out.println();
		}
	  }
		 System.out.print("the 2nd  matrix is"+" ");
	  {
		  for(int i=0;i<r;i++)
		{
	      for(int j=0;j<c;j++)
		  {
			  System.out.print(second[i][j]+" ");
		  }
		  System.out.println();
		}
	  }
		 System.out.println("the Sum of the  matrix is");
	  {
		  for(int i=0;i<r;i++)
		{
	      for(int j=0;j<c;j++)
		  {
			  System.out.print(sum[i][j]+"  ");
		  }
		  System.out.println();
		}
	  }
	}
}
	   class Matrix
	  {
		  public static void main(String args[])
		  {
			  A obj= new A();
			  
			  
			   obj.insert();
			   obj.addition();
			   obj.display();
		  }
	  }
	
			  
		
		