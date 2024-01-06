package org.example.behavioral.factory.notification;

public class SMSNotification implements INotification {
    public void notifyUser() {
        System.out.println("Notifying user via SMS");
    }
}
