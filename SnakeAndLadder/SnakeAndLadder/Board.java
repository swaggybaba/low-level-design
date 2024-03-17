package SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
	Cell cells[][];
	
	public Board(int boardSize,int numOfLadders,int numOfSnakes) {
		initialiseBoard(boardSize);
		addSnakeAndLadders(numOfLadders,numOfSnakes);
	}
	
	void addSnakeAndLadders(int numOfLadders, int numOfSnakes) {
		int snakeCnt=0;
		while(snakeCnt<numOfSnakes) {
			int start=ThreadLocalRandom.current().nextInt(0,cells.length*cells.length-1);
			int end=ThreadLocalRandom.current().nextInt(0,cells.length*cells.length-1);
			if(start<=end) {
				continue;
			}
			snakeCnt++;
			int cellIndexes[]=getCellIndexes(start);
			cells[cellIndexes[0]][cellIndexes[1]]=new Cell(start, end);
		}
		int ladderCnt=0;
		while(ladderCnt<numOfLadders) {
			int start=ThreadLocalRandom.current().nextInt(0,cells.length*cells.length-1);
			int end=ThreadLocalRandom.current().nextInt(0,cells.length*cells.length-1);
			if(start>=end) {
				continue;
			}
			int cellIndexes[]=getCellIndexes(start);
			if(cells[cellIndexes[0]][cellIndexes[1]].jump!=null) {
				continue;
			}
			cells[cellIndexes[0]][cellIndexes[1]]=new Cell(start, end);
			ladderCnt++;
		}
		
	}
	int[] getCellIndexes(int ind) {
		return new int[] {ind/cells.length,ind%cells.length};
	}

	void initialiseBoard(int boardSize) {
		cells=new Cell[boardSize][boardSize];
		for(int i=0;i<boardSize;i++) {
			for(int j=0;j<boardSize;j++) {
				cells[i][j]=new Cell();
			}
		}
	}
	
	int checkForJump(int currentPosition) {
		int cellIndexes[]=getCellIndexes(currentPosition);
		if(currentPosition>cells.length*cells.length-1) {
			return currentPosition;
		}
		if(cells[cellIndexes[0]][cellIndexes[1]].jump!=null && cells[cellIndexes[0]][cellIndexes[1]].jump.start==currentPosition) {
			int start=cells[cellIndexes[0]][cellIndexes[1]].jump.start;
			int end=cells[cellIndexes[0]][cellIndexes[1]].jump.end;
			if(end<start)
				System.out.println("Snake: Jump from "+start+" to "+end);
			else {
				System.out.println("Ladder: Jump from "+start+" to "+end);
			}
			return end;
		}
		return currentPosition;
	}
}
