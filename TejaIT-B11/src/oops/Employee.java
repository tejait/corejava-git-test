package oops;

public class Employee {
int id;// 0 12
String name;
long salary;

public Employee() {
	System.out.println("zero argumented constructor..");
}

public Employee(int i) {
	id=i;
}

public Employee(int i,String s) {
	id=i;
	name=s;
}

public Employee(int i,String s,long l) {
	id=i;
	name=s;
	salary=l;
}
public static void main(String[] args) {	
	   Employee e1=new Employee();
	   System.out.println(e1.id);
	   System.out.println(e1.name);
	   System.out.println(e1.salary);
	   System.out.println("=================================");
	   Employee e2=new Employee(12);
	   System.out.println(e2.id);
	   System.out.println(e2.name);
	   System.out.println(e2.salary);
	   
	System.out.println("========================");
	Employee e3=new Employee(15, "AAA");
	System.out.println(e3.id);
	System.out.println(e3.name);
	System.out.println(e3.salary);
	
	System.out.println("==========================");
	Employee e4=new Employee(22, "BBB", 120000L);
	System.out.println(e4.id);
	System.out.println(e4.name);
	System.out.println(e4.salary);
}
}
