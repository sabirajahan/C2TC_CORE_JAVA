package assignmentprograms.inheritance;

//Multilevel Inheritance
class Parent{
	int a = 20;
	
	void display() {
		System.out.println("The value of a is: " + a);
	}
}
class Child extends Parent{
	int b = 30;
	
	void show() {
		System.out.println("The value of b is: " + b);
	}
}

class GrandChild extends Child{
	int c = 50;
	void disc() {
		System.out.println("The value of c is: " +c);
	}
}

public class InheritanceThird {

	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		obj.display();
		obj.show();
		obj.disc();

	}

}