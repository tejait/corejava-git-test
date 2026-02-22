package methods;

public class MethodCalling3 {

   int total;// 0,700, 400 ,6000	
	public int mobiles() {
		int mi=200;
		int realme=500;
		total=mi+realme; //700
		return total;
	}
	
	public int cloths() {
		int shirt=200;
		int tshirt=200;
		total=shirt+tshirt; //400
		return total;
	}
	
	public int electronics() {
		int tv=2000;
		int camera=4000;
		total=tv+camera;//6000
		return total;
	}
	public void total() {
		int mobileBill=mobiles();
		int clothsBill=cloths();
		int electronincsBill=electronics();
		int totalBill=mobileBill+clothsBill+electronincsBill;
		int finalBill=discount(totalBill); //5000
		System.out.println(totalBill);
		System.out.println(finalBill);
	}
	public int discount(int totalBill) {//5000
	
		int paybleAmt=0; //0, 950
		if(totalBill<1000) {// 1k below - 5%
			int discount=100-5; //95
			 paybleAmt=(totalBill*discount)/100; 
		}else if(totalBill>999 && totalBill<2000){// 10%
			int discount=100-10;
			 paybleAmt=(totalBill*discount)/100;
		}else if(totalBill>2000 && totalBill<5000) {// 20%
			int discount=100-20;
			 paybleAmt=(totalBill*discount)/100;
		}else {//25%
			int discount=100-25;
			 paybleAmt=(totalBill*discount)/100;
		}
		return paybleAmt;//0, 950
	}
	
	
	
	public static void main(String[] args) {
		MethodCalling3 mc3=new MethodCalling3();
		mc3.total();
	}
}
