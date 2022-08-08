package session.collections;

import java.util.ArrayList;

public class CollectionsDemo
{

	public static void main(String[] args)
	{
		// Array 
//		String[] A = new String[500];
//		A[0] = "Avantika";
//		A[1] = "Damini";
//		A[2] = 45;
		
		//Collections
		ArrayList s = new ArrayList();
		s.add("Avantika");
		s.add("Damini");
		s.add(45);
		
		String employee1 = (String) s.get(0);
		String employee2 = (String) s.get(1);
		String employee3 = (String) s.get(2);
		
	
		

	}

}
