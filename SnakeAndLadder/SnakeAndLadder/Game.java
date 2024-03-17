package SnakeAndLadder;

import java.nio.channels.NonWritableChannelException;
import java.util.Deque;
import java.util.LinkedList;


public class Game {
	Board board;
	Deque<Player> players;
	Dice dice;
	
	public Game() {
		board = new Board(10, 5, 5);
		addPlayers(2);
		dice = new Dice(1);
	}
	
	void addPlayers(int numberOfPlayers) {
		players=new LinkedList<>();
		for(int i=0;i<numberOfPlayers;i++) {
			players.addLast(new Player(0, "Player"+i));
		}
	}
	
	void startGame() {
		Player winnerPlayer=null;
		while(winnerPlayer==null) {
			Player turnPlayer = players.removeFirst();
			System.out.println("Player Turn: "+turnPlayer.id);
			int diceRollScore = dice.getDiceRollScore();
			System.out.println("Current Position "+turnPlayer.getCurrPosition());
			turnPlayer.currPosition+=diceRollScore;
			turnPlayer.currPosition=board.checkForJump(turnPlayer.currPosition);
			System.out.println("Position after turn "+turnPlayer.getCurrPosition());
			if(turnPlayer.currPosition > board.cells.length*board.cells.length-1) {
				winnerPlayer=turnPlayer;
			}
			//adding in last after the turn
			players.addLast(turnPlayer);
		}
		System.out.println("Winner is: "+winnerPlayer.id);
	}
	
}
