package assignmentprograms.inheritance;


//Hierarchical Inheritance
class A{
	String name = "Soniya";
	
	void display() {
		System.out.println("The name of student is: " + name);
	}
}

class B extends A{
	int age = 20;
	void show() {
		System.out.println("The age of student is: " + age);
	}
}

class C extends A {
	String performance = "Excellent";
	void disc() {
		System.out.println("The performace of student is: " + performance);
	}
}
public class InheritanceFifth {

	public static void main(String[] args) {
		C obj = new C(); 
		obj.display();
		obj.disc();
		
		B obj1 = new B();
		obj1.display();
		obj1.show();

	}

}
