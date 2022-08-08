package assignmentprograms.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo
{

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Melisandre", "Sana", "Jon", "Daenerys", "Joffery");
		
		List<String> longnames = new ArrayList<String>();
		
		longnames=names.stream().filter(str-> str.length()>6 && str.length()<8).collect(Collectors.toList());
		System.out.println(longnames);
		
//		names.stream().filter(str-> str.length()>6 && str.length()<8).forEach(str->System.out.println(str));

	}

}