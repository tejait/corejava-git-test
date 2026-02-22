package methods;

public class BookMyShow {

	String catg="other";
	
	public void ticketBooking() {
		
		if(catg.equals("platinum")) {
			System.out.println("welcome to platinum seat");
		}else if(catg.equals("gold")) {
		System.out.println("welcome to gold seat");	
		}else if(catg.equals("silver")) {
			System.out.println("welcome to silver seat");
		}else {
			System.out.println("nela ticket.....");
		}	
	}
	
	public static void main(String[] args) {
		BookMyShow bms=new BookMyShow();
		bms.ticketBooking();
	}
}
