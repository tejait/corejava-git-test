package methods;

public class MethodCalling1 {

public int cloths() {
	int shirt=500;
	int tshirt=400;
	int total=shirt+tshirt; //900=500+400;
	return total;//900
}
	

public int mobile() {
	int mi=2000;
	int realme=3000;
	int total=mi+realme;
	return total;
}

public static void main(String[] args) {
	MethodCalling1 mc1=new MethodCalling1();
        int clothsBill=mc1.cloths();
        int mobileBill=mc1.mobile();
        int totalBill=clothsBill+mobileBill;
        System.out.println(totalBill);
}
}
