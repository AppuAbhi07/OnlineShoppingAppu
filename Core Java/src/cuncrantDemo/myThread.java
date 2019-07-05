package cuncrantDemo;

import java.util.ArrayList;

public class myThread extends Thread
{
	
	static ArrayList mk = new ArrayList();
	
	public void run() {
		
		System.out.println("threadis runnin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mk.add("Test");
		
		
	}

}
