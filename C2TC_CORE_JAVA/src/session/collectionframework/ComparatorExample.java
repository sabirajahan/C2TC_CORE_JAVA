package session.collectionframework;

import java.util.*;

public class ComparatorExample
{

	public static void main(String[] args) 
	{
		
		//Employee array which will hold employee
		Employee employee[] = new Employee[3];
		
		//set difference attributes of the individual employee
		employee[0] = new Employee();
		employee[0].setAge(43);
		employee[0].setName("Zuber");
		
		employee[1] = new Employee();
		employee[1].setAge(40);
		employee[1].setName("Jyoti");
		
		employee[2] = new Employee();
		employee[2].setAge(20);
		employee[2].setName("Manisha");
		
		System.out.println("Order of employee before sorting is");
		for(int i = 0; i<employee.length; i++) 
		{
			System.out.println("Employee" +(i+1)+"name :: " + employee[i].getName()+",Age ::" + employee[i].getAge());

		}
		
		//Sorting array on the basis of employee age by passing AgeComparator
		Arrays.sort(employee, new AgeComparator());
		System.out.println("\n\nOrder of employee after sorting by employee age is");
		
		for(int i = 0; i<employee.length; i++) 
		{
			System.out.println("Employee" +(i+1)+"name :: " + employee[i].getName()+",Age ::" + employee[i].getAge());

		}
		
		//Sorting array on the basis of employee Name by passing NameComparator
		Arrays.sort(employee, new NameComparator());
		System.out.println("\n\nOrder of employee after sorting by employee name is");
		
		for(int i = 0; i<employee.length; i++) 
		{
			System.out.println("Employee" +(i+1)+"name :: "+employee[i].getName()+",Age ::" + employee[i].getAge());
		}
	}

}
