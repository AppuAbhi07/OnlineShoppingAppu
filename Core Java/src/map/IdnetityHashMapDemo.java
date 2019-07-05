package map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdnetityHashMapDemo {
	public static void main (String [] abhi) {
		
		IdentityHashMap m = new IdentityHashMap();
		Integer i = new Integer(10);
		Integer j = new Integer(10);
		m.put(i, "Abhi");
		m.put(j, "Shek");
		
		System.out.println("Using Idenetity hashmap "+ m);
		
		HashMap m1 = new HashMap();
		Integer i1 = new Integer(10);
		Integer j1 = new Integer(10);
		m1.put(i1, "Abhi");
		m1.put(j1, "Shek");
		
		System.out.println("Using only hashmap "+ m1);
		
		
		
	}

}
