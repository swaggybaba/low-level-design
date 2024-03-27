package OnlineAuctionSystem;

import java.util.*;

public class Auction implements AuctionMediator {
	
	List<Colleague> colleagues;
	
	public Auction() {
		colleagues = new ArrayList<>();
	}
	
	@Override
	public void addBidder(Colleague bidder) {
		colleagues.add(bidder);
	}

	@Override
	public void placeBid(Colleague bidder, int bidAmount) {
		for(Colleague colleague: colleagues) {
			if(bidder.getName()!=colleague.getName()) {
				colleague.receiveBidNotification(bidAmount);
			}
		}
	}

}
