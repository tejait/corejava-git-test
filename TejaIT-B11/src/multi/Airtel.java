package multi;

import java.io.Serializable;
import java.util.List;

public class Airtel implements Runnable,Serializable{

	@Override
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("Thread - "+Thread.currentThread().getId());
	}
	}

	
	public static void main(String[] args) {
		Airtel a1=new Airtel();
		Thread t1=new Thread(a1);
		       t1.start(); 
		 
		Thread t2=new Thread(a1);
		       t2.start();
	}
}
