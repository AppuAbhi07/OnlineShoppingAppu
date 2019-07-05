package genericsCoe;

public class DemoGen<T> {

	T obj;
	
	DemoGen(T Obj){
		this.obj=obj;
	}
public void show() {
	System.out.println("The Type Obj Is " + obj.getClass());
	
}

public T getobj(){
	return obj;
}

}


