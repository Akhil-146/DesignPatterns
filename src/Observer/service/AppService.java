package Observer.service;

import Observer.Observer;
import Observer.util.NotificationUtil;

public class AppService implements Observer {
    @Override
    public void notifyObserver(Long taskId, Long userId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtil.sendPush(subject, String.format(message, taskId, userId));
    }
}
