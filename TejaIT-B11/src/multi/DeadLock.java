package multi;

public class DeadLock {
public static void main(String[] args) {
	
	String lock1="ranjith";
	String lock2="sunil";
	
	Thread t1=new Thread() {
		@Override
	public void run() {
		synchronized (lock1) {// ranjith
			System.out.println("t1 holds lock1 "+lock1 );
			
			synchronized (lock2) { // sunil
				System.out.println("t1 golds lock2 "+lock2);	
				}
			//- lock1 ,lock2
		}	
		
	}	
	};
	t1.start();
	
	Thread t2=new Thread() {
		@Override
		public void run() {
			synchronized (lock2) {
				System.out.println("t2 holds lock2 "+lock2);
			synchronized (lock1) {
				System.out.println("t2 holds lockl "+lock1);
			}
			// lock2,lock1
			}
		}
	};
	t2.start();
}
}
