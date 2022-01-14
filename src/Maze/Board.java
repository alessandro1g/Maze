package Maze;

public class Board{
    private int[][] board;
    private int xSize;
    private int ySize;


    // constructor
    public Board( int xSize, int ySize ) {
        this.xSize = xSize;
        this.ySize = ySize;

        board = new int[xSize][ySize];
        //fill boards with e 
        // e = empty
        // w = wall
    }

    // this will take start and end coordinates which should
    // be in a strait line. The coordinates indicate a wall
    

    //this will print out the board
   /*
    public void displayBoard(){
        for (int i = 0; i <= xSize; i++){
            for (int y = 0; y <= ySize; y++){
                System.out.print(board[i][y]+", ");
            }
            System.out.println("");
        }
    } */

    public void clearboard(){
        // makes an empty new board
        for (int i = 0; i< xSize; i++){
            for (int y= 0; y < ySize; y++ ){
                board [i][y] = 0;
            }
        }
    }

    public void setBoard(int [] arr1, int [] arr2) throws Exception{
        // takes a start and end coordinate and will
        // make a line wall in between those points
        // they are arrays of size 2
        int a = 0;
        if (arr1.length != 2 || arr2.length != 2){
            throw new Exception("non valid coordinates");
            
        }

        
    }
    @Override
    public String toString(){
    	String a = "";
        for (int i = 0; i< xSize; i++){
            for (int y= 0; y < ySize; y++ ){
                a += board [i][y] + " ";
            }
            a += "\n";
        }



        return a;
    }

    public int[][] getboard(){
        return board;
    }
}