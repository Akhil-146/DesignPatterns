package Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements ObserverRegistry {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Long taskId, Long userId) {
        observers.forEach(observer -> observer.notifyObserver(taskId, userId));
    }
}
