package AbstractFactory.notification;

import AbstractFactory.NotificationType;
import AbstractFactory.template.NotificationTemplate;

public class EmailNotification extends Notification {
    private String sender;

    public EmailNotification(String recipient, String sender, NotificationTemplate template) {
        super(recipient, template);
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + getRecipient() + " from " + sender);
        System.out.println("Message: " + getTemplate().getMessage());
    }
}
