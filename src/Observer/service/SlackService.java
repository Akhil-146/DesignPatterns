package Observer.service;

import Observer.Observer;
import Observer.util.NotificationUtil;

public class SlackService implements Observer {
    @Override
    public void notifyObserver(Long taskId, Long userId) {
        String subject = "New task assigned";
        String message = "Task %s assigned to user %s";
        NotificationUtil.sendSlack(subject, String.format(message, taskId, userId));
    }
}
