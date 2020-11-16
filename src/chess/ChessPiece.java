package chess;

import boardclasses.Board;
import boardclasses.Pieces;

public class ChessPiece extends Pieces {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	

}
