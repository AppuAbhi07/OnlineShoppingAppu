package garbageCollection;

import java.util.Date;

import org.omg.SendingContext.RunTime;

public class Home {
	
	Home h;
	 public static void main(String [] args) {
		/*
		 * Home v = new Home(); Home j = new Home();
		 * 
		 * System.gc();
		 */
	  Runtime r   = Runtime.getRuntime();
	  System.out.println("Total Memory " + r.totalMemory());
	  System.out.println("Free Moenory " + r.freeMemory());
	  for(int i=0; i<=1000;i++) {
		  
		  Date d = new Date();
		  d= null;
		  
	  }
	  
	  System.out.println("Free Moenory After loop" + r.freeMemory());
	  r.gc();
	  System.out.println("Free Moenory  after gc" + r.freeMemory());
	  
	  
	  
	  
	  
	  
	  
	 
	 }
	 
	
	

}
