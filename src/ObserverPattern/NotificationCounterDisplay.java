package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class NotificationCounterDisplay implements Observer {
    private int count;

    public void update(Observable obs, Object obj) {
        if (obj instanceof Notification) {
            count++;
            display();
        }
    }

    public void display() {
        System.out.println("Notification counter: " + count);
    }
}

