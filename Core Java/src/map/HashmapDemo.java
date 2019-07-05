package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo {
	public static void main (String [] args) {
	
	HashMap m = new HashMap();
	m.put("", "Abhi");
	m.put(2, "Shek");
	m.put(3, "Pintoo");
	m.put(4, "Mumbai");
	m.put(5, "bangalore");
	m.put(5, "Masgi");
	m.put(6, "Bombay");
	m.put(7, "Kerala");
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
