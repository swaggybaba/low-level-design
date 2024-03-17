package SnakeAndLadder;

public class Cell {
	Jump jump;
	
	public Cell() {
		
	}
	
	public Cell(int start,int end) {
		jump=new Jump(start,end);
	}
}
