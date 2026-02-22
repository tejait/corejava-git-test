package stringHandling;

//Custom Immutable class
public final class Employee { // we can't extends in another class
	
private final	String name;// we can't modified
private final	int age;
private final	long mobile;

public Employee(String name, int age, long mobile) {// to initialize the data
	super();
	this.name = name;
	this.age = age;
	this.mobile = mobile;
}

// to read the data
public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public long getMobile() {
	return mobile;
}


public static void main(String[] args) {
	Employee e1=new Employee("rakesh", 20, 232222L);
	
	System.out.println(e1.getName()+"   "+e1.getAge()+"   "+e1.getMobile());
}
	
}
