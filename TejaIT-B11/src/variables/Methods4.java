package variables;

public class Methods4 {

	String name="java";// instance variable
	static double amt=12.55; // static variable
	
	public String title() { // instance
		return "java Stop!";
	}
	
	public static String city() { //static
		return "Hyderabad";
	}
	public static void main(String[] args) {
		int id=25; //local variable
		System.out.println(id);
		
		Methods4 m4=new Methods4();
		System.out.println(m4.name);
		System.out.println(m4.title());
		
		System.out.println(Methods4.amt);
		System.out.println(Methods4.city());
	}
}
