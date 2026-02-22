package multi;

public class Zomato extends Thread{

	@Override
	public synchronized void run() { // t1 - z1 object lock required
		// it allows only one thread at a time
		//  t2- 17 - acquire z1 lock
		
		for(int i=0;i<15;i++) {// t2- 15times iterations
			System.out.println("Thread - "+Thread.currentThread().getId());
		}
		// after finish the work, t2 will release the lock(z1)
	}
	
	public static void main(String[] args) {
		Zomato z1=new Zomato();       // Object lock - z1
		Thread t1=new Thread(z1); // t1 -16 
		       t1.start();
		Thread t2=new Thread(z1);// t2- 17
		        t2.start(); 
		        
		Thread t3=new Thread(z1);// t3- 18
		        t3.start();
		  
		Zomato z2=new Zomato();  // Object lock - z2
		Thread t4=new Thread(z2); // t4- 20 - z2
		       t4.start(); 
		       
		Thread t5=new Thread(z2);// t5 -z2
		       t5.start();
		        
	}
}
