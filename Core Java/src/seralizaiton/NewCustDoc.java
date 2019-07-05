package seralizaiton;

import java.beans.Transient;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NewCustDoc implements Serializable {
	
	String userName= "Appu";
	transient String password = "pintoo";
	
	private void writeObject(ObjectOutputStream os) throws Exception{
		
		os.defaultWriteObject();
		String ePwd = "123"+password;
		os.writeObject(ePwd);
	}
	private void readObject(ObjectInputStream oi) throws Exception {
		oi.defaultReadObject();
		String ePwd = (String)oi.readObject();
		password	= ePwd.substring(3);
		
	}
	

}
