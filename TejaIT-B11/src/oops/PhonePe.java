package oops;

public interface PhonePe {
  void tickectBooking();  // declaration
  // by default methods are public & abstract

  public void test() {
	  // normal
  }
  
 public final static int id=25; // by default variables are public static final
 
 public PhonePe() {
	 // we can't create constructor for interface
 }
 
 {
	// we can't craate instance blocks
 }
 
 static{
	// we can't create static blocks 
 }
 public static void main(String[] args) {
	PhonePe ph=new PhonePe();// we can't create Object fro interface
}
}
