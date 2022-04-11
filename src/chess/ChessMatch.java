package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

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
		initialSetup();
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
	
	private void initialSetup () {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
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
