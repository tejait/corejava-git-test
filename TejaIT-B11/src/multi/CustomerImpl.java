package multi;

public class CustomerImpl {

	public static void main(String[] args) {
		Customer c=new Customer();
	
		new Thread() {
			@Override
			public void run() {
				try {
					c.withdrawn(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				c.deposite(15000);
			}
		}.start();
		
	}
}
