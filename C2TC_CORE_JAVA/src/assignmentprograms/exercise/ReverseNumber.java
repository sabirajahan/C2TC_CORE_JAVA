package assignmentprograms.exercise;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 78983;
		System.out.println("The number is: "+num);
		int rev =0;
		int rem;
	
		while(num != 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10; //Provides quotient which will be stored in n
		}
		System.out.println("Reverse of number is: "+ rev);
	}

}