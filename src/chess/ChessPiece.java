package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	
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
	//Methods
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
		
	}
	/*
	public ChessPosition getChessPosition() {
		
	}
	
	protected void increaseMoveCount() {
		
		
	}
	
	protected void decreaseMoveCount() {
		
	}
	*/
}
