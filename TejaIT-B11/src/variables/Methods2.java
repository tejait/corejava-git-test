package variables;

public class Methods2 {

	//accessmodifier   returnType  methodname(){
	    //methodbody
//}
	int id=10;
	
	public  byte id() { //insatnce
		return 123;
	}
	
	public short iid() {
		return 1234;
	}
	
	public int oid() {
		return 12345;
	}
	
	public static void main(String[] args) {
		Methods2 m2=new Methods2();
		
	    System.out.println(m2.id());
		System.out.println(m2.iid());
		System.out.println(m2.oid());
	}
}
