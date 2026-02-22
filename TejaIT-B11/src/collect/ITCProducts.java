package collect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ITCProducts {

	int pid;
	String pname;
	int price;
	int discount;
	
	public ITCProducts(int pid, String pname, int price, int discount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.discount = discount;
	}
	
	
	@Override
	public String toString() {
		return "ITCProducts [pid=" + pid + ", pname=" + pname + ", price=" + price + ", discount=" + discount + "]";
	}


	public static void main(String[] args) {
		ITCProducts i1=new ITCProducts(105, "sunfeast", 50, 5);
		ITCProducts i2=new ITCProducts(103, "oreao", 70, 4);
		ITCProducts i3=new ITCProducts(104, "Bingo", 10, 2);
		ITCProducts i4=new ITCProducts(107, "maggie", 150, 10);
		ITCProducts i5=new ITCProducts(101, "clinic plus", 20, 1);
		
		List<ITCProducts> list=Arrays.asList(i1,i2,i3,i4,i5);
		
		String filterType="id";// id, name, price, discount
		String orderType="ASC";
		
		if(filterType.equals("id")) {
			Collections.sort(list, new BasedOnId());
		}else if(filterType.equals("name")) {
			Collections.sort(list, new BasedOnName());
		}else if(filterType.equals("price")) {
			Collections.sort(list, new BasedOnPrice());
		}else if(filterType.equals("discount")) {
			Collections.sort(list,new BasedOnDiscount());
		}
		
		if(orderType.equals("DESC")) {
			Collections.reverse(list);
		}
		
		for(ITCProducts itc:list) {
			System.out.println(itc);
		}
		
	}
	
	
}
