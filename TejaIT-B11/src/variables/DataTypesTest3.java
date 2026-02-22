package variables;

public class DataTypesTest3 {
// insatnce vairbales
	byte b=123;
	short s=12345;
	int i=123456;
	long l=1234455656l;
	
	double d=12.33;
	float f=3.45f;
	
	boolean bool=false;
	
	char c='d';
	
	public static void main(String[] args) {
		// classname refrence=new constructor(); -- constructor should be with a class name
		DataTypesTest3 d3=new DataTypesTest3(); // Object - Instance
		
		System.out.println(d3.b);// reference.variable name
		System.out.println(d3.s);
		System.out.println(d3.i);
	}
	
}
