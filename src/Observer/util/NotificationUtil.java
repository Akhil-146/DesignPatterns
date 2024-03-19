package Observer.util;

public class NotificationUtil {
    public static void sendEmail(String subject, String content) {
        System.out.println("Email Notification sent with subject as " +subject + " , and content is " +content);
    }

    public static void sendSlack(String subject, String content) {
        System.out.println("Slack Notification sent with subject as " +subject + " , and content is " +content);
    }

    public static void sendPush(String subject, String content) {
        System.out.println("Push Notification sent with subject as " +subject + " , and content is " +content);
    }
}
