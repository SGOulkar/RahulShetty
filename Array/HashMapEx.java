package Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> h =new HashMap<>();
		h.put(0, "hello");
		h.put(1, "Goodbye");
		h.put(2, "morning");
		h.put(3, "evening");
		System.out.println(h);
		System.out.println(h.get(2));
		
		Set sn =h.entrySet();
		Iterator i = sn.iterator();
		
		while(i.hasNext()) {
			//System.out.println(i.next());
			Map.Entry mp =(Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
				
				
	}
}
