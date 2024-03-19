import Observer.Publisher;
import Observer.service.AppService;
import Observer.service.EmailService;
import Observer.service.SlackService;

public class ObserverClient {
    private static final Publisher publisher = new Publisher();

    public static void main(String[] args) {
        //Add observers
        initializeObservers();

        //New task added, notify the users about it
        Long taskId = 10023L;
        Long userId = 23424L;
        publisher.notifyObservers(taskId, userId);
    }

    public static void initializeObservers() {
        publisher.addObserver(new AppService());
        publisher.addObserver(new EmailService());
        publisher.addObserver(new SlackService());
    }
}
