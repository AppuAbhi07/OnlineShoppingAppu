package compt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Mainin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<C1> l =new ArrayList<C1>();
		l.add(new C1("Appu",5.9,2012));
		l.add(new C1("vamshi",9.2,2014));
		l.add(new C1("prithiv",7.9,2012));
		l.add(new C1("Veer",6.9,2022));
		l.add(new C1("Alpu",9.9,2112));
		
		Collections.sort(l);
		System.out.println("Movie After Sorting");
		for(C1 g : l) {
			
			System.out.println("Movie Name " + g.getName() + "Movie Rating " +g.getRating()+" Movie year" +g.getYear() );
			
		}

	}

}
