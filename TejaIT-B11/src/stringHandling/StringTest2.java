package stringHandling;

public class StringTest2 {
public static void main(String[] args) {	
	String s1=new String("Teja IT");// Object
	String s2="java";
	String s3="java";
	
	String s4=new String("java");
	String s5="Teja IT";
	
	String s6="ramu";
	String s7=new String("Teja IT");
	//  ==  operator compare the Objects
	// .equals will compare the content of Object
	
	System.out.println(s1==s2);// false
	System.out.println(s1==s5);// false
	System.out.println(s2==s4);// false
	System.out.println(s2==s3);// true
	System.out.println(s1==s7); // false
	System.out.println(s5==s7); // false
	
	System.out.println(s1.equals(s2));// false
	System.out.println(s2.equals(s4));// true
	System.out.println(s2.equals(s3));// true
	System.out.println(s1.equals(s7));// true
	System.out.println(s5.equals(s6));// false
	
}
}
