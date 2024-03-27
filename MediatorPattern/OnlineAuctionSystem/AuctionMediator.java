package OnlineAuctionSystem;

public interface AuctionMediator {

	public void addBidder(Colleague colleague);
	public void placeBid(Colleague colleague, int bidAmount);
	
}
