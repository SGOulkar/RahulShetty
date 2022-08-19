package Array;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> a = new HashSet<String>();
		a.add("usa");
		a.add("uk");
		a.add("india");
		a.add("usa");
		System.out.println(a);

		a.remove("usa");
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}
}
