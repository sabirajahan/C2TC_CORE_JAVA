package SessionProgramsJUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Testing 
{

	//Method 1
	@Disabled
	void sum()
	{
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
	//Method 2
	int square(int x)
	{
		return x*x;
		
	}
	
	//Method 3
	int countA(String word)
	{
		int count=0;
		for(int i=0; i<word.length(); i++)
		{
			if(word.charAt(i)=='a' || word.charAt(i)=='A')
			{
				count++;
			}
		}
		return count;
		
	}
	
	
	
}