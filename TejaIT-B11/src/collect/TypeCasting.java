package collect;

public class TypeCasting {
	
public static void main(String[] args) {

	//implicit casting
	int i=10;
	int j=20;
	double k=i+j;
	System.out.println(k);
	
	System.out.println(" abcd");
	//explicit type casting
	
	double a=12.56;
	double b=34.57;
	int c=(int) (a+b);
	System.out.println(c);
	
	Object o="Java";
	String s=(String)o;
	
	System.out.print("AAAA");
	System.out.print("BBBB");
}
}
