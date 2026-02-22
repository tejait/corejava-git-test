package except;

public class FinallyBlockTest {

	// no exception - try block will execute & finally block
	// if exception occurs- catch block will execute & finally block
	// finally block will execute always, either we are getting exception or not
	public void test() {
		try {
		int i=100;
		int j=0;
		int k=i/j;
		System.out.println(k);
		System.out.println("try block");
		}catch (Exception e) {
			System.out.println("catch block..");
			e.printStackTrace();
		}finally {
			System.out.println("finally block");	
			//session.close();
		}
	}
	
	public static void main(String[] args) {
		FinallyBlockTest fbt=new FinallyBlockTest();
		fbt.test();
	}
}
