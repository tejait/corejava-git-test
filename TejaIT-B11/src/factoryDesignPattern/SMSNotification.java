package factoryDesignPattern;

public class SMSNotification implements Notification{

	@Override
	public void sendNotification() {
	// sms notification code.....
		System.out.println("SMS notification sent");
	}

}
