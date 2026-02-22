package variables;

public class DataTypes6 {

	String name="suresh"; //instance variable- outside method or class inside
	
	static double amt=25.55;// static variable- adding static keyword to instance variable
	
	
	public void mobiles() {
		int id=25; 
	}
	
	public static void main(String[] args) {
		int i=10; // local variable- inside method
		System.out.println(i);// we can call directly
		
	//classname ref = keyword  constructor
		DataTypes6 d6=new DataTypes6();// Object
		System.out.println(d6.name);// objectreference.variablename
		
		System.out.println(DataTypes6.amt);// classname.variablename
	}
}
