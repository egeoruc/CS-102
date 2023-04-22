package Lab08;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class TripleWithRadioButtonsPanel extends JPanel {
    private JTextField textField;
    private JButton button, resetButton;
    private JLabel label;
    private JRadioButton radio1;
    private JRadioButton radio2;

    public TripleWithRadioButtonsPanel() {
        textField = new JTextField(15);
        button = new JButton("Append");
        resetButton = new JButton("Reset");
        label = new JLabel("Hi.");
        radio1 = new JRadioButton("lowercase", true);
        radio2 = new JRadioButton("UPPERCASE", false);

        add(label);
        add(textField);
        add(button);
        add(resetButton);
        add(radio1);
        add(radio2);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

    }
}
