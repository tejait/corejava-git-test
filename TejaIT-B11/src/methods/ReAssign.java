package methods;

public class ReAssign {

	int iid; //declaration
	String name="surendra";
	public void data() {
	int id=10;
	    id=20;
	    id=30;    
	System.out.println(id);
	
	   iid=25;
	   iid=35;
	System.out.println(iid);
	name="suresh";
	System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		ReAssign re=new ReAssign();
		re.data();
	}
}
