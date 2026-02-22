package oops;

public class Test2 {
int id;// 0 27 32 45

public void m1(int val) {
	id=27;
	id=32;
	id=45;
	id=val;
	System.out.println(id);
}

public static void main(String[] args) {
	Test2 t2=new Test2();
	t2.m1(88);
}
}
