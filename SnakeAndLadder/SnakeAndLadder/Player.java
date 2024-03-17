package SnakeAndLadder;

public class Player {
	int currPosition;
	String id;
	
	public Player(int currPosition,String id) {
		this.currPosition=currPosition;
		this.id=id;
	}

	public int getCurrPosition() {
		return currPosition;
	}

	public void setCurrPosition(int currPosition) {
		this.currPosition = currPosition;
	}
	
}
