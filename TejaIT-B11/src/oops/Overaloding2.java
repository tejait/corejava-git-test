package oops;

public class Overaloding2 {
public void m1(int id) {
	System.out.println("Integer method "+id);
}

public void m1(String name) {
	System.out.println("String method "+name);
}

public void m1(double amt) {
	System.out.println("Double method "+amt);
}

public static void main(String[] args) {
	Overaloding2 v2=new Overaloding2();
	   v2.m1(22);
	   v2.m1("XYZ");
	   v2.m1(12.44);
}
}
