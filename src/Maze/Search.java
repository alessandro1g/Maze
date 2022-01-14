package Maze;
import javax.swing.JFrame;

public class Search {
	//0 is start
	//1 is empty cell
	//2 is current path
	//3 is end
	
	
	
	public static void main (String args[]) {
		Board b = new Board(15,15);
		String a = b.toString();
		System.out.println(a);
	}

}
