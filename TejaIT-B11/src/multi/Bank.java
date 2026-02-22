package multi;

public class Bank extends Thread{// 1) extends Thread class

	@Override
	public void run() { // override run();
		for(int i=0;i<10;i++) {
	System.out.println("run method.."+Thread.currentThread().getId());	
		}
	}
	
	public static void main(String[] args) {
		Bank b1=new Bank(); // create class Object
		     //b1.run();
		Thread t1=new Thread(b1);// created thread class Object & passed Class Object reference
		       t1.start();  // start the thread using start();
		       					// t1-  16
		Thread t2=new Thread(b1);//t2-  17 
		       t2.start();
		       
		Thread t3=new Thread(b1);// t3- 18
		       t3.start();
	}
}
