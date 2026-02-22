package variables;

public class Method1 {

	int id=25; // instance variable
static	double amt=124.55; //static variable
	
	public static void main(String[] args) {
		// method body
		
		String name="suresh"; // local variable
		System.out.println(name); // we can call directly
		
		Method1 m1=new Method1();
		System.out.println(m1.id);// objectreference.variablename
		
		System.out.println(Method1.amt);// classname.variablename
	}
	
}
