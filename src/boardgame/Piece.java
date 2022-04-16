package boardgame;

public abstract class Piece {

	protected Position position;

	private Board board;

	// constructor
	public Piece() {

	}

	public Piece(Board board) {
		this.board = board;
	}

	// Get's Set
	public Position getPosition() {
		return position;
	}

	protected Board getBoard() {
		return board;
	}

	// methods
	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() { // PelomenosUmMovimentoPosivel
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;

	}

}
