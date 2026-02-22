package oops;

public class A extends B{

	int id=10; // instance 
	
	
	public void test() {	
		int id=35; // local
   System.out.println(id); // 1st priority for local variable
   System.out.println(this.id);
   System.out.println(name);
   System.out.println(super.id);
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.test();
	}
}
