package assignmentprograms.inheritance;

class Webpage{
	String header = "NavBar";
	
	public void display() {
		System.out.println("Top of webpage consist of " + header);
	}
}

class Options extends Webpage{
	public void show() {
		System.out.println("The one of the options of navbar is Home");
	}
}

class Body extends Webpage{
	public void disc() {
		System.out.println("The body of webpages consist of Blogs");
	}
}

class AnotherOption extends Options{
	public void set() {
		System.out.println("Another options of navbar is Services");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		AnotherOption a = new AnotherOption();
		a.display();
		a.show();
		a.set();
		
		Body b = new Body();
		b.disc();

	}

}