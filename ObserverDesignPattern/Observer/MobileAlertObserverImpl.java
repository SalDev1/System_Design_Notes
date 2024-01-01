package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StocksObservable observable;

    // Using the constructor injection trick.
    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.observable = observable;
        this.userName = userName;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        // System.out.println(observable.getStockCount());
        if (observable.getStockCount() == 0) {
            sendMessage(userName, "Product is out of Stock !");
        } else {
            sendMessage(userName, "Product is in stock hurry up !");
        }
    }

    private void sendMessage(String userName, String msg) {
        System.out.println("message sent to " + userName + " " + msg + observable.getStockCount());
    }
}
