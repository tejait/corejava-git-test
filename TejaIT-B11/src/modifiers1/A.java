package modifiers1;

 public class A {

 protected int id=25;

 protected void test() {
	System.out.println("A class Test method..");
}
	

public static void main(String[] args) {
	A a =new A();
	  System.out.println(a.id);
	  a.test();
}
	
}
