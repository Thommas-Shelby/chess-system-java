package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	//Constructor
	public Position () {
		
	}
	
	public Position(int row, int column) {
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

	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	//Methods
	public void setValues (int row , int column) {
	
		
	}

	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
}
