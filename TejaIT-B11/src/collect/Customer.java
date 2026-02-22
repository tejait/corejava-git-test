package collect;

public class Customer {

	int id;
	String name;
	long mobile;
	public Customer(int id, String name, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	
	public Customer() {
		super();
	}


	public static void main(String[] args) {
		Customer c1=new Customer(11, "AAA", 12233434L);
		System.out.println(c1.id+"   "+c1.name+"   "+c1.mobile);
		
		Customer c2=new Customer();
		         c2.id=c1.id;  // copying values of all variables - deep copy
		         c2.name=c1.name;
		         c2.mobile=c1.mobile;
		         
		         System.out.println(c2.id+"   "+c2.name+"    "+c2.mobile);
		         
		Customer c3=c1;  // copying entire object   - shallow copy
		System.out.println(c3.id+"   "+c3.name+"    "+c3.mobile);
	}
	
}
