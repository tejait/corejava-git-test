package oops;

public class Parent extends GrandParent{

	public void house() {
		System.out.println("parent house");
	}
	
	public void gold() {
		System.out.println("parent gold..");
	}
	
	public void bike() {
		System.out.println("parent bike..");
	}
	
	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.house();
		p1.gold();
		p1.bike();
	}
}
