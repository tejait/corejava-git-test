package variables;

public class DataTypes5 {
// all Objective datatypes defualt values are null
// all Objective types are classes	
// All classes defualt value is null	
	Byte b;
	Short s;
	Integer i;
	Long l;
	
	Double d;
	Float f;
	
	Boolean bool;
	Character c;
	
	String str;
	
	DataTypes1 d1;// our class
	public static void main(String[] args) {
		DataTypes5 dt5=new DataTypes5();
		System.out.println(dt5.b);
		System.out.println(dt5.s);
		System.out.println(dt5.i);
		System.out.println(dt5.l);
		
		System.out.println(dt5.d);
		System.out.println(dt5.f);
		System.out.println(dt5.bool);
		System.out.println(dt5.c);
		System.out.println(dt5.str);
		System.out.println(dt5.d1);
	}
}
