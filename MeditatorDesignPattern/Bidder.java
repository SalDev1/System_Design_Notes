package MeditatorDesignPattern;

public class Bidder implements Colleague{

    public String name;
    public AuctionMediator auctionMediator;

    Bidder(String name , AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        // TODO Auto-generated method stub
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        // TODO Auto-generated method stub
        System.out.println("Bidder: " + name + " received notification of a new bid: " + bidAmount);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }
}
