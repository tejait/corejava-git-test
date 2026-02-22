package oops;

public final class FinalTest extends FinalTest2{

	final int id=22; //0
	
	@Override
	public void data() {
	//	id=35;
		System.out.println("Finala Test Data method."+id);//35
	}
	
	public static void main(String[] args) {
		FinalTest ft=new FinalTest();
		System.out.println(ft.id); //22
		ft.data();
	}
}
