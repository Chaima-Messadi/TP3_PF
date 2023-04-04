package ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class NotificationSystem extends Observable {
    private List<Notification> notifications;

    public NotificationSystem() {
        notifications = new ArrayList<>();
    }

    public void addNotification(Notification notification) {
        notifications.add(notification);
        setChanged();
        notifyObservers(notification);
    }
}
