package Maze;



public class Board{
    public Cell[][] board;
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
    
    public Cell getCell(int row, int col) {
    	return board[row][col];
    }
    
    
    
    public void tempSetElem(int x, int y, int[] setWall) {
    	//list will contain values 0 = top, 1 = right, 
    	//2 = bottom, 3 = left
    	//this is temporary as we will probably have a 
    	//file with instructions to build it
    	for (int i = 0 ; i<setWall.length;i++ ) {
    		if (setWall[i] == 0) {
    			board[x][y].wall.put("top",false);
    		}
    		
    		if (setWall[i] == 1) {
    			board[x][y].wall.put("right",false);
    		}
    		
        	if (setWall[i] == 2) {
        		board[x][y].wall.put("bottom",false);
        	}
            if (setWall[i] == 3) {
            	board[x][y].wall.put("left",false);
            }
    	}	
    }
    
    public String toString() {
    	String a = "";
    	for(int x = 0; x < xSize; x++) {
       	 	for(int y = 0; y < ySize; y++) {
       		 a += board[x][y].wall.containsValue(false) + " ";
       	 	}
       	 	a+= "\n";
    	}
    	return a;
    }
}