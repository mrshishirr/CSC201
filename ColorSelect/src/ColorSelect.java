// Student: Mahbub Rahman

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ColorSelect extends JFrame {

	private final JComboBox<String> colorJComboBox;
	private final JCheckBox bgJCheckBox, fgJCheckBox;
	private final JButton okButton, cancelButton;	
	private final JPanel comboBoxJPanel, checkBoxJPanel, buttonJPanel;
	
	private final String[] names = 
		{
				"RED", "GREEN", "BLUE", "YELLOW", "PURPLE"				
		};

	public ColorSelect() {
		super("ColorSelect");
		//setLayout(new BorderLayout());
		
		colorJComboBox = new JComboBox<String>(names);
		colorJComboBox.setMaximumRowCount(3);		
		comboBoxJPanel = new JPanel();
		//comboBoxJPanel.add(colorJComboBox);
		
		add(colorJComboBox, BorderLayout.NORTH);
		
		
		bgJCheckBox = new JCheckBox("Background");
		fgJCheckBox = new JCheckBox("Foreground");
		checkBoxJPanel = new JPanel();
		checkBoxJPanel.add(bgJCheckBox);
		checkBoxJPanel.add(fgJCheckBox);
		
		add(checkBoxJPanel, BorderLayout.CENTER);

		okButton = new JButton("Ok");
		cancelButton = new JButton("Cancel");
		buttonJPanel = new JPanel();
		buttonJPanel.add(okButton);
		buttonJPanel.add(cancelButton);
		
		add(buttonJPanel, BorderLayout.SOUTH);
	}
}