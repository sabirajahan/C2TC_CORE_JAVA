package assignmentprograms.exercise;
import java.util.*;
class Bubble
{
int i, j, swap, n;
int a[];

void insert()
{
Scanner sc=new Scanner(System.in);
System.out.println("How many elements you want to enter?:");
n=sc.nextInt();
a=new int[n];

System.out.println("Enter the elements:");
	for(i=0;i<a.length;i++)                                                                                                                                                                                                                  
	{
	a[i]=sc.nextInt();
	}
}

void sort()
{
	for(i=0;i<a.length;i++)
	{
 		for(j=0;j<a.length-i-1;j++)
 		{
 		if(a[j]>a[j+1])
		{
         	swap=a[j];
		a[j]=a[j+1];
		a[j+1]=swap;
		}
 	        }
	}
}

void display()
{
System.out.println("The elements are:");
	for(i=0;i<a.length;i++)
	{
	 System.out.println(a[i]);
	}
}

}

class BubbleSort
{
public static void main(String args[])
{

 Bubble obj=new Bubble();
 int ch;
 do
  {
 System.out.println("\n MENU------>");
 System.out.println("\n 1.For inserting th elements \t 2. For sorting the element\t  3.For displaying the element");
 Scanner sc=new Scanner(System.in);
 System.out.println("\nEnter your choice:");
 ch=sc.nextInt();

   
   switch(ch)
	{
	 case 1: 
		obj.insert();
	        break;
	case 2: 
		obj.sort();
	        break;
	case 3: 
		obj.display();
	        break;
	 case 4: 
		default:
	         System.out.println("You have entered a wrong choice");
	 }
   }
while(ch<5);
}
}

   
