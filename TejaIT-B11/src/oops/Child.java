package oops;

public class Child extends Parent{
	
@Override	
public void bike() {
	System.out.println("Child bike...");
}

public static void main(String[] args) {
			Parent p1=new Parent();
			p1.house(); // parent house
			p1.gold();// parent gold
			p1.bike();// parent bike
		    p1.cycle();
			
			Child c1=new Child();
			c1.house();
			c1.gold();
			c1.bike();//child bike
			c1.cycle();
	
}
}
