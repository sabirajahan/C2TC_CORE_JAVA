package session.wrapper;

public class BooleanExample {

	public static void main(String[] args) {

		Boolean b = new Boolean("YES");
		Boolean c = new Boolean("NO");
		Boolean d = new Boolean("True");
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(b.equals(c));
		System.out.println(b.equals(d));
		
		
	}
}