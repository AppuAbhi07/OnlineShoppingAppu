package compN;

import java.util.ArrayList;
import java.util.Collections;

public class Initech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<TF> l = new ArrayList<TF>();
      l.add(new TF("karan",65));
      l.add(new TF("habib",55));
      l.add(new TF("Shaji",46));
      l.add(new TF("Reshma",25));
      l.add(new TF("Abhishek",15));
      
      System.out.println("Sorting by Name");
      NameComp kl = new NameComp();
      Collections.sort(l,kl);
      for(TF t: l) {
    	  System.out.println("name " + t.getName() + "Age" + t.getAge());
    	  
      }
      System.out.println("Sorting by Age");
      AgeComp k2 = new AgeComp();
      Collections.sort(l,k2);
      for(TF t: l) {
    	  System.out.println("name " + t.getName() + "Age" + t.getAge());
    	  
      }
      
	}

}
