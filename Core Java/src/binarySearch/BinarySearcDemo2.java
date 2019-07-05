package binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearcDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("abhi");
		l.add("pintoo");
		l.add("zebra");
		l.add("ox");
		l.add("cat");
        
		System.out.println(" l " + l);
		//Collections.sort(l);
		System.out.println(" l after sort " + l);
		Collections.sort(l,new myCom());
		System.out.println(" l after sortddddddddddd " + l);	
		System.out.println( "ccc  "   +Collections.binarySearch(l, "ox", new myCom()));
		System.out.println("llllllllllllll " + Collections.binarySearch(l, "czpple", new myCom()));

		
		
		
		
		

	}

}
