package map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap m = new LinkedHashMap();
		m.put("", "Abhi");
		m.put(8, "Shek");
		m.put(3, "Pintoo");
		m.put(5, "Mumbai");
		m.put(5, "bangalore");
		m.put(4, "Masgi");
		m.put(1, "Bombay");
		m.put(0, "Kerala");
		m.put(null, "Kerala");
		m.put(null, "K");
		
		System.out.println("HashMap values "+ m);
		Set s = m.keySet();
		System.out.println("HashMap Set Key "+ s);
		Collection c = m.values();
		System.out.println("HashMap Collection values "+ c);
		Set s1 = m.entrySet();
		Iterator r = s1.iterator();
		while(r.hasNext()) {
			Map.Entry mm = (Entry) r.next();
			
			System.out.println("values " + mm.getValue() + " key" + mm.getKey() );
		}

		

	}

}
