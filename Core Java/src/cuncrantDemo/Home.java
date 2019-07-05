package cuncrantDemo;

import java.util.Iterator;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    
		myThread t = new myThread();
	    t.start();
	    t.mk.add("llll");
	    t.mk.add("l2");
	    t.mk.add("l6565ll");
	    
         Iterator p = t.mk.iterator();
         while(p.hasNext()) {
        	 System.out.println("jkjk " + p.next());
        	 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
        	 
         }
	}

}
