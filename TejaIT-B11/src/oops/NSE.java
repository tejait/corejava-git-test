package oops;

public abstract class NSE {
//showing necessary data-using normal methods
// hiding un-necessary data- using abstract methods
	
public void stocksInfo() { // necessary info - showing
	System.out.println("Hdfc,TCS,Infy,Zomato,paytm,happient minds");
}	
	
public void IPO() {// necessary info-showing
	System.out.println("Tesla....");
}

public void holidays() {// necessary info-showing
	System.out.println("Jan 26,aug15,dec25......");
}

public abstract void brokerageCharges();// // un-necessary info - hiding

	{
	System.out.println("instance blocks...");
	}
	
	static{
		System.out.println("static blocks");
	}

	public NSE() {
		System.out.println("Constructor");
	}
}
