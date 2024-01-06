package org.example.behavioral.factory.notification;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        INotification notification = factory.createNotification("SMS");
        notification.notifyUser();
    }
}
