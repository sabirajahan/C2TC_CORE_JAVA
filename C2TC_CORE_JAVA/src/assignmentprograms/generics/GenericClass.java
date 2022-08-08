package assignmentprograms.generics;

class MyGeneric<T1, T2>{
	int val;
	private T1 t1; //taking generic type argument
	private T2 t2;
	
	MyGeneric(int val, T1 t1){ //constructor
		this.val = val;
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public T2 getT2() {
		return t2;
	}
	
	public void setT2(T2 t2) {
		this.t2=t2;
	}
	
	public int getval() {
		return val;
	}
	
	public void setval(int val) {
		this.val=val;
	}
	
	public T1 getT1() {
		return t1;
	}
	
	public void setT1(T1 t1) {
		this.t1=t1;
	}
	

}
public class GenericClass {

	public static void main(String[] args) {
		MyGeneric<String, Integer> g1 = new MyGeneric<String, Integer>(23, "Mystring is my string");
		
		String str = g1.getT1();
		Integer int1 = g1.getT2();
		System.out.println(str +" " +int1);
	}

}