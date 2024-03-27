package OnlineAuctionSystem;

public class Main {
	public static void main(String[] args) {
		
		AuctionMediator auctionMediator = new Auction();
		Colleague bidder1 = new Bidder("Bidder1", auctionMediator);
		Colleague bidder2 = new Bidder("Bidder2", auctionMediator);
		Colleague bidder3 = new Bidder("Bidder3", auctionMediator);
		auctionMediator.addBidder(bidder1);
		auctionMediator.addBidder(bidder2);
		auctionMediator.addBidder(bidder3);
		bidder1.placeBid(200);
		bidder2.placeBid(203);
		bidder3.placeBid(206);
		
	}
}
