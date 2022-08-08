package assignmentprograms.generics;

//Sort list in ascending order

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortedList {

	public static void main(String[] args) {
		List<Integer> List1 = Arrays.asList(14, 45, 78, 63, 89);
		
		List<Double> List2 = Arrays.asList(56.5, 2.3, 45.6, 6.8);
	
		List<String> List3 = Arrays.asList("Meera", "Priya", "Riya", "Tina", "Siya"); 
		
		Collections.sort(List1);
		Collections.sort(List2);
		Collections.sort(List3);
	
		sort(List1);
		sort(List2);
//		sort(List3); //gives error as parameter type is bounded only to sort numbers
		
	}
	
	
	
	
	public static void sort(List<? extends Number> List)
	{
		System.out.println(List);
	}

}