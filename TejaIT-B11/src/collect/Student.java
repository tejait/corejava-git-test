package collect;

public class Student implements Cloneable{

	int sid;
	String name;
	
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(15, "maruthi");
		System.out.println(s1.sid+"   "+s1.name);
		
		Student s2=(Student) s1.clone();   // Object type converting into Student
		System.out.println(s2.sid+"   "+s2.name);
		
// when we are using clone(); we have implement our class to Clonable interface, otherwise will get 
// CloneNotSupportedException
	
	}
}
