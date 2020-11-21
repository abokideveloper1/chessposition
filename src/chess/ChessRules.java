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
	
	private void placeNewPiece(char column,int row,ChessPiece piece) {
		
		
		board.placePiece(piece, new ChessPosition(column,row).toPosition());
		
	}
	
	
	private void initializeSetup() {
		
		placeNewPiece('b', 6 ,new Rook(board , Color.WHITE));
	placeNewPiece('e',8,new King(board , Color.BLACK));
		placeNewPiece('e',1,new King(board , Color.WHITE));
		
	}
}

