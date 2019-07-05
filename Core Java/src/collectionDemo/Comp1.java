package collectionDemo;

public class Comp1 implements  Comparable<Comp1> {
	
	private String fName;
	public String getfName() {
		return fName;
	}









	public void setfName(String fName) {
		this.fName = fName;
	}









	public String getfDisp() {
		return fDisp;
	}









	public void setfDisp(String fDisp) {
		this.fDisp = fDisp;
	}









	public int getfQnt() {
		return fQnt;
	}









	public void setfQnt(int fQnt) {
		this.fQnt = fQnt;
	}









	private String fDisp;
	private int fQnt;

	






	public Comp1(String fName, String fDisp,int fQnt) {
		super();
		this.fName = fName;
		this.fDisp = fDisp;
		this.fQnt = fQnt;
		
	    }
	
	
	

	 
	 



	@Override
	public int compareTo(Comp1 c) {
       int compQnt = ((Comp1)c).getfQnt();
       
       return this.fQnt-compQnt;
       
	
   }
	
	Comp1[] fruits = new Comp1[4];
	
	Comp1 pineappale = new Comp1("Pineapple", "Pineapple description",70); 
	Comp1 apple = new Comp1("Apple", "Apple description",100); 
	Comp1 orange = new Comp1("Orange", "Orange description",80); 
	Comp1 banana = new Comp1("Banana", "Banana description",90); 
  
	fruits[0]=pineappale;
	fruits[1]=apple;
	fruits[2]=orange;
	fruits[3]=banana;
     
	for(Comp1 k : fruits) {
		System.out.println(k.getfName() + ""+ k.getfDisp()+""+k.getfQnt());
		
	}
}
	
	
}
	


