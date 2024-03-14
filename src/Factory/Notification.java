package Factory;

public abstract class Notification {
    protected String message;

    protected String recipient;

    public abstract NotificationType notificationType();

    public abstract void sendNotification();
}
