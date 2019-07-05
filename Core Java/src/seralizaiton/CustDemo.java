package seralizaiton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustDemo {

	public static void main(String[] args) throws Exception {
		 
		CustAccount c = new CustAccount();
   		System.out.println(c.userName + "" + c.pw);
        
   		FileOutputStream fos = new FileOutputStream("abc.txt");
   		ObjectOutputStream oos = new ObjectOutputStream(fos);
   		oos.writeObject(c);
   		
   		FileInputStream fis = new FileInputStream("abc.txt");
   		ObjectInputStream ois = new ObjectInputStream(fis);
   		CustAccount c2 = (CustAccount)ois.readObject();
   		
   		System.out.println(c2.userName + " " + c2.pw);
   		
   		
   		
   		
   		
   		
	}

}
