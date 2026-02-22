package oops;

public class Overloading3 {
public void m1(int id,String name) {//2
	System.out.println("id= "+id+"  name="+name);
}

public void m1(String name,int id) {//2
	System.out.println("id= "+id+"  name="+name);
}

public static void main(String[] args) {
	Overloading3 v3=new Overloading3();
	v3.m1(11, "ABC");
	v3.m1("XYZ", 22);
}

}
