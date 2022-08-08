package assignmentprograms.inheritance;

class Employee{ //Parent class
	void salary() { //Method of class Employee
		System.out.println("Programmer salary is: " + 20000);
	}
 }
 class Programmer extends Employee{ //Child class
	 void bonus() { //Method of class Programmer
		 System.out.println("Bonus is: " +10000);
	 }
	 
}


public class InheritanceFirst {
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.salary();
		p.bonus();
		

	}

}