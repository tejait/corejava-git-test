package methods;

public class PVR {

	int cusBal=200;
	int minBal=999;
	String catg="mobiles";
	public void shopping() {// instance method
		
		if(cusBal>minBal) {// 1000>999  -true
		System.out.println("welcome to PVR...");
		
		if(catg.equals("cloths")) {
		System.out.println("welcome to cloths...");	
		}else if(catg.equals("mobiles")) {
			System.out.println("welcome to mobiles");
		}else if(catg.equals("toys")) {
		System.out.println("welcome to toys..");	
		}else {
			System.out.println("sorry we don't have your expected category..");
		}
		
		}else {
			System.out.println("Sorry you don't have sufficient funds...");
		}
	}
	
	public static void main(String[] args) {
		PVR pvr=new  PVR();
		pvr.shopping();
	}
}
