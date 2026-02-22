package oops;

public class Cred extends BillDesk{

	public void shopping() {
		System.out.println("CRED shopping");
	}
	
	public void loans() {
		System.out.println("CRED loans");
	}
	
	public void creditScore() {
		System.out.println("CRED credit score...");
	}
	
	public static void main(String[] args) {
		Cred c=new Cred();
		c.shopping();
		c.loans();
		c.creditScore();
		c.paymentProcess();
	}
}
