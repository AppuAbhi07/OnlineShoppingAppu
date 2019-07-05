package seralizaiton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws Exception{
		
		Dog d1 = new Dog();
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.writeChars("abhishek");
		
	 
		
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
	    Dog d2 = (Dog)ois.readObject();
	    System.out.println(d2.i + " " + d2.j);
		
		
		
		
		
		
		
		
	}

}
	