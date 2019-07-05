package binarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class binarySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1000);
		l.add(5000);
		l.add(6520);
		l.add(9000);
		l.add(1065);
		l.add(99);
		l.add(1856);
		
System.out.println("Array l " + l);
Collections.reverse(l);
System.out.println("Array l after revere" + l);
System.out.println(" Binary Search " + Collections.binarySearch(l, 99));
System.out.println(" Binary Search not exists " + Collections.binarySearch(l, 600));




	}

}
