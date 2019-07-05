package collectionDemo;

public class c2Demo {
	
	public static void main(String[] args) {
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
