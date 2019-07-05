package enumDemo;

public enum Test3 {

	ABHISHEK(26),
	KARNA(55),
	HABIB(65),
	RIDDHI(22),
	RESHMA;
	int age;
	
	Test3(){
		this.age=27;
	}
	Test3(int age){
		this.age =age;
	}
	
   public int getAge()
   {
	   return age;
   }
	
}
