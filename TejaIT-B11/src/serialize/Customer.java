package serialize;

import java.io.Serializable;

public class Customer implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
int id;
String name;
transient int cvv;// we can't serialize this  transient variable
static int accNo=1000; // static variable can't serialized

public Customer(int id, String name, int cvv) {
	super();
	this.id = id;
	this.name = name;
	this.cvv = cvv;
}





}
