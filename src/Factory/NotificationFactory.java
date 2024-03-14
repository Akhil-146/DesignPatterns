package Factory;

public class NotificationFactory {
    public static Notification getNotification(NotificationType notificationType, String recipient, String message, String sender) {
        if (notificationType.equals(NotificationType.EMAIL))
            return new EmailNotification(recipient, sender, message);
        else if (notificationType.equals(NotificationType.SMS))
            return new SMSNotification(recipient, message);
        else if (notificationType.equals(NotificationType.PUSH))
            return new PushNotification(recipient, message);
        else
            throw new UnsupportedOperationException("This Notification Type is not available yet");
    }
}
