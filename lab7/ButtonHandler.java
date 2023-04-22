package lab7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JButton;

public class ButtonHandler implements ActionListener{
	private int row,col;
	private MineGrid grid;
	
	public ButtonHandler(int x, int y, MineGrid g) {
		row=x;
		col=y;
		grid=g;
	}
	public void actionPerformed(ActionEvent event) {
		if(grid.isMine(row, col)) {
			JOptionPane.showMessageDialog(null, "OOOPS!!");
			System.exit(0);
		}
		else {
			if(event.getSource() instanceof JButton) {
				JButton button= (JButton) event.getSource();
				button.setText(String.valueOf(grid.getCellContent(row, col)));
				
			}
			
			
		}
	}
}
