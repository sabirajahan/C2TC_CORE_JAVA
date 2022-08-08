package assignmentprograms.array;

//Question- Write a program to reverse an array

public class ArrayFifth 
{

	public static void main(String[] args) 
	{
//    0 1  2  3
	int[] arr = {7,9,12,11, 78, 90};
	//swap 0<-->3 , 1<-->2
	int l =arr.length; //length of array will be stored
	int a = Math.floorDiv(l, 2); //it will give the length/2 ans
	int temp;
	
	
	for(int i=0; i<a; i++)
	{
		//swap a[i] <--> a[l-i-1]
		temp = arr[i];
		arr[i] = arr[l-i-1];
		arr[l-i-1] = temp;	
	}
	for(int element:arr)
	{
		System.out.println(element);
	}

	}

}
