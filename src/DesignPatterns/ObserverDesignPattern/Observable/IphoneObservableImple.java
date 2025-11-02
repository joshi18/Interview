package src.DesignPatterns.ObserverDesignPattern.Observable;

import src.DesignPatterns.ObserverDesignPattern.Observer.StocksObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImple  implements StocksObservable{
    private final String productId;
    private final String productName;
    private final List<StocksObserver> stocksObserverList;
    private final int stocksQuantity ;

    public IphoneObservableImple(String productId, String productName, List<StocksObserver> stocksObserverList, int stocksQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.stocksObserverList = stocksObserverList;
        this.stocksQuantity = stocksQuantity;
    }


    @Override
    public void add(StocksObserver stocksObserver) {
        stocksObserverList.add(stocksObserver);
        System.out.println("User Added");


    }

    @Override
    public void remove(StocksObserver stocksObserver) {
        stocksObserverList.remove(stocksObserver);
        System.out.println("User Removed");

    }

    @Override
    public void notifyMe() {
        if (stocksQuantity>0 && !stocksObserverList.isEmpty()){
            List<StocksObserver> copyOfStocksObservers = new ArrayList<>(stocksObserverList);
            for (StocksObserver observer : copyOfStocksObservers){
                observer.update();
            }
        }

    }

    @Override
    public void setData() {

    }

    @Override
    public void getData() {

    }
}
