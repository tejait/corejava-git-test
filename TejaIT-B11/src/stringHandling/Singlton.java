package stringHandling;

public class Singlton {
//for multiple requests ,it returns single Object	
private static Singlton singlton; // integer type value will return, String type value will return
                                 // Singleton type value will return
// we can't initialize outside of the class
private Singlton() {
	
}

public static Singlton getInstance() {
	
	if(singlton==null) {
		singlton=new Singlton();
	}
	
	return singlton;//Object
 }

public static void main(String[] args) {
	Singlton s1=Singlton.getInstance();
	System.out.println(s1);
	
	Singlton s2=Singlton.getInstance();
	System.out.println(s2);
}


}
