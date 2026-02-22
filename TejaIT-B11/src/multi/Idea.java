package multi;

public class Idea extends Thread{

	@Override
	public void run() {
		// executing run method - running state
		for(int i=0;i<15;i++) {
			System.out.println("Thread -- "+Thread.currentThread().getId());
			try {
				Thread.sleep(5000); // waiting state
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// dead 
	}
	
	public static void main(String[] args) {
		
		Idea i1=new Idea();
		Thread t1=new Thread(i1); // born
		       t1.start();   // runnable 
		      // t1.start(); 
// when we are trying start same thread again and again will get IllegalThreadStateException
	}
}
