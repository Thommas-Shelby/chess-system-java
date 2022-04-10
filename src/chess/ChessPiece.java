package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;
	private int   moveCount;
	
//Constructor	
	public ChessPiece(Board board, Color color, int moveCount) {
		super(board);
		this.color = color;
		this.moveCount = moveCount;
	}
//Get's Set
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
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