package except;

public class FinallyTest2 {

	public int test() {
	try {
		int i=100;
		int j=0;
		int k=i/j;
		//System.out.println(k);
		return 12;
	}catch (Exception e) {
			e.printStackTrace();
		return 15;
	}finally {
		return 25;
	}
	}
	
	public static void main(String[] args) {
		FinallyTest2 ft2=new FinallyTest2();
		System.out.println(ft2.test());
	}
}
