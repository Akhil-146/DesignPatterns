import AbstractFactory.AbstractFactoryHelper;
import AbstractFactory.NotificationFactory;
import AbstractFactory.NotificationType;
import AbstractFactory.notification.Notification;
import AbstractFactory.sender.NotificationSender;
import AbstractFactory.template.NotificationTemplate;

import java.util.Random;

public class AbstractFactoryClient {

    public static void main(String[] args) throws Exception {
        NotificationType notificationType = getNotificationType();
        System.out.println(notificationType);
        NotificationFactory notificationFactory = AbstractFactoryHelper.getNotificationFactoryByNotificationType(notificationType);

        NotificationTemplate notificationTemplate = notificationFactory.createNotificationTemplate("Sending a message");
        Notification notification = notificationFactory.createNotification("ABC", "XYZ", notificationTemplate);
        NotificationSender notificationSender = notificationFactory.createNotificationSender(notification);

        notification.sendNotification();
        notificationSender.send();
        notificationTemplate.applyTemplate();
    }

    public static NotificationType getNotificationType() {
        Random random = new Random();
        int num = random.nextInt(1, 4);
        if (num == 1)
            return NotificationType.EMAIL;
        else if (num == 2)
            return NotificationType.PUSH;
        else
            return NotificationType.SMS;
    }
}
