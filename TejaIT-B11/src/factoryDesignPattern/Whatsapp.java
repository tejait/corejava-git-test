package factoryDesignPattern;

public class Whatsapp implements Notification{
	
	@Override
	public void sendNotification() {
		System.out.println("Whatsapp notification sent");
	}

}
