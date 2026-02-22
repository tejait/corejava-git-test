package except;

public class Customer {

	int bal=500;
	int bill=4000;
	
	public void payment() {	
		
		if(bal>bill) {
			System.out.println("payment success..");
		}else {
			//throw new InsufficientBalanceException();
			throw new InsufficientBalanceException("insufficeint funds.TopUpto Use");
		}
	}
	
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.payment();
	}
}
