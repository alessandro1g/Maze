package Maze;



public class Board{
    private Cell[][] board;
    private int xSize;
    private int ySize;


    // constructor
    public Board( int xSize, int ySize ) {
        this.xSize = xSize;
        this.ySize = ySize;

        board = new Cell[xSize][ySize];
        //fill boards with e 
        // e = empty
        // w = wall
        for(int x = 0; x < xSize; x++) {
        	 for(int y = 0; y < ySize; y++) {
        		 Cell cell = new Cell(x,y,board,xSize,ySize);
        		 board[x][y] = cell;
             }
        }
    }
    
    public String toString() {
    	String a = "";
    	for(int x = 0; x < xSize; x++) {
       	 	for(int y = 0; y < ySize; y++) {
       		 a += board[x][y].wall.size() + " ";
       	 	}
       	 	a+= "\n";
    	}
    	return a;
    }
}