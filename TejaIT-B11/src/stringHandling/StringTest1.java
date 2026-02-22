package stringHandling;

public class StringTest1 {
public static void main(String[] args) {

	// String is a Objective datatype
	// String is a class- Immutable class
	//String is a character of sequence
	
	char[] name= {'m','a','r','u','t','h','i'};
    String name2="Ranjth";       
	String s=new String(name);
	System.out.println(s);
	
	String s1="ABC";  // String literal- SCP(String constant pool)
	System.out.println(s1);
	
	String s2=new String("XYZ"); // String Object- Heap
	System.out.println(s2);
}
}
