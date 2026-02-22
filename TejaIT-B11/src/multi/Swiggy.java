package multi;

public class Swiggy extends Thread{
   @Override
	public void run() {
		Order();
	}
   
   // static synchronized is Class level lock - D1
   public static synchronized void Order() { // t1, t2 - lock s1
	   for(int i=0;i<15;i++) {
		 System.out.println("Thread - "+Thread.currentThread().getId());  
	   }
   }
   
   public static void main(String[] args) {  // 
	Swiggy s1=new Swiggy();// s1
	Thread t1=new Thread(s1); //t1-16
	       t1.start();
	
	Thread t2=new Thread(s1); //t2-17
	        t2.start();
	      
	 Swiggy s2=new Swiggy();// s2
	 Thread t3=new Thread(s2); // t3-19
	 t3.start();
	 
	 Thread t4=new Thread(s2);// t4-20
	        t4.start();
	 
}
}
