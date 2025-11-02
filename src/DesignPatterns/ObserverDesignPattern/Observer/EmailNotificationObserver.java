package src.DesignPatterns.ObserverDesignPattern.Observer;

public class EmailNotificationObserver implements StocksObserver{
    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail(){
        System.out.println("Email- Sent");
    }

    @Override
    public String getNotificationMethod() {
        return "Email Method Called";
    }

    @Override
    public String getUserId() {
        return "";
    }
}
