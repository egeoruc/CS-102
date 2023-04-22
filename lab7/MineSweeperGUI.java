package lab7;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class MineSweeperGUI extends JPanel {
	
	private MineGrid grid;
	
	public MineSweeperGUI (int numRows, int numCols, int numMines) {
		
		grid= new MineGrid(numRows, numCols, numMines);
		setLayout(new GridLayout (numRows,numCols));
		for(int i=0; i < numRows; i++) {
			for(int j=0; j< numCols;j++) {
				JButton button = new JButton();
				add(button);
				button.addActionListener(new ButtonHandler(i,j,grid));
			}
				
			
		}
		
	}

}
