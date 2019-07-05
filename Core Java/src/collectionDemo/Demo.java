package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet h  = new HashSet();
		h.add("1");
		h.add("2");
		h.add("appu");
		h.add(null);
		h.add(null);
		h.add("abhi");
		h.add(4);
		
		Iterator t = h.iterator();
		while(t.hasNext()) {
			System.out.println("values" + t.next());
		}
		System.out.println("size " + h.size());
     	/*
		 * 
		 * */
	   LinkedHashSet st = new LinkedHashSet(h);
	   Iterator t1 = st.iterator();
		while(t1.hasNext()) {
			System.out.println("values for Linked HashSet        " + t1.next());
		}
		System.out.println("size " + st.size());
    	
		Set k = new LinkedHashSet(h);
		Iterator k1 = k.iterator();
		while(k1.hasNext()) {
			System.out.println("values for Linked HashSet        " + k1.next());
		}
		
		List l = new ArrayList(h);
		Iterator ld = l.iterator();
		while(ld.hasNext()) {
			System.out.println("values for ArrayList        " + ld.next());
		}
		
		
		LinkedHashSet o = new LinkedHashSet();
		o.add("1");
		o.add("2");
		o.add("appu");
		o.add(null);
		o.add(null);
		o.add("abhi");
		o.add(4);
		Iterator lh = o.iterator();
		while(lh.hasNext()) {
			System.out.println("values for new LH        " + lh.next());
		}
		
		 
		
	   
	   
	
	}

}
