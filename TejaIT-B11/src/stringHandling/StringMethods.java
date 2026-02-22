package stringHandling;

public class StringMethods {
public static void main(String[] args) {
	String  s="your java stop";
	
	System.out.println(s.charAt(2));
	System.out.println(s.compareTo("your java stop"));
	System.out.println(s.compareToIgnoreCase("Your Java Stop"));
	System.out.println(s.concat(" Teja IT"));
	System.out.println(s.contains("ava"));
	System.out.println(s.endsWith("Ok"));
	System.out.println(s.equals("your java stop"));
	System.out.println(s.hashCode());
	String s1="";
	System.out.println(s1.isEmpty());
	System.out.println(s.length());
	System.out.println(s.replace("o", "k"));
	System.out.println(s.startsWith("yo"));
	char[] cr=s.toCharArray();
	System.out.println(cr);
	String s2="Teja IT";
	System.out.println(s2.toLowerCase());
	System.out.println(s2.toUpperCase());
	String[] strArr=s.split(" ");
	for(String str:strArr) {
	System.out.println(str);	
	}
}
}
