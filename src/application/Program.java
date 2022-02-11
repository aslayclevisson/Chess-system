package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		Position position = new Position(7, 9);
		
		System.out.println("♔ ♕ ♖ ♗ ♘ ♙ ♚ ♛ ♜ ♝ ♞ ♟");
		
		System.out.println(position);
		
		
		Board board = new Board(12,12);
		
		ChessMatch chessMatch = new ChessMatch();
		
		UserInterface.printBoard(chessMatch.getPieces());
	}

}
