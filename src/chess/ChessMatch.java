package chess;

import boardgame.Board;

public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i = 0; i < board.getRows(); i++) {
			for(int n = 0; n < board.getColumns(); n++) {
				//down casting
				matrix[i][n] = (ChessPiece) board.piece(i, n);
			}
		}
		
		return matrix;
	}
}
