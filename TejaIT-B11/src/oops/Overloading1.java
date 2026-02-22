package oops;

public class Overloading1 {

	public void m1() { // zero argument
		System.out.println("zero argument method....");
	}
	
	public void m1(int id) {//single parameter
		System.out.println("Single argument method...."+id);
	}
	
	public void m1(int id,String name) {// two paramters
		System.out.println(" two paramters.."+id+"   "+name);
	}
	
	public static void main(String[] args) {
		Overloading1 ov1=new Overloading1();
		ov1.m1();
		ov1.m1(25);
		ov1.m1(22, "ABCD");
	}
}
