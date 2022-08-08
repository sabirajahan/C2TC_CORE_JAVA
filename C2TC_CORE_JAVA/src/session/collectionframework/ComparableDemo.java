package session.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp>
{
	int EmpID;
	String Ename;
	double Sal;
	static int i;
	
	public Emp() {
		EmpID = i++;
		Ename = "Unknown";
		Sal = 0.0;
	}
	
	public Emp(String ename, double sal) 
	{
		EmpID = i+1;
		Ename = ename;
		Sal = sal;
	}

	@Override
	public String toString() {
		return "EmpID :" + EmpID + "\t" +" Ename :" + Ename + "\t" + " Sal :" + Sal;
	}
	
	//Sorting on the basis of Salary
	public int compareTo(Emp o) {
		if(this.Sal == ((Emp)o).Sal)
		return 0;
		else if(this.Sal> ((Emp)o).Sal)
			return 1;
		else
			return -1;
		
	}
}

public class ComparableDemo 
{

	public static void main(String[] args)
	{
		
		ArrayList<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp("Harry", 40000.00));
		emps.add(new Emp("Mary", 20000.00));
		emps.add(new Emp("Peter", 50000.00));
		emps.add(new Emp("Richard", 70000.00));
		
		//Before Sorting
		System.out.println("Before Sorting");
		System.out.println(emps);
		
		Collections.sort(emps);
		
		//After Sorting
		System.out.println("\n\nAfter Sorting");
		System.out.println(emps);
		
	}

}

