package collect;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {
public static void main(String[] args) throws IOException {
	
	Employee e = new Employee(10,"John",20000L);
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\chint\\OneDrive\\Documents\\filesData\\employee.txt");
	
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	oos.writeObject(e); // we are writing the object code- byte code 
	
	oos.close();
	fos.close();
	System.out.println("Employee data serialized successfully");
}

//mail - nwnfiwniefnwnfnkefnjnkfnwef
// reciever - nwnfiwniefnwnfnkefnjnkfnwef
}
