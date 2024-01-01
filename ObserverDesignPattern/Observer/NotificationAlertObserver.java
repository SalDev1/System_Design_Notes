package ObserverDesignPattern.Observer;

/*
 * When a product is out of stock , notify all the users 
 * that have clicked the notify me button.
 * 
 * And it is observing the StocksObserver.
 */
public interface NotificationAlertObserver {
    public void update();
}
