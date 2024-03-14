package Factory;

public class SMSNotification extends Notification {
    private String recipient;
    private String message;

    public SMSNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }

    @Override
    public void sendNotification() {
        // Logic to send an SMS
        System.out.println("SMS sent to " + recipient);
        System.out.println("Message: " + message);
    }
}
