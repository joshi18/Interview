package src.DesignPatterns.ObserverDesignPattern.Observable;

import src.DesignPatterns.ObserverDesignPattern.Observer.StocksObserver;

public interface StocksObservable {



    void add(StocksObserver stocksObserver);

    void remove(StocksObserver stocksObserver);

    public void notifyMe();

    public void setData();

    public void getData();


}
