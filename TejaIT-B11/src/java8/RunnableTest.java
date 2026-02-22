package java8;

public class RunnableTest implements Runnable{

	@Override
	public void run() {
	for(int i=0;i<20;i++) {
		System.out.println(Thread.currentThread().getId());
	}
	}
	
	public static void main(String[] args) {
		RunnableTest r1=new RunnableTest();
		Thread t1=new Thread(r1);
		        t1.start();
	    Thread t2=new Thread(r1);
		        t2.start();        
	}

}
