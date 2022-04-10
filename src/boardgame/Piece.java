package boardgame;

public class Piece {
	
	protected Position position;
	
	private Board board;
	
	//constructor
	public Piece( ) {
		
	}
	
	
	public Piece( Board board) {
		this.board = board;
		
	}

	//Get's Set
	public Position getPosition() {
		return position;
	}
	
	protected Board getBoard() {
		return board;
	}

	/*methods
	public Boolean possibleMoves() {
		
	}
	public Boolean possibleMove(Position position) {
		
	}
	public Boolean isThereAnyPossibleMove() {
		
	}
	*/
}
