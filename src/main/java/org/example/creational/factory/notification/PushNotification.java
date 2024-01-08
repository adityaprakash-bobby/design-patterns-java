package org.example.creational.factory.notification;

public class PushNotification implements INotification {
    public void notifyUser() {
        System.out.println("Notifying user via Push Notification");
    }
}
