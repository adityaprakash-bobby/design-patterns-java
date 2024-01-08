package org.example.creational.factory.notification;

public class EmailNotification implements INotification {

    public void notifyUser() {
        System.out.println("Notifying user via E-mail");
    }
}
