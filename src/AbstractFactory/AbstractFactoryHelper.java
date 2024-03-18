package AbstractFactory;

public  class AbstractFactoryHelper {
        public static NotificationFactory getNotificationFactoryByNotificationType(NotificationType notificationType) throws Exception {
            if (notificationType.equals(NotificationType.EMAIL))
                return new EmailNotificationFactory();
            else if (notificationType.equals(NotificationType.PUSH))
                return new PushNotificationFactory();
            else if (notificationType.equals(NotificationType.SMS))
                return new SmsNotificationFactory();
            else
                throw new UnsupportedOperationException("This notification type is not yet supported");
        }
    }

