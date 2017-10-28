// Student: Mahbub Rahman

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Temperature extends JFrame {
	
	private final JTextField tmp;
	private final JLabel inputLabel, resultCLabel, resultFLabel, resultKLabel;
	private final JLabel resultC, resultF, resultK;
	private final JButton convert;
	private final JRadioButton tmpF, tmpC, tmpK;
	private final ButtonGroup radioGroup;
	private final JPanel panel, panel2, btnPanel;
	private int sel;
	
	public Temperature() {
		super("Temperature Conversion");
		
		panel = new JPanel();
		inputLabel = new JLabel("Enter Temperature: ");
		panel.add(inputLabel);
		tmp = new JTextField(5);
		panel.add(tmp);
		
		radioGroup = new ButtonGroup();
		tmpF = new JRadioButton("Farenheight", false);
		radioGroup.add(tmpF);
		tmpC = new JRadioButton("Celcius", false);
		radioGroup.add(tmpC);		
		tmpK = new JRadioButton("Kelvin", false);
		radioGroup.add(tmpK);
		btnPanel = new JPanel(new GridLayout(3, 1, 5, 5));
		btnPanel.add(tmpF);
		btnPanel.add(tmpC);
		btnPanel.add(tmpK);
		panel.add(btnPanel);
		tmpF.addItemListener(new RadioButtonHandler());
		tmpC.addItemListener(new RadioButtonHandler());
		tmpK.addItemListener(new RadioButtonHandler());		
		
		add(panel, BorderLayout.NORTH);
		
		panel2 = new JPanel();
		resultCLabel = new JLabel("Celcius value: ");
		panel2.add(resultCLabel);
		resultC = new JLabel("null");
		panel2.add(resultC);
		resultFLabel = new JLabel("Farenheight value: ");
		panel2.add(resultFLabel);
		resultF = new JLabel("null");
		panel2.add(resultF);
		resultKLabel = new JLabel("Kelvin value: ");
		panel2.add(resultKLabel);
		resultK = new JLabel("null");
		panel2.add(resultK);
		
		
		add(panel2, BorderLayout.CENTER);		
		
		convert = new JButton("Convert!");
		add(convert, BorderLayout.SOUTH);
		
		ButtonHandler handler = new ButtonHandler();
		convert.addActionListener(handler);
	}
	
	private class RadioButtonHandler implements ItemListener {		
		
		@Override
		public void itemStateChanged(ItemEvent event) {
			if(tmpF.isSelected()) sel = 1;
			else if(tmpC.isSelected()) sel = 2;
			else if (tmpK.isSelected()) sel = 3;
			else sel = 0;
		}
	}
	
	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			double input, output;
			input = Double.parseDouble(tmp.getText());
			if (sel == 1) {	// Farenheight
				
				resultF.setText(String.format( "%.2f", input ));
				output = (5.0 / 9.0) * ( input - 32 );				
				resultC.setText(String.format( "%.2f", output ));
				input = Double.parseDouble(resultC.getText());
				output = input + 273.15;
				resultK.setText(String.format( "%.2f", output ));
				
			}
			else if (sel == 2) { // Celcius
				
				resultC.setText(String.format( "%.2f", input ));
				output = input + 273.15;								
				resultK.setText(String.format( "%.2f", output ));
				output = ((9.0 / 5.0) * input) + 32 ;
				resultF.setText(String.format( "%.2f", output ));
			}
			
			else if (sel == 3) { // Kelvin
				
				resultK.setText(String.format( "%.2f", input ));
				output = input - 273.15;								
				resultC.setText(String.format( "%.2f", output ));
				output = ((9.0 / 5.0) * input) - 459.67;
				resultF.setText(String.format( "%.2f", output ));
			}
		}
	}
}
