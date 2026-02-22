package oops;

public class AliceBlue extends NSE{

	@Override
	public void brokerageCharges() {
	System.out.println("Alice blue charges 15/-");
	}

	public static void main(String[] args) {
		AliceBlue ab=new AliceBlue();
		ab.brokerageCharges();
		
		ab.stocksInfo();
		ab.IPO();
		ab.holidays();
	}
}
