package AbstractFactory;

import AbstractFactory.notification.EmailNotification;
import AbstractFactory.notification.Notification;
import AbstractFactory.sender.EmailNotificationSender;
import AbstractFactory.sender.NotificationSender;
import AbstractFactory.template.EmailNotificationTemplate;
import AbstractFactory.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification createNotification(String sender, String recipient, NotificationTemplate notificationTemplate) {
        return new EmailNotification(recipient, sender, notificationTemplate);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }
}
