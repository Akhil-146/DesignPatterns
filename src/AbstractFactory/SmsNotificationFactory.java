package AbstractFactory;

import AbstractFactory.notification.Notification;
import AbstractFactory.notification.SmsNotification;
import AbstractFactory.sender.NotificationSender;
import AbstractFactory.sender.SmsNotificationSender;
import AbstractFactory.template.NotificationTemplate;
import AbstractFactory.template.SmsNotificationTemplate;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public Notification createNotification(String sender, String recipient, NotificationTemplate notificationTemplate) {
        return new SmsNotification(recipient, notificationTemplate);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new SmsNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new SmsNotificationTemplate(message);
    }
}
