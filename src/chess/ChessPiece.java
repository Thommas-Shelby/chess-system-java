package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;
	
//Constructor	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
//Get's Set
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	/*Methods
	public ChessPosition getChessPosition() {
		
	}
	
	protected Boolean isThereOpponentPiece(Position position) {
		
	}
	
	protected void increaseMoveCount() {
		
		
	}
	
	protected void decreaseMoveCount() {
		
	}
	*/
}
