package factory.notification;

public class SMSNotification implements Notification{

    @Override
    public void notify(String message) {
        System.out.println("Sending SMS notification..."+message);
    }
}
