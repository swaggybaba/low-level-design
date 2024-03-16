package Model;

public class Board {
	public int size;
	public PlayingPiece[][] board;
	
	public Board(int size) {
		this.size=size;
		board=new PlayingPiece[size][size];
	}
	
	public void printBoard() {
		for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                   System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
	}

	public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
		if(board[row][column] != null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;
	}

	public int getFreeCellsCount() {
		int freePos=0;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]==null) {
					freePos++;
				}
			}
		}
		return freePos;
	}
}
