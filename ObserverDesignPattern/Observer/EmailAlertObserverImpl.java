package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable observable;

    // Using the constructor injection trick.
    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        // System.out.println(observable.getStockCount());
        if (observable.getStockCount() == 0) {
            sendMail(emailId, "Product is out of Stock !");
        } else {
            sendMail(emailId, "Product is in stock hurry up !");
        }
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to " + emailId + " " + msg + observable.getStockCount());
    }
}
