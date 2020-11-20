package boardclasses;

import java.util.Arrays;

public class Board {
	
	private int rows;
	private int columns;
	private Pieces [][] pieces;
	
	public Board(int rows, int columns) {
		
		if(rows < 1 && columns < 1) {
			
			throw new BoardException("Error creating board,there must be at least 1 row and 1 column");
		}
		
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces[rows][columns];
	}

	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}

  public Pieces pieces(int row,int column) {
	  
	  if(!positionExists(rows,columns)) {
		  
		  throw new BoardException("No position on board");
		  
	  }
	  
	  return pieces [row] [column];
  }
  
  public Pieces pieces(Positions positions) {
	  
	  if(!positionExists(rows,columns)) {
		  
		  throw new BoardException("No position on board");
		  
	  }
	  
	  return pieces [positions.getRows()] [positions.getColumns()];
	  
  }
  
  public void placePiece(Pieces piece,Positions position) {
	  
	  if(thereIsAPiece(position)) {
		  
		  throw new BoardException("There is already a piece on position " + position);
		  
	  }
	  
	  pieces[position.getRows()][position.getColumns()] = piece;
	  piece.positions = position;
	  
  }
  
  private boolean positionExists(int rows , int columns) {
	  
	  return rows >= 0 && rows <= rows && columns >=0 && columns<= columns;
	  
  }
  
  public boolean positionExists(Positions position) {
	  
	  return positionExists(position.getRows() , position.getColumns());
	  
  }
  
  public boolean thereIsAPiece(Positions position) {
	  
	  if(!positionExists(position)) {
		  
		  throw new BoardException("No position on board");
		  
	  }
	  
	 return pieces(position) != null;
	  
  }
  
  
	
	

	
}
