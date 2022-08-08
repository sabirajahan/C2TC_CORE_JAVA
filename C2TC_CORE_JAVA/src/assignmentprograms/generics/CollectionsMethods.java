package assignmentprograms.generics;

import java.util.ArrayList;

public class CollectionsMethods {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Riya");
		l1.add("Meera");
		l1.add("Soniya");
		l1.add("Ankita");
		l1.add("Priya");
		l1.add("Ankita");
		
		//clear method
//		l1.clear();
		
		//contains method
		System.out.println(l1.contains("Ankit")); 
		
		//indexOf method
		System.out.println(l1.indexOf("Soniya")); 
		System.out.println(l1.indexOf("Ritesh")); 
		System.out.println(l1.indexOf("Ankita")); 
		System.out.println(l1.lastIndexOf("Ankita"));
		
		//set method
		l1.set(1, "Vijay");
		
		for(int i=0; i<l1.size(); i++)
		{
			System.out.print(l1.get(i));
			System.out.print(", "); 
			
		}
		
	}

}
