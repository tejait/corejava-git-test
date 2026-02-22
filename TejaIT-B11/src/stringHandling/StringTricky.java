package stringHandling;

public class StringTricky {

	public void m1(String str) {
		System.out.println("String  method..."+str);
	}
	
	public void m1(StringBuffer sbf) {
		System.out.println("String buffer  "+sbf);
	}
	
	public void m1(StringBuilder sbu) {
		System.out.println("String builder..."+sbu);
	}
	
	public static void main(String[] args) {
		StringTricky s=new StringTricky();
		//s.m1(null); // ambiguity issue
		s.m1("abcd");
	
		StringBuffer sbf=new StringBuffer("xyz");
		s.m1(sbf);
		
		StringBuilder sbu=new StringBuilder("aaa");
		s.m1(sbu);
	}
}
