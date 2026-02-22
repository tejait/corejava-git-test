package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerilizeTest {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\chint\\OneDrive\\Documents\\filesData\\customer.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Customer c1=(Customer)ois.readObject();
    
    if(c1!=null) {
		System.out.println(c1.id+"  "+c1.name+"  "+c1.cvv);
	}
    
    fis.close();
	ois.close();
    }
    
}

