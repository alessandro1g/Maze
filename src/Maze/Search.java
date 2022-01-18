package Maze;
import javax.swing.JFrame;
import java.util.Stack;

public class Search {
	//0 is start
	//1 is empty cell
	//2 is current path
	//3 is end
	private static int xSize;
	private static int ySize;
	static private Stack<Cell> stack = new Stack<Cell>();

	

	
	
	private boolean inX (int x) {
		return x >= 0; 
	}
	
	private boolean inBoundsX(int number) {
		return number >= 0 && number < xSize;
	}

	private boolean inBoundsY(int number){
		return number >= 0 && number < ySize;
	}
	//builds maze
	
	
	// solves maze 
	
	
	private static boolean solveDFSMaze (Board maze, Cell curr, Cell end) {
		if (curr == end) {
			stack.push(curr);
			return true;
			}
		curr.visited = true;
		int col = curr.col;
		int row = curr.row; 
		
		if (row > 0 && maze.getCell(row-1, col).visited != true&&
				curr.wall.get("top") == false) {
			maze.getCell(row-1, col).visited = true;
			maze.getCell(row-1, col).parent = curr;
			stack.push(maze.getCell(row, col));
			if (solveDFSMaze(maze, maze.getCell(row-1, col), end)) return true;
			stack.pop();
		}	
		if (col < ySize-1 && maze.getCell(row, col+1).visited != true&&
				curr.wall.get("right") == false) {
			maze.getCell(row, col+1).visited = true;
			maze.getCell(row, col+1).parent = curr;
			stack.push(maze.getCell(row, col));
			if (solveDFSMaze(maze, maze.getCell(row, col+1), end)) return true;
			stack.pop();
		}	
		
		return false;
	}
	/*
	
	public static Stack<Cell> solveDFSMaze(Board maze, Cell start, Cell end) {
		Stack<Cell> stack = new Stack<Cell>();
		start.visited = true;
		Cell curr = null;
		stack.push(start);
		while (!stack.empty()) {
			curr = stack.pop();
			int col = curr.col;
			int row = curr.row;
			
			
			if (curr == end) { 
				stack.push(curr);
				return stack;
			}
			//up 1
			if (row > 0 && maze.getCell(row-1, col).visited != true&&
					curr.wall.get("top") == false) {
				maze.getCell(row-1, col).visited = true;
				maze.getCell(row-1, col).parent = curr;
				stack.push(maze.getCell(row, col));
				stack.push(maze.getCell(row -1, col));
			}	
			if (col < ySize-1 && maze.getCell(row, col+1).visited != true&&
					curr.wall.get("right") == false) {
				maze.getCell(row, col+1).visited = true;
				maze.getCell(row, col+1).parent = curr;
				stack.push(maze.getCell(row, col));
				stack.push(maze.getCell(row, col+1));
			}	
		}
		return stack;
	}*/
	
	public static void main (String args[]) {
		
		//Temp values until reader is done
		xSize = 4;
		ySize = 4;
		Board b = new Board(xSize,ySize);
		int []arr = {0,2};
		int []rarr = {1};
		int []rarri = {0,1,2};
		b.tempSetElem(3, 0, arr);
		b.tempSetElem(2, 0, arr);
		b.tempSetElem(1, 0, rarri);
		b.tempSetElem(0, 0, arr);
		b.tempSetElem(1, 1, rarr);
		b.tempSetElem(1, 2, rarr);
		System.out.print(b.toString());
		solveDFSMaze(b, b.getCell(3, 0),b.getCell(1, 2));
		
		Stack<Cell> a = stack;
		 int i =0;
		
	}

}
