package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	private int moveCount;
	
	private Color color;

	public ChessPiece(Board board, int moveCount, Color color) {
		super(board);
		this.moveCount = moveCount;
		this.color = color;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}

	public Color getColor() {
		return color;
	}

}
