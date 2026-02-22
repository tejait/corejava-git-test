package multi;

public class Customer {
	
int bankBal=2000;//20000| 15000

public synchronized void withdrawn(int withdrwanAmt) throws InterruptedException {// 5000 - divakar
	System.out.println("customer came to withdrwan amount..");
	
	if(bankBal<withdrwanAmt) {// 2000<5000 =true
		System.out.println("we don't have insufficient funds.. please wait..");
		wait();
// when we are trying to call wait(); notify(); notifyAll(); methods without synchronized method will get		
// IllegalMonitorStateException	
	}
	
	bankBal=bankBal-withdrwanAmt;// 20000-5000
	System.out.println("withdrawn succesfully... Thank you visit again");
}

public synchronized void deposite(int depositeAmt) {// 10000 
	System.out.println("customer came to deposite Amount..");
	
	bankBal=bankBal+depositeAmt;
	System.out.println("deposite succesfully..");
	System.out.println("notifying...........");
	notify();
	//notifyAll();
}

}
