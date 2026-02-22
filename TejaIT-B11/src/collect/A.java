package collect;

public class A extends B{
public void car() {
	System.out.println("A clas car methdo...");
}

public void bike() {
	System.out.println("A class bike method");
}

public void house() {
	System.out.println("A class house method");
}
public static void main(String[] args) {
	B b=new B();// if you crate object for parent class we can access only parent data
	  b.car();
	  b.bike();
	  b.gold();
	  
	System.out.println("==============");
	
	A a=new A();
	  a.car();
	  a.bike();
	  a.gold();
	  a.house();
System.out.println("=========");
 B b1=new A();// super class ref = sub class Object
   b1.car();
   b1.bike();
   b1.gold();
   //b1.house();// we can't access sub class specific methods
 
}
}
