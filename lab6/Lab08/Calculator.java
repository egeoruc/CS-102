package Lab08;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        
        JPanel topPanel = new JPanel();
        frame.add(topPanel, BorderLayout.NORTH);
        topPanel.setBackground(Color.WHITE);
        topPanel.setLayout(new BorderLayout());
        
        JLabel label = new JLabel("0");
        label.setFont(new Font("Courier", Font.PLAIN, 20));
        topPanel.add(label, BorderLayout.EAST);
        
        
        JPanel mainPanel = new JPanel();
        frame.add(mainPanel, BorderLayout.CENTER);
        mainPanel.setLayout(new GridLayout(5,4));
        
        

        JOperandButton nul= new JOperandButton("");
        JOperandButton nul1= new JOperandButton("");
        JOperandButton nul2= new JOperandButton("");
        JOperandButton Clear=new JOperandButton("C");
        JOperandButton seven= new JOperandButton("7");
        JOperandButton eight=new JOperandButton("8");
        JOperandButton nine=new JOperandButton("9");
        JOperatorButton divide=new JOperatorButton("/");
        JOperandButton four=new JOperandButton("4");
        JOperandButton five=new JOperandButton("5");
        JOperandButton six=new JOperandButton("6");
        JOperatorButton x=new JOperatorButton("x");
        JOperandButton one=new JOperandButton("1");
        JOperandButton two=new JOperandButton("2");
        JOperandButton three=new JOperandButton("3");
        JOperatorButton minus=new JOperatorButton("-");
        JOperandButton zero=new JOperandButton("0");
        JOperandButton dot=new JOperandButton(".");
        JOperatorButton equals=new JOperatorButton("=");
        JOperatorButton plus=new JOperatorButton("+");

        MyActionListener listener=new MyActionListener();
        nul.addActionListener(listener);



        mainPanel.add(nul);
        mainPanel.add(nul1);
        mainPanel.add(nul2);
        mainPanel.add(Clear);
        mainPanel.add(seven);
        mainPanel.add(eight);
        mainPanel.add(nine);
        mainPanel.add(divide);
        mainPanel.add(four);
        mainPanel.add(five);
        mainPanel.add(six);
        mainPanel.add(x);
        mainPanel.add(one);
        mainPanel.add(two);
        mainPanel.add(three);
        mainPanel.add(minus);
        mainPanel.add(zero);
        mainPanel.add(dot);
        mainPanel.add(equals);
        mainPanel.add(plus);

       

        
        frame.setVisible(true);

	}

}
