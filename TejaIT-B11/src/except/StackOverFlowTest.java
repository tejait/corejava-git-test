package except;

public class StackOverFlowTest {

// when we have cyclic method calling	
	public void m1() {
		System.out.println("m1 method...");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method...");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method....");
		m1();
	}
	
	public static void main(String[] args) {
StackOverFlowTest sft=new StackOverFlowTest();
		sft.m1();
		//sft.m2();
		//sft.m3();		
	}
}
