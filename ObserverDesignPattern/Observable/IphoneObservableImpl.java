package ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StocksObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        // TODO Auto-generated method stub
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        // TODO Auto-generated method stub
        for (NotificationAlertObserver obsever : observerList) {
            obsever.update();
        }
    }

    @Override
    public void setStockCount(int nextStockAdded) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + nextStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
