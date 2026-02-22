package oops;

public  class StaticTest {

	static int id=26;
	
	public static void test() {
		System.out.println("test method");
	}
	
	public static void main(String[] args) {
	    StaticTest.test();// classname.methodname
	    System.out.println(StaticTest.id);
	}
}
