package map;

import java.util.Iterator;
import java.util.Set;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CunncDemoExcep c = new CunncDemoExcep();
		
		System.out.println("Parent Adding Home values");
		c.h.put(3, "Arun");
		c.h.put(4, "Pintoo");
		c.h.put(6, "Mom");
		c.h.put(9, "Dad");
        c.start();
        
    	 Set ss = c.h.keySet();
    	 Iterator it = ss.iterator();
    	 while(it.hasNext()) {
    		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		 System.out.println(it.next());
    	 }
    	    
	}

}
