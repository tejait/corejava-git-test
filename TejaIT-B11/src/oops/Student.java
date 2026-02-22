package oops;

public class Student {

	int id;//0, 55
	String name; //null
	
	public Student() {
		System.out.println("no arg cinstructor");
	}

	public Student(int i) {
		System.out.println("argument constroctir "+i);
		id=i;
	}
	
	public static void main(String[] args) {
  Student s1=new Student(); // 
  System.out.println(s1.id);
  System.out.println(s1.name);		
		
		
	Student s2=new Student(55);
	System.out.println(s2.id);
	
	System.out.println(s1);
	}
}
