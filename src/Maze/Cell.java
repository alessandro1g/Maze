package Maze;
import java.util.HashMap;

public class Cell{
	public int row;
	public int col;
	public Cell[][] b;
	public int xsize;
	public int ysize;
	public Cell parent;
	public HashMap<String, Boolean> wall;
	public boolean visited;
	
	
	public Cell(int Row, int Col, Cell[][] board, int xSize, int ySize ) {
		this.row = Row; 
		this.col = Col; 
		this.b = board; 
		//we use the parent board since we want to refer to each cells neighbor
		this.xsize = xSize; 
		this.parent = null;
		this.ysize = ySize; 
		this.wall = new HashMap<String, Boolean>();
		this.visited = false;
		wall.put("top",true);
		wall.put("right",true);
		wall.put("bottom",true);
		wall.put("left",true);
		
	}
}
