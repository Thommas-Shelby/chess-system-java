package boardgame;

public class Board {
	private int rows;
	private int columns;
	
	private Piece[][] pieces;
	
	//constructor
 	public Board () {
		
	}
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; 
		
	}

	//Get's Set
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	//methods
	public Piece piece (int rows , int columns) {
		return pieces[rows][columns];
	}
	
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece , Position position) {
		
	}
	/*
	public Piece removePiece(Position position) {
		
	}
	
	public Boolean positionExists(Position position) {
		
	}
	
	public Boolean thereIsAPiece(Position position) {
		
	}
    */
}
