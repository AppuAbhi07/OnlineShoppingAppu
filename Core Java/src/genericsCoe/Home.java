package genericsCoe;

import java.util.ArrayList;

public class Home {

	public static void main(String[] args) {
		
		DemoGen<String> k =new DemoGen<String>("Abhishek");
		k.getobj();
		k.show();
		
		DemoGen<Integer> l =new DemoGen<Integer>(77);
		l.getobj();
		l.show();
		

	}

}
