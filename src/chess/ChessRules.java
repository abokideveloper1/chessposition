package chess;

import boardclasses.Board;

public class ChessRules {
	
	private Board board;
	
	public ChessRules() {
		
		board = new Board(8,8);
		
	}
	
	public ChessPiece [][] getPieces(){
		
		ChessPiece [][] game = new ChessPiece[board.getRows()][board.getColumns()];
		
		
	
	
	for (int i=0;i<board.getRows();i++) {
		
		for (int j=0;j<board.getColumns();j++) {
			
			
			game [i][j] = (ChessPiece) board.pieces(i,j);
		
		}
		
		
		
	}
	
	return game;

}
}
