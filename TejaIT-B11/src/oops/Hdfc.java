package oops;

public class Hdfc extends Cred{
	
	@Override
public void shopping() {
	System.out.println("HDFC shopping");
}

	@Override
public void loans() {
	System.out.println("hdfc loans");
}

	//@Override
public void crediCard() {
	System.out.println("HDFC credicard..");
}

public static void main(String[] args) {
	Hdfc h1=new Hdfc();
	     h1.shopping();
	     h1.loans();
	     h1.crediCard();
	     h1.creditScore();
	     h1.paymentProcess();
}
}
