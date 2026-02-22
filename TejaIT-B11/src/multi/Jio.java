package multi;

public class Jio extends Thread{

	@Override
	public  void run() {
		for(int i=1;i<15;i++) { // Parallel 
			System.out.println("for loop-1  "+Thread.currentThread().getId());
		}
		
		// to apply the synchronization for the piece of code we have to use Synchronized block
		synchronized (this) {// t1 
			for(int i=1;i<15;i++) {// Sequential 
				System.out.println("for loop-2  "+Thread.currentThread().getId());	
				}	
		}
	}
	
	public static void main(String[] args) {
		Jio j1=new Jio();
		Thread t1=new Thread(j1);
		       t1.start();
		       
		Thread t2=new Thread(j1);
		       t2.start();
	}
}
