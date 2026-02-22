package collect;

public class HashCodeTest {
public static void main(String[] args) {
	
	String s1="kalyan";
	String s2="kalyan";
	String s3="kalyan";
	
	String s4="ranjith";
	String s5="venkatesh";
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());

	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	// if content same hashcode is same
	
	System.out.println(s1.hashCode()==s2.hashCode());// 1234==1234
	System.out.println(s1.hashCode()==s4.hashCode());// 1234==1345
	
	System.out.println(s1.equals(s4));// kalyan.equals(ranjith);
	System.out.println(s1.equals(s3));
	// if content is same equals method return true
	//if not same return false
	String kalaynkey="KA1234N";
	System.out.println(kalaynkey.hashCode());
	
	String sunilKey="KA1234N";
	System.out.println(sunilKey.hashCode());
	
	System.out.println(kalaynkey.hashCode()==sunilKey.hashCode());// 
	
	System.out.println(kalaynkey.equals(sunilKey));
	
	String saiKey="S4342AI"; //12345
	String ranjithKey="R244NJT";//12345
	
	System.out.println(12345==12345);
	
	System.out.println(saiKey.equals(ranjithKey));

	
}
}
