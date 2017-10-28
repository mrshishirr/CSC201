import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Student: Mahbub Rahman

public class Temperature extends JFrame {
	
	private final JTextField f;
	private final JLabel inputLabel, resultLabel, result;
	private final JButton convert;
	private final JPanel panel, panel2;
	
	public Temperature() {
		super("Temperature Conversion");
		
		panel = new JPanel();
		inputLabel = new JLabel("Enter Farenheight: ");
		panel.add(inputLabel);
		f = new JTextField(5);
		panel.add(f);
		
		add(panel, BorderLayout.NORTH);
		
		panel2 = new JPanel();
		resultLabel = new JLabel("Celcius value: ");
		panel2.add(resultLabel);
		result = new JLabel("null");
		panel2.add(result);
		
		add(panel2, BorderLayout.CENTER);		
		
		convert = new JButton("Convert!");
		add(convert, BorderLayout.SOUTH);
		
		ButtonHandler handler = new ButtonHandler();
		convert.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			double input = Double.parseDouble(f.getText());
			double output = (5.0 / 9.0) * ( input - 32 );
			result.setText(String.format( "%.2f", output ));
		}
	}
}
