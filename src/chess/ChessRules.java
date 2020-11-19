package chess;

import boardclasses.Board;
import boardclasses.Positions;
import chess.pieces.King;
import chess.pieces.Rook;


public class ChessRules {
	
	private Board board;
	
	public ChessRules() {
		
		board = new Board(8,8);
		
		initializeSetup();
		
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
	private void initializeSetup() {
		
		board.placePiece(new Rook(board , Color.WHITE) , new Positions(2 , 1));
		board.placePiece(new King(board , Color.BLACK),new Positions(0 ,4));
		board.placePiece(new King(board , Color.WHITE), new Positions(7 ,4));
		
	}
}

