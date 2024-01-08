package org.example.creational.factory.notification;

public class NotificationFactory {

    public INotification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }

        switch (channel) {
            case "SMS": return new SMSNotification();
            case "PUSH": return new PushNotification();
            case "EMAIL": return new EmailNotification();
            default:
                throw new IllegalArgumentException("unknown channel: " + channel);
        }
    }
}
