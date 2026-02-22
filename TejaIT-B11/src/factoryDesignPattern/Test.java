package factoryDesignPattern;

public class Test {

	
	public void sendNotification(String type) {//sms
		FactoryDesign fd=new  FactoryDesign(type); // Object
					fd.send();
	}
	
	
	public static void main(String[] args) {
		Test t=new Test();
		     t.sendNotification("push");
	}
}
