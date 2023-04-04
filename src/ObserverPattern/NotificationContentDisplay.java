package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class NotificationContentDisplay implements Observer {
    public void update(Observable obs, Object obj) {
        if (obj instanceof Notification) {
            Notification notification = (Notification) obj;
            display(notification.getContent());
        }
    }

    public void display(String content) {
        System.out.println("Notification content: " + content);
    }
}

