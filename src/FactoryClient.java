import Factory.Notification;
import Factory.NotificationFactory;
import Factory.NotificationType;

import java.util.Random;

public class FactoryClient {
    public static void main(String[] args) {
        NotificationType notificationType = getNotificationType();
        Notification notification = NotificationFactory.getNotification(notificationType, "World", "Hello World...", "Akhil");
        notification.sendNotification();
    }

    public static NotificationType getNotificationType() {
        Random random = new Random();
        int num = random.nextInt(1, 4);
        if (num == 1)
            return NotificationType.EMAIL;
        else if (num == 2)
            return NotificationType.SMS;
        else
            return NotificationType.PUSH;

    }
}
