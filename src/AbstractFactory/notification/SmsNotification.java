package AbstractFactory.notification;

import AbstractFactory.NotificationType;
import AbstractFactory.template.NotificationTemplate;

public class SmsNotification extends Notification {
    public SmsNotification(String recipient, NotificationTemplate template) {
        super(recipient, template);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public void sendNotification() {
        // Logic to send a Sms notification
        System.out.println("Sms notification sent to device " + getRecipient());
        System.out.println("Message: " + getTemplate().getMessage());
    }
}
