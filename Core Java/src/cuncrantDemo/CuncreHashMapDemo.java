package cuncrantDemo;

import java.util.concurrent.ConcurrentHashMap;

public class CuncreHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap p = new ConcurrentHashMap();
		//p.put(null, "Abhi");
		p.put(15, "Abhi");
		p.put(25, "pintoo");
		p.put(95, "appu");
		p.put(57, "Hey");
		p.put(14, "Hello");x
		p.put(18, "Abhi");
		
	  System.out.println("Values " +  p);	
	  System.out.println("Ceck"+ p.putIfAbsent(95, "Hello")) ;
	  System.out.println("Values " +  p);	
	  System.out.println("cehckkk " + p.remove(18, "Abhi"));
	  System.out.println("Values " +  p);  
	  System.out.println("ffff " + p.replace(57, "Hey", "New Value"));
	  System.out.println("Values " +  p);  
	  
	  
	  
	  
	  
		

	}

}
