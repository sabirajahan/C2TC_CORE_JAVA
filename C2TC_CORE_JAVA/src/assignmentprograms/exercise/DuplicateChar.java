package assignmentprograms.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {

		String str = "krishna sakinala";
		
		char[] ch = str.toCharArray(); 
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(Character c: ch) 
		{
			if(charMap.containsKey(c))
			{
				charMap.put(c, charMap.get(c) +1);
			}
			else
			{
				charMap.put(c, 1);
			}
			
		}
		
		Set<Character> keys = charMap.keySet();
		
		for(Character c : keys)
		{
			if(charMap.get(c)>1)
			{
				System.out.println("Character "+c+" repeating "+charMap.get(c)+ "times");
			}
		}
		
		
		
		
	}

}