package boardgame;

public class Board {
	
	private int columns;
	private int rows;
	
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: the board must have at least 8 rows and 8 columns.");
		}
		this.columns = columns;
		this.rows = rows;
		
		pieces = new Piece[rows][columns];
	}

	public int getColumns() {
		return columns;
	}

	public int getRows() {
		return rows;
	}
	
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not exists on the board.");
		}
		
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not exists on the board.");
		}
		
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(Position position) {
		 return positionExists(position.getRow(), position.getColumn());
	}
	
	private boolean positionExists(int row, int column) {
		 return row >= 0 && row < this.rows && column >= 0 && column < this.columns;
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not exists on the board.");
		}
		
		return piece(position) != null;
	}
}
