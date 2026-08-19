package factory.notification;

public class Main {

    public static void main(String[] args) {

        NotificationServiceFactory factory = new NotificationServiceFactory();
        factory.notifyUser(NotificationType.EMAIL,"hello user");
        factory.notifyUser(NotificationType.PUSH,"hello user");
        factory.notifyUser(NotificationType.SMS,"hello user");
        factory.notifyUser(NotificationType.WHATSAPP,"hello user");
    }
}
