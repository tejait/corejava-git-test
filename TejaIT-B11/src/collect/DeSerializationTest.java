package collect;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationTest {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\chint\\OneDrive\\Documents\\filesData\\employee.txt");
    ObjectInputStream ois=new ObjectInputStream(fis); 
    Object obj=ois.readObject();
   
    Employee emp=(Employee) obj;
    
    System.out.println(emp.name+"   "+emp.id+"  "+emp.salary);
    
    System.out.println("deserialized");
}
}
