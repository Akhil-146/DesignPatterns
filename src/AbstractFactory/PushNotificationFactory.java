package AbstractFactory;

import AbstractFactory.notification.Notification;
import AbstractFactory.notification.PushNotification;
import AbstractFactory.sender.NotificationSender;
import AbstractFactory.sender.PushNotificationSender;
import AbstractFactory.template.NotificationTemplate;
import AbstractFactory.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String sender, String recipient, NotificationTemplate notificationTemplate) {
        return new PushNotification(recipient, notificationTemplate);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new PushNotificationTemplate(message);
    }
}
