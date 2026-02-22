package oops;

public class Grow extends NSE{

	@Override
	public void brokerageCharges() {
	System.out.println("Grow Charges are 20/-");
	}

	public static void main(String[] args) {
	Grow g=new Grow();
	     g.brokerageCharges();
	     
	     g.stocksInfo();
	     g.IPO();
	     g.holidays();
	     
	  //   NSE n=new NSE();
	}
}
