package variables;

public class Constructor {

	int id;// 0
	String name;//null
	double amt;//0.0

public Constructor() {
	//zero argument
}

public Constructor(int id, String name, double amt) {// argument consturctor
	super();
	this.id = id;
	this.name = name;
	this.amt = amt;
}

	public static void main(String[] args) {
		Constructor c1=new Constructor(); 
		System.out.println(c1.id);
		System.out.println(c1.name);
		System.out.println(c1.amt);
		
		Constructor c2=new Constructor(10, "ABCD", 125.55);
		System.out.println(c2.id);
		System.out.println(c2.name);
		System.out.println(c2.amt);
	}
}
