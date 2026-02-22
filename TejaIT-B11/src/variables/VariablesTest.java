package variables;

public class VariablesTest extends VariablesTest2{
     int i;   // declaration
	int id=10; // initialization  - instance variable
	
	static double amt=145.55; // static variable
	
	String city="Hyderabad";
	
	public void test() { // instance method
	System.out.println("test method...");	
	
  String fname="java"; // local variable
  System.out.println(fname);
	
  int k;
      k=26; // local variables must should initialize before calling
  System.out.println(k);
  
  String city="Banglore";
  System.out.println(city); // local variable
  System.out.println(this.city);
  System.out.println(super.city);
	}
	
	public static void main(String[] args) {
		VariablesTest vt=new VariablesTest();
		    System.out.println(vt.id);
		    vt.test();
		    
		    String name="kalyan"; // local variable - method inside
		    System.out.println(name);
		  
		    System.out.println(VariablesTest.amt);// classname.variable name
		   // System.out.println(k);
	}
	
}
