package binarySearch;

import java.util.Comparator;

public class myCom implements Comparator{

	@Override
	public int compare(Object s1, Object s2) {
		
	     String l1 = s1.toString();
	     String l2 = s2.toString();
	     return l1.compareTo(l2);
	
	}

}
