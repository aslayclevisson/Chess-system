package application;

import chess.ChessPiece;

public class UserInterface {
	
	public static void printBoard(ChessPiece[][] pieces) {
		for(int i = 0; i < pieces.length; i++) {
			
			System.out.print((8 - i) + " | ");
			
			for(int n = 0; n < pieces.length; n++) {
				printPiece(pieces[i][n]);
			}
			
			System.out.println();
		}
		System.out.println("  |________________");
		System.out.println("    a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {System.out.print("-");}
		else {System.out.print(piece);}
		
		System.out.print(" ");
	}
}
