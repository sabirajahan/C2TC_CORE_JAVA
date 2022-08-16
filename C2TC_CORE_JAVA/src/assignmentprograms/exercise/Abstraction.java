package assignmentprograms.exercise;

abstract class Bike
{
	Bike()
	{
		System.out.println("The bike is created");
	}
	abstract void run();
	
	void changeGear()
	{
		System.out.println("Gear changed");
	}
}
class hero extends Bike
{
	void run()
	{
		System.out.println("Hero is running safely");
	}
}
class bajaj extends Bike
{
	void run()
	{
		System.out.println("bajaj pulser is running safely");
	}
}
class Abstraction
{
	public static void main(String args[])
	{
		hero ob1=new hero();
		ob1.run();
		ob1.changeGear();
		bajaj ob2= new bajaj();
		ob2.run();
		ob2.changeGear();
	}
}