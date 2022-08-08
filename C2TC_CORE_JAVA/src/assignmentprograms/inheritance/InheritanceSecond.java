package assignmentprograms.inheritance;

class ParentClass{
	int a;
	void setData(int a) {    // method of parent class 
		this.a=a;
	}
}

class ChildClass extends ParentClass{ //method of child class
	void showData() {
		System.out.println("Value of a is: " +a);
	}	
}

public class InheritanceSecond {

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.setData(100);
		c.showData();
	}

}
