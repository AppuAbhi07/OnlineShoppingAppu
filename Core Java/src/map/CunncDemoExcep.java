package map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class CunncDemoExcep extends Thread{
	
	static ConcurrentHashMap  h =new ConcurrentHashMap();
	//static HashMap  h =new HashMap();
	public void run() {
		h.put(2, "Appu");
		System.out.println("Child is addede one value ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		h.put(88, "Ap");
		System.out.println("Child is addeded second  value " + h);
		
	  	
	}
	
	
   
}
