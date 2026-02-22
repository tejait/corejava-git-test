package collect;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	int id;
	String name;
	static int cvv; // static data can't serilized
	
	transient long salary;// transinet can't serilized

	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	
	
	
	// Object - JVM
	// Object - files (bytes) 
}
