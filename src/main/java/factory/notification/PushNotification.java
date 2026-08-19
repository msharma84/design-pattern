package factory.notification;

public class PushNotification implements Notification{

    @Override
    public void notify(String message) {
        System.out.println("Sending Push notification..."+message);
    }
}
