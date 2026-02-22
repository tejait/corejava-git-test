package factoryDesignPattern;

public class NotificationUtil {

	public static Notification createNotifcationObject(String type) {// sms, email, push,whatsapp
		
	Notification obj=null;
		switch (type) {
		case "sms":
			     obj=new SMSNotification();
			break;
		case "mail":
				obj=new MailNotification();
			break;
		case "push":
				obj=new PushNotification();
			break;
		case "whatsapp":
				obj=new Whatsapp();
			break;		
		default:
			break;
		}
			
		return obj;// sms, email, push,whatsapp	
	}
}
