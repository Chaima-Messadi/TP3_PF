package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();

        NotificationCounterDisplay counterDisplay = new NotificationCounterDisplay();
        NotificationContentDisplay contentDisplay = new NotificationContentDisplay();

        notificationSystem.addObserver(counterDisplay);
        notificationSystem.addObserver(contentDisplay);

        notificationSystem.addNotification(new Notification("New message received"));
        notificationSystem.addNotification(new Notification("New email received"));
    }
}

