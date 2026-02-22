package variables;

public class DataTypes4 {
// instance variables
  int i=20;  	// initialization
  int j;    // declaration  - default values
  
  byte b;
  short s;
  int id;
  long l;
  
  double d;
  float f;
  
  boolean bool;
  char c;
  
  public static void main(String[] args) {
	  
	  DataTypes4 dt4=new DataTypes4();
	System.out.println(dt4.i);
	System.out.println(dt4.j);
	System.out.println("==========Default values========");
	
	System.out.println(dt4.b);//0
	System.out.println(dt4.s);//0
	System.out.println(dt4.id);//0
	System.out.println(dt4.l);//0
	
	System.out.println(dt4.d);//0.0
	System.out.println(dt4.f);//0.0
	
	System.out.println(dt4.bool);// false
	System.out.println(dt4.c); // space
}
}
