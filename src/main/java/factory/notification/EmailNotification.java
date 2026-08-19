package factory.notification;

public class EmailNotification implements Notification{

    @Override
    public void notify(String message) {
        System.out.println("Sending Email notification..."+message);
    }
}
