package enumDemo;

public class Home {

    enum test{
    	TEST1,TEST2,TEST3;
    }
	
	
	public static void main(String [] args) {
	
		Emp e =Emp.ABHIJITH;
		System.out.println(e);
        
		test t = test.TEST2;
		System.out.println(t);
	    Emp[] a =e.values();
	    for(Emp s : a) {
	    	System.out.println(s);
	    		
	    }
	    System.out.println(e.ordinal());
	
	    Test3[] t3  = Test3.values();
	    for(Test3 kl :t3) {
	    	System.out.println("The age is " + kl.getAge());
	    }
	}
}
