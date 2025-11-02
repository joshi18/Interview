package src.DesignPatterns.ObserverDesignPattern;

import src.DesignPatterns.ObserverDesignPattern.Observable.IphoneObservableImple;
import src.DesignPatterns.ObserverDesignPattern.Observer.AlertNotificationObserver;
import src.DesignPatterns.ObserverDesignPattern.Observer.EmailNotificationObserver;
import src.DesignPatterns.ObserverDesignPattern.Observer.StocksObserver;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StocksObserver s1 = new EmailNotificationObserver();
        StocksObserver s2 = new AlertNotificationObserver();
        StocksObserver s3 = new EmailNotificationObserver();
        List<StocksObserver> stocksObserverList = new ArrayList<>();
        stocksObserverList.add(s1);
        stocksObserverList.add(s2);
        stocksObserverList.add(s3);

        IphoneObservableImple iphoneObservableImple = new IphoneObservableImple("456","Iphone",stocksObserverList,30);

        iphoneObservableImple.notifyMe();
        iphoneObservableImple.notifyMe();

    }
}
