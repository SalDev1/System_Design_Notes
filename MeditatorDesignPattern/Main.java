package MeditatorDesignPattern;

public class Main {
    public static void main(String[] args) {

        AuctionMediator auctionMediatorObj = new Auction();
        Bidder bidder1 = new Bidder("Alice", auctionMediatorObj);
        Bidder bidder2 = new Bidder("Bob", auctionMediatorObj);

        bidder1.placeBid(2000);
        bidder1.placeBid(2500);
        bidder2.placeBid(3000);
    }
}
