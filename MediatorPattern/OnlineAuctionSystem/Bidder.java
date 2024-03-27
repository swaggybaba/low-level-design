package OnlineAuctionSystem;

public class Bidder implements Colleague {
	
	String name;
	AuctionMediator auctionMediator;
	
	public Bidder(String name, AuctionMediator auctionMediator) {
		this.name = name;
		this.auctionMediator = auctionMediator;
	}
	
	@Override
	public void placeBid(int bidAmount) {
		auctionMediator.placeBid(this, bidAmount);
	}

	@Override
	public void receiveBidNotification(int bidAmount) {
		System.out.println("Bidder "+ name +" got the information that someone has put the bid of amount "+bidAmount);		
	}

	@Override
	public String getName() {
		return name;
	}

}
