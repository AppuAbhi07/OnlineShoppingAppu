package seralizaiton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NewCustDemo {

	public static void main(String[] args) throws Exception{

		NewCustDoc nc =new NewCustDoc();
		System.out.println("UserName " + nc.userName + "Password " + nc.password);
		FileOutputStream fos = new FileOutputStream("test.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(nc);
		
		FileInputStream fis = new FileInputStream("test.ser");
		ObjectInputStream oi = new ObjectInputStream(fis);
		NewCustDoc nc1 = (NewCustDoc) oi.readObject();
		System.out.println("UserName " + nc1.userName + "Password " + nc1.password);
		
		
		
		
		
		
		
		
	}

}
