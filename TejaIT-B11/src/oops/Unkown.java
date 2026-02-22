package oops;

public class Unkown {

	public static void main(String[] args) {
		AccountHolder a1=new AccountHolder(1234, "AAA", "SBIN", 12345);
	     System.out.println(a1.getAccNum()+"  "+a1.getHoldername()+"  "+a1.getIfsc()+"  "+a1.getBal());
		 
	    AccountHolder a2=new AccountHolder(1234, "AAA B", "SBIN", 12345); 
	                  a2.setHoldername("Simha");
	                  a2.setHoldername("puli");
	    System.out.println(a2.getAccNum()+"  "+a2.getHoldername()+"  "+a2.getIfsc()+"   "+a2.getBal());
	     
	}
}
