package methods;

public class MethodCalling2 {

	public int cloths() {
		int shirt=500;
		int tshirt=1200;
		int total=shirt+tshirt;
		return total;
	}	
	public int mobiles() {
		int mi=5000;
		int vivo=7000;
		int total=mi+vivo;
		return total;
	}
	public void totalBill() {
		System.out.println("this is totalBill method");
		int clothsBill=cloths();
		int mobileBill=mobiles();
		int totalBill=clothsBill+mobileBill;
		System.out.println(totalBill);
	}	
	public static void main(String[] args) {
		MethodCalling2 mc2=new MethodCalling2();
		mc2.totalBill();
	}
}
