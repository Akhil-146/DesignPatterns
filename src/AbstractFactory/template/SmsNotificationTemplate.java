package AbstractFactory.template;

import AbstractFactory.NotificationType;

public class SmsNotificationTemplate extends NotificationTemplate {
    public SmsNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Sms notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
