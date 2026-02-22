package oops;

public class BlocksTest {
	
	public BlocksTest(){// execute after creation of Object
		System.out.println("constructor..");
	}
	
	{// will execute after creation Object
		System.out.println("instance block");
	}
	
	static{ // will execute while class loading itself
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		BlocksTest bt=new BlocksTest(); // instance/Object
	}
}
