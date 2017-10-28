// Student: Mahbub Rahman

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CrapsUI extends JFrame {
	
	private final JButton roll;
	private final JLabel die1, die2, sum, point;
	private final JTextField dValue1, dValue2, sValue, pValue;
	private final JPanel dice;
	Craps craps;
	
	public CrapsUI() {
		super("Craps Game");
		
		dice = new JPanel(new GridLayout(4, 2, 5, 5));
		die1 = new JLabel("Die 1: ");		
		die2 = new JLabel("Die 2: ");
		sum = new JLabel("sum: ");
		point = new JLabel("point: ");
		dValue1 = new JTextField();
		dValue2 = new JTextField();
		sValue = new JTextField();
		pValue = new JTextField();
		
		dice.add(die1);
		dice.add(dValue1);
		dice.add(die2);
		dice.add(dValue2);
		dice.add(sum);
		dice.add(sValue);
		dice.add(point);
		dice.add(pValue);
		
		add(dice, BorderLayout.NORTH);
		roll = new JButton("Roll Dice!");
		add(roll, BorderLayout.SOUTH);
		
		ButtonHandler handler = new ButtonHandler();
		roll.addActionListener(handler);
	}
	
	private class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			if (craps == null) craps = new Craps();
			else craps.retry();
			dValue1.setText(String.valueOf(craps.d1));
			dValue2.setText(String.valueOf(craps.d2));
			sValue.setText(String.valueOf(craps.s));
			pValue.setText(String.valueOf(craps.myPoint));
			if (craps.c == false) roll.setEnabled(false);
		}
	}
	
}
