package variables;

public class TypeCasting {
public static void main(String[] args) {
	//implicit type casting
	int i=10;
	int j=20;
	double k=i+j;
	System.out.println(k);
	
	//explicit type casting
	double d=10.99;
	double e=20.99;
	int f=(int) (d+e);
	System.out.println(f);
		
}
}
