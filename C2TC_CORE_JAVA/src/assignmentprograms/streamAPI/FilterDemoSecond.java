package assignmentprograms.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemoSecond
{

	public static void main(String[] args) 
	{
		List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theater");
		
		List<String> result = new ArrayList<String>();
		
		result = words.stream().filter(str-> str != null).collect(Collectors.toList());
		System.out.println(result);
	}

}