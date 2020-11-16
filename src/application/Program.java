package application;
import boardclasses.Board;
import chess.ChessRules;

public class Program {

	public static void main(String[] args) {
		
		ChessRules ChessGame = new ChessRules();
		UI.printBoard(ChessGame.getPieces());

	}

}
