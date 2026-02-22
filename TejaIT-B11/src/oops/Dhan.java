package oops;

public class Dhan extends NSE{

	@Override
	public void brokerageCharges() {
		System.out.println("Dhan charges are 10/-");
	}

	public static void main(String[] args) {
		Dhan d=new Dhan();
		d.brokerageCharges();
		
		d.stocksInfo();
		d.IPO();
		d.holidays();
	}
}
