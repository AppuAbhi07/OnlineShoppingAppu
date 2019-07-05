package seralizaiton;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustAccount implements Serializable {
	
	String userName = "Abhishek";
	transient String pw = "Preeti";
	
	public void writeObject(ObjectOutputStream as) throws Exception
	{
		as.defaultWriteObject();
	
	}
    
	public void ReadObject(ObjectInputStream is) throws Exception {
		String ePwd = (String)is.readObject();
		pw = ePwd.substring(3);
		
	}
	
}
