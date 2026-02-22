package factoryDesignPattern;

public class FactoryDesign {

	Notification notificationObj=null; //new SMSNotifcation();
	public FactoryDesign(String type) {// sms, email, push,whatsapp	
		notificationObj=NotificationUtil.createNotifcationObject(type);
	}
	
	
	public void send() {
		notificationObj.sendNotification();
	}
}
