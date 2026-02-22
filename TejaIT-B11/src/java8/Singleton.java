package java8;

public class Singleton {
// creates single Object for multiple requests
	private static Singleton singleton;//null  Object

	private Singleton() {	
	}  
	
	public static Singleton getInstance() {
		
		if(singleton==null) {
			singleton=new Singleton();
		}
		
		return singleton; // Object
	}
	
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
	    Singleton s3=Singleton.getInstance(); 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
	
}
