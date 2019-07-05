package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Intech> l = new ArrayList<Intech>();
		l.add(new Intech("Abhishek",26));
		l.add(new Intech("Kt",46));
		l.add(new Intech("Habi",56));
		l.add(new Intech("resh",29));
		l.add(new Intech("Shaji",47));
		l.add(new Intech("Riddi",24));
	   
		
		MyCom k3 = new MyCom();
		Nameby h = new Nameby();
		
		 Collections.sort(l,k3);
		 
		  for( Intech t : l) {
			  System.out.println("Name by age ==================>"+ t.getName() + "age" + t.getAge());
		  }
		  Collections.sort(l,h);
		  for( Intech t : l) {
			  System.out.println("Name by Name =========================>"+ t.getName() + "age" + t.getAge());
		  }
		
	}

}
