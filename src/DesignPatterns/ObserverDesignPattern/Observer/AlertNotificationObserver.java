package src.DesignPatterns.ObserverDesignPattern.Observer;

public class AlertNotificationObserver implements StocksObserver{

    @Override
    public void update() {

        sendPushNotification();

    }
    public void sendPushNotification(){
        System.out.println("Notification sent to the subscriber");
    }

    @Override
    public String getNotificationMethod() {
        return "Push Notification";
    }

    @Override
    public String getUserId() {
        return "";
    }
}
