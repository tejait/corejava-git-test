package variables;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilizationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Customer c=new Customer(1, "Teja");
		
		FileInputStream fis=new FileInputStream("C:\\Users\\chint\\OneDrive\\Documents\\filesData\\Customer.txt");
	    ObjectInputStream ois=new ObjectInputStream(fis);
	    Object obj=ois.readObject();
	    
	    if(obj!=null) {
	    	Customer c=(Customer) obj;
	    	System.out.println(c.id+" "+c.name+"  "+c.pincode);
	    }
	   
		 ois.close();
		 fis.close();
	    System.out.println("Customer Object De-serialized");
	}
}
