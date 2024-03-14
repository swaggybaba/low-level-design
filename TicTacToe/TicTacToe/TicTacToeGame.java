package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;

import Model.Board;
import Model.PieceType;
import Model.Player;
import Model.PlayingPiece;

public class TicTacToeGame {
	Deque<Player> players;
	Board gameBoard;
	
	public TicTacToeGame() {
		players=new LinkedList<>();
		gameBoard=new Board(3);
		initialiseGame();
	}
	
	public void initialiseGame() {
		players.add(new Player("Prafful", new PlayingPiece(PieceType.X)));
		players.add(new Player("Raja", new PlayingPiece(PieceType.O)));
	}
	
	public void startGame() {
		
	}
	
}
