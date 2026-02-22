package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TATAProducts implements Comparable<TATAProducts>{

	int pid;
	String pname;
	int price;
	int discount;
	
	public TATAProducts(int pid, String pname, int price, int discount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.discount = discount;
	}
	
	
	@Override
	public String toString() {// to print the content of Object instead of Address
		return "TATAProducts [pid=" + pid + ", pname=" + pname + ", price=" + price + ", discount=" + discount + "]";
	}

	public static void main(String[] args) {
		
		TATAProducts t1=new TATAProducts(103, "Salt", 30, 5);
		TATAProducts t2=new TATAProducts(101, "Tetly", 100, 10);
		TATAProducts t3=new TATAProducts(100, "Tanishq", 500, 20);
		TATAProducts t4=new TATAProducts(105, "Bigbasket", 700, 45);
		TATAProducts t5=new TATAProducts(102, "TCS", 400, 30);
		
		List<TATAProducts> list=new ArrayList<>();
		                   list.add(t1);
		                   list.add(t2);
		                   list.add(t3);
		                   list.add(t4);
		                   list.add(t5);
		                   
		               Collections.sort(list); // 
		                   
		        for(TATAProducts val:list) { // t1, t2, t3, t4, t5
		        //	System.out.println(val.pid+"   "+val.pname+"   "+val.price+"   "+val.discount);
		       System.out.println(val);
		        }           	                   
	}


	@Override
	public int compareTo(TATAProducts o) {	
		return this.pid-o.pid; // single criteria 
		//return this.price-o.price;
		//return this.discount-o.discount;
		//return this.pname.compareTo(o.pname);
	}
	
	// 103  101  100  105  102
	
	// 100  101   102  103  105
	
	
	
	
	
}
