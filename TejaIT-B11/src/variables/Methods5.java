package variables;

public class Methods5 {

	public int id() {
		return 123;
	}
	public boolean status() {
		return true;
	}
	public long mobile() {
		return 1223343434l;
	}
	public String name() {
		return "Sunil";
	}	
	public void nothing() {
		System.out.println("this is nothing method");
	}
	
	public static void main(String[] args) {
	Methods5 m5=new Methods5();
	System.out.println(m5.id());
	System.out.println(m5.status());
	System.out.println(m5.mobile());
	System.out.println(m5.name());
	//System.out.println(m5.nothing());
						m5.nothing();
	
	
	}
}
