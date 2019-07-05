package test;

import java.util.Comparator;

public class MyCom implements Comparator<Intech> {
	

	@Override
	public int compare(Intech o1, Intech o2) {
		
	    int a1 = o1.getAge();
	    int a2 = o2.getAge();
	    
	    return a2-a1;
	    
	}

}
