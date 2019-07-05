package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
	
	public static void main(String... args) {
		
		//	Sort An Array
		
		String[] fruits = new String[] {"PineApple","Apple","Orange","Banana"};
		
		
		Arrays.sort(fruits);
		int i=0;
		for(String a : fruits) {
			
			System.out.println("Fruits "+ ++i + ":" + a);
		}
		
		//sorting list
		
		List<String> l = new ArrayList<String>();
		l.add("PineApple");
		l.add("Apple");
		l.add("Orange");
		l.add("Banana");
		
		Collections.sort(l);
		int j=0;
		for(String a : fruits) {
			
			System.out.println("Fruits Using ArrayList "+ ++j + ":" + a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
