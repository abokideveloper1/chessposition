package boardclasses;

public class Pieces {
	
	protected Positions positions;
	private Board board;
	
	public Pieces(Board board) {
		this.board = board;
		positions = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
	

}
