package assignmentprograms.exercise;

public class PerfectNumber {

	public static void main(String[] args) {
		int n = 28;
		boolean b = isPerfect(n);
		if(b)
		{
			System.out.println(n+" is a Perfect Number");
		}
		else
		{
			System.out.println(n+" is Not a Perfect Number");
		}
	}
	
	public static boolean isPerfect(int n)
	{
		int sum = 0; 
		
		for(int i=1; i<n; i++)
		{
			if(n % i == 0)
			{
				sum += i;
			}
		}
		if(sum == n)
		{
			return true;
		}
		return false;
	}

}
