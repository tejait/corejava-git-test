package factoryDesignPattern;

public class MailNotification implements Notification {
	
	@Override
	public void sendNotification() {
		// mail notification code
		System.out.println("Mail notification sent");
	}

}
