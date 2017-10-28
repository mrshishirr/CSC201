// Student: Mahbub Rahman

import java.awt.BorderLayout;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private final JPanel buttonJPanel;
	private final JPanel textboxJPanel;
	private final JTextField textField;
	private final JButton[] buttons;
	private final String[] names = 
		{
				"7", "8", "9", "/",
				"4", "5", "6", "*",
				"1", "2", "3", "-",
				"0", ".", "=", "+"				
		};
	private final GridLayout gridLayout1;
	private final GridLayout gridLayout2;

	public Calculator() {
		super("Calculator");
		
		gridLayout1 = new GridLayout(1, 1, 5, 5);
		gridLayout2 = new GridLayout(4, 4, 5, 5);
		textField = new JTextField();
		textboxJPanel = new JPanel(gridLayout1);
		textboxJPanel.add(textField);
		//textboxJPanel.setLayout(gridLayout1);
		add(textboxJPanel, BorderLayout.CENTER);

		buttons = new JButton[names.length];
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(gridLayout2);

		for (int count = 0; count < buttons.length; count++) {
			buttons[count] = new JButton(names[count]);
			buttonJPanel.add(buttons[count]);
		}
		add(buttonJPanel, BorderLayout.SOUTH);

	}
}