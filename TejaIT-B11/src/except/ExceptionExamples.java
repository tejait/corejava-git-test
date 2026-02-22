package except;

public class ExceptionExamples {

	// once exception occurs, rest if the code will not execute
	
public void arithameticExceptionTest() {
	System.out.println("arithemetic start.........");
	try {
	int i=100;
	int j=0;
	int k=i/j; // 100/2 = 50 
	System.out.println(k);
	}catch (ArithmeticException e) {
		e.printStackTrace(); // it will print the exception
	}
System.out.println("arithmetic end...........");
}	
	
public void nullPointerException() {
	// when we are trying to perform any operation on null data
	System.out.println("nullpointer start.......");
	try {
	Integer i=100;
	Integer j=null;
	Integer k=i+j; //
	System.out.println(k);
	}catch (NullPointerException e) {
		e.printStackTrace();
	}
	System.out.println("nullpointer end...........");
}


public void numberFormatException(){
	System.out.println("number fromat start....");
	try {
	String val="125ab";
	Integer val2=Integer.valueOf(val); // classname.methodname
	System.out.println(val2);
	}catch (NumberFormatException e) {
		e.printStackTrace();
	}
	System.out.println("number format end.......");
}

public void interruptedException() throws InterruptedException  {
	
		Thread.sleep(100);
		System.out.println("interrupted exception");
	
}


public void CathcBlockTest() {
System.out.println("start........");
	try {
	int i=100;
	int j=0;
	int k=i/j;//50
	System.out.println(k);
	}catch (NullPointerException e) {
		e.printStackTrace();
	}catch (NumberFormatException e) {
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}catch (Throwable e) {
		e.printStackTrace();
	}
		
System.out.println("end...........");
}
public static void main(String[] args) throws InterruptedException {
	ExceptionExamples ee=new  ExceptionExamples();
	//ee.arithameticExceptionTest();
	//ee.nullPointerException();
	ee.numberFormatException();
	//ee.interruptedException();
     // ee.CathcBlockTest();
}






}
