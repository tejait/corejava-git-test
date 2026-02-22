package oops;

public class Customer {
int id;
String name;

// by default java will provide zero arg constructor for every class

public Customer(int i) {
	
}

public Customer() {
	
}
	public static void main(String[] args) {
		Customer c1=new Customer(); //zero
		
		Customer c2=new Customer(12); //
	}
}
