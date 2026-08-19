package factory.notification;

public class NotificationServiceFactory {

    public void notifyUser(NotificationType type,String message){

        Notification notification;

        if("SMS".equalsIgnoreCase(type.name())){
            notification = new SMSNotification();
            notification.notify(message);
        } else if ("PUSH".equalsIgnoreCase(type.name())) {
            notification = new PushNotification();
            notification.notify(message);
        } else if ("WHATSAPP".equalsIgnoreCase(type.name())) {
            notification = new WhatsAppNotification();
            notification.notify(message);
        } else if ("EMAIL".equalsIgnoreCase(type.name())) {
            notification = new EmailNotification();
            notification.notify(message);
        }else {
            throw new IllegalArgumentException("Notification type not found...");
        }
    }
}
