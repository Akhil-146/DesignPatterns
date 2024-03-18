package AbstractFactory;

import AbstractFactory.notification.Notification;
import AbstractFactory.sender.NotificationSender;
import AbstractFactory.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    public abstract Notification createNotification(String sender, String recipient, NotificationTemplate notificationTemplate);

    public abstract NotificationSender createNotificationSender(Notification notification);

    public abstract NotificationTemplate createNotificationTemplate(String message);
}
