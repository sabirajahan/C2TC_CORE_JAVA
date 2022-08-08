package session.collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
//		TreeSet treeSet1 = new TreeSet();
//		treeSet1.add(56);
//		treeSet1.add(62);
//		treeSet1.add(50);
//		treeSet1.add(10);
//		treeSet1.add("62");
//				//Ascending Order
//		System.out.println(treeSet1);		
	

		
		TreeSet<String> treeSet2 = new TreeSet<String>();
		treeSet2.add("One");
		treeSet2.add("Two");
		treeSet2.add("Three");
		treeSet2.add("Four");
		treeSet2.add("Five");
		
		System.out.println(treeSet2);
		
		
		
		//Cursor
		Iterator iterator = treeSet2.iterator(); //obtaining iterator object
		while(iterator.hasNext()) { //to iterate through collection 
			Object object = iterator.next();
			System.out.println(object + "\t");
		}
		
	}

}
