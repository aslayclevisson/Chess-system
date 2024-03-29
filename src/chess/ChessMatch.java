package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Bishop;
import chess.pieces.Horse;
import chess.pieces.King;
import chess.pieces.Pawn;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
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
	
	//Start game
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(3,1));
		board.placePiece(new King(board, Color.BLACK), new Position(5,3));
		board.placePiece(new Queen(board, Color.WHITE), new Position(1,1));
		board.placePiece(new Bishop(board, Color.BLACK), new Position(3,2));
		board.placePiece(new Pawn(board, Color.WHITE), new Position(6,7));
		board.placePiece(new Horse(board, Color.BLACK), new Position(4,4));
	}
	
	
}
