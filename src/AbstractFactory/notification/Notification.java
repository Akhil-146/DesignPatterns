package AbstractFactory.notification;

import AbstractFactory.NotificationType;
import AbstractFactory.template.NotificationTemplate;

public abstract class Notification {
    private String recipient;
    private NotificationTemplate template;

    public Notification(String recipient, NotificationTemplate template) {
        this.recipient = recipient;
        this.template = template;
    }

    public String getRecipient() {
        return recipient;
    }

    public NotificationTemplate getTemplate() {
        return template;
    }

    public abstract NotificationType notificationType();

    public abstract void sendNotification();
}
