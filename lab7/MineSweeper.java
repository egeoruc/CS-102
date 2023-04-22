package lab7;

import javax.swing.JFrame;

public class MineSweeper {
	private static final int NUM_MINES=10;
	private static final int SIZE=20;
	
	public static void main (String [] kargs) {
		
		JFrame frame= new JFrame("Mine Sweeper | # of mines: "+ NUM_MINES);
		frame.add(new MineSweeperGUI(SIZE,SIZE,NUM_MINES));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,600);
		frame.setVisible(true);
		
	}
}
