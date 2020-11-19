package boardclasses;

import java.util.Arrays;

public class Board {
	
	private int rows;
	private int columns;
	private Pieces [][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

  public Pieces pieces(int row,int column) {
	  
	  return pieces [row] [column];
  }
  
  public Pieces pieces(Positions positions) {
	  
	  return pieces [positions.getRows()] [positions.getColumns()];
	  
  }
  
  public void placePiece(Pieces piece,Positions position) {
	  
	  pieces[position.getRows()][position.getColumns()] = piece;
	  piece.positions = position;
	  
  }
	
	

	
}
