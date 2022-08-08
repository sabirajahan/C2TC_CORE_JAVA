package assignmentprograms.generics;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(15);
		l2.add(12);
		l2.add(20);
		l2.add(10);
	
		l1.add(6);
		l1.add(7);
		l1.add(4);
		l1.add(6);
		l1.add(5);
		l1.add(0, 9);
	
		l1.addAll(0, l2);
		
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i)); 
			
		}
		
		

	}

}
