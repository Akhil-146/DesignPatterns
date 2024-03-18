package AbstractFactory.sender;

import AbstractFactory.NotificationType;
import AbstractFactory.notification.Notification;

public class SmsNotificationSender extends NotificationSender {
    public SmsNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Sms notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
