package assignmentprograms.inheritance;

//Multilevel Inheritance
class Student{
	String name;
	int age;
	int id;
	
	void studentname(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
}

class Data extends Student{
	void getData() {
		System.out.println("Name of Student is: " + name);
		System.out.println("Age of Student is: " + age);
		System.out.println("Id of Student is: " + id);
	}
	
}

class Number extends Data{
	void display() {
		System.out.println("Inside Number class");
	}
}


public class InheritanceFourth {

	public static void main(String[] args) {
		Number n = new Number();
		n.studentname("Harry", 18,1);
		n.getData();
		n.display();

	}

}
