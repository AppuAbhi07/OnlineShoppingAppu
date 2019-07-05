package copyOnWriteArrayListDemo;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyDemo {

	public static void main(String[] args) {
		
		ArrayList j = new ArrayList();
		j.add("Nanu");
		j.add("Abhi");
		j.add("65");
		j.add("98");
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		l.add("Abhi");
		l.add("98");
		l.add("Pintoo");
		l.add(null);
		l.add("56");
		System.out.println("Normal Check" +  l);
		
		l.addIfAbsent("Hello");
		l.addIfAbsent("56");
		l.addIfAbsent(null);
		System.out.println(" after " + l) ;
		l.addAllAbsent(j);
		System.out.println("After All " + l);
		

	}

}
