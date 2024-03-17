package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	int diceCount;
	
	public Dice(int diceCount) {
		this.diceCount=diceCount;
	}
	
	int getDiceRollScore() {
		int score=0;
		for(int i=0;i<diceCount;i++) {
			score+=ThreadLocalRandom.current().nextInt(1,6);
		}
		return score;
	}
}
