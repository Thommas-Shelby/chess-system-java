package chess;

import boardgame.Position;

public class ChessPosition {
	
	private int row;
	private char column;
	
	//Constructor
	public ChessPosition () {
	}
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("quantidade linhas e colunar foi esta errado");
		}
		this.row = row;
		this.column = column;
	}

	
	//Get's Set
	public int getRow() {
		return row;
	}
	public char getColumn() {
		return column;
	}
	//Methods
	
	protected Position toPosition () {
		return new Position (8- row, column - 'a');
		
	}
	protected static ChessPosition fromPosition (Position position) {
		return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
		
	}

	@Override
	public String toString() {
		return "" + column + row ;
	}
	
	
}
