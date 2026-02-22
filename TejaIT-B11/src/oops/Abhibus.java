package oops;

public class Abhibus implements PhonePe{

	@Override
	public void tickectBooking() {
	// implementation
		String from="SR nagar";
		String to="Guntur";
		String customer="Rakesh";
		int ticketPrice=750;
		
		System.out.println("from ="+from);
		System.out.println("to ="+to);
		System.out.println("customer ="+customer);
		System.out.println("price ="+ticketPrice);
		//id=45;
		System.out.println(id);
	}

	public static void main(String[] args) {
		Abhibus ab=new Abhibus();
		        ab.tickectBooking();
	}
}
