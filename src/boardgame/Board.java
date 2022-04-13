package boardgame;

public class Board {
	private int rows;
	private int columns;

	private Piece[][] pieces;

	// constructor
	public Board() {

	}

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];

	}

	// Get's Set
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// methods
	public Piece piece(int rows, int columns) {
		if (!positionExists(rows, columns)) {
			throw new BoardException("essa posição não existe");
		}
		return pieces[rows][columns];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("essa posição não existe");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("ja existe uma peça nessa posição "+ position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public Boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	public Boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("essa posição não existe");
		}
		if (piece(position) == null) {
			return null ;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColumn()]= null;
		return aux ;
	}

	public Boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("peça não esta não existe");
		}
		return piece(position) != null;
	}

}
