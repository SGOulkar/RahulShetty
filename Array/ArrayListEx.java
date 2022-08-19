package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a =new ArrayList<String>(); 
		a.add("Rahul");
		a.add("Shubham");
		a.add("Shiva");
		a.add("Ram");
		a.add("Gangaram");
		System.out.println(a);
		
		a.add(0, "Java");
		a.add(1, "Java");
		System.out.println(a);
		
		a.remove(4);
		System.out.println(a);
		
		System.out.println(a.contains("Shubham"));
		System.out.println(a.get(2));
		System.out.println(a.indexOf("Shiva"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
		Iterator<String> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
