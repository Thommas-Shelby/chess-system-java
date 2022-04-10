package chess;

public class ChessPosition {
	
	private int row;
	private char column;
	
	//Constructor
	public ChessPosition () {
	}
	
	public ChessPosition(int row, char column) {
		this.row = row;
		this.column = column;
	}

	
	//Get's Set
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	
	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}
	
	/*methods
	
	protected Position toPosition () {
		
		
	}
	protected ChessPosition fromPosition (Position position) {
		
		
	}
	*/
}
