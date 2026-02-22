package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
public static void main(String[] args) throws IOException {
	Customer c=new Customer(101,"John",234);

	// converting object to byte code
FileOutputStream fos=new FileOutputStream
							("C:\\Users\\chint\\OneDrive\\Documents\\filesData\\customer.txt");
     ObjectOutputStream oos=new ObjectOutputStream(fos); // it will procees the data into a file
                      oos.writeObject(c); // we are writing the object code- byte code process into file
					  oos.close();
					  fos.close();
					  System.out.println("Customer data serialized successfully");
					  
					  
		// your work-> toys(Object code)        	-> bucket		   
}
}
