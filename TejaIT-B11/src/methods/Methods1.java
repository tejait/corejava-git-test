package methods;

public class Methods1 {

public void m1() { // zero argument or paramter
	System.out.println("this is m1 method");
}	

public void m2(int id) {
	System.out.println("m2 method.."+id);
}

public void m3(String name) {
	System.out.println("m3 method..."+name);
}

public void m4(int id,String name) {
	System.out.println("m4 method "+id+"    "+name);
}
public void m5(String name,double amt) {
	System.out.println("m5 method.. name= "+name+"  amt "+amt);
}
public static void main(String[] args) {
	Methods1 m1=new Methods1();
	         m1.m1();
	         m1.m2(10);
	         m1.m3("sai");
	        m1.m4(25, "ABCD");
	        m1.m5("XYZ", 124.55);
}
}
