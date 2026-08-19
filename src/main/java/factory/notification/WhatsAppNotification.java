package factory.notification;

public class WhatsAppNotification implements Notification{

    @Override
    public void notify(String message) {
        System.out.println("Sending WhatsApp notification..."+message);
    }
}
