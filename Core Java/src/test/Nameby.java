package test;

import java.util.Comparator;

public class Nameby  implements Comparator<Intech>{

	
	@Override
	public int compare(Intech o1, Intech o2) {
		String s1 = o1.getName().toString();
		String s2 = o2.getName().toString();
		
		return s1.compareToIgnoreCase(s2);
		
	
	
	}

}
