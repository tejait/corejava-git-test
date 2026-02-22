package variables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id;
 String name;
static int cvv;
transient int pincode;

public Customer(int id, String name, int pincode) {
	super();
	this.id = id;
	this.name = name;
	this.pincode = pincode;
}




}
