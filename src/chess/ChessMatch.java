package chess;

import boardgame.Board;

public class ChessMatch {
	
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVunerable;
	private ChessPiece promoted;
	
	private Board board;
	
	//Constructor
	public ChessMatch() {
		board = new Board(8 , 8);
	}
	
	//Get's Set
	public Board getBoard() {
		return board;
	}
	
	
	//Methods
	public ChessPiece[][] getPieces () {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i =0 ; i< board.getRows();i++) {
			for (int j =0 ; j< board.getColumns() ; j++) {
				mat[i][j] =(ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	/*
	public boolean[][] possibleMoves (ChessPosition sourcePosition){
		
	}
	
	public ChessPosition performChessMove(ChessPosition sourcePosition , ChessPosition targetPosition) {
		
	}
	
	public ChessPiece replacePromotedPiece (String type) {
		
	}
	*/
}
