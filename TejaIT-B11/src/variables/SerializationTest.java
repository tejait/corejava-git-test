package variables;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
	public static void main(String[] args) throws IOException {
		Customer c=new Customer(1, "Teja",522908);
		         
		FileOutputStream fos=new FileOutputStream("C:\\Users\\chint\\OneDrive\\Documents\\filesData\\Customer.txt");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
	    oos.writeObject(c);
	    fos.close();
		oos.close();
	    System.out.println("Customer Object serialized");
	}
}
