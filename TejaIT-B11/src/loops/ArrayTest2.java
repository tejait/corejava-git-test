package loops;

public class ArrayTest2 {
public static void main(String[] args) {
	
	String birlaProducts[]= {"birla soft","ultraTech","hindalco","Idea","pantaloons"}; // lenght-5 
	
	System.out.println(birlaProducts[0]);
	System.out.println(birlaProducts[1]);
	System.out.println(birlaProducts[2]);
	System.out.println(birlaProducts[3]);
	System.out.println(birlaProducts[4]);
	
	//System.out.println(birlaProducts[5]);
	
	System.out.println(birlaProducts.length);
	System.out.println(birlaProducts.length-1);// size= length-1;
	System.out.println("========================================");
	
	for(int i=0; i<birlaProducts.length;i++) {
		System.out.println(birlaProducts[i]);//0
	}
	
}
}
