package queue;

import java.util.TreeSet;

public class NavogableSetDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		TreeSet<Integer> t=  new TreeSet<Integer>();
		t.add(5000);
		t.add(3000);
		t.add(8000);
		t.add(1000);
		t.add(6000);
		t.add(7000);
		t.add(4000);
		
		System.out.println("Tree Values" + t);
		System.out.println("ceiling  " +  t.ceiling(3000) );
		System.out.println("higher  " + t.higher(3000) );
		System.out.println("floor " + t.floor(5000));
		System.out.println("lower " +  t.lower(8000));
		System.out.println("poll frist " + t.pollFirst());
		System.out.println("Tree Values after frist poll" + t);
		System.out.println("poll last " +  t.pollLast());
		System.out.println("Tree Values after poll last" + t);
		System.out.println(" " + t.descendingSet() );
		System.out.println("lat " + t );
		
		
		

	}

}
