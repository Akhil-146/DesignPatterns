package AbstractFactory.notification;

import AbstractFactory.NotificationType;
import AbstractFactory.template.NotificationTemplate;

public class PushNotification extends Notification {
    public PushNotification(String recipient, NotificationTemplate template) {
        super(recipient, template);
    }
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public void sendNotification() {
        // Logic to send a push notification
        System.out.println("Push notification sent to device " + getRecipient());
        System.out.println("Message: " + getTemplate().getMessage());
    }
}
