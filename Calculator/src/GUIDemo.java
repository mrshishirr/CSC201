// Student: Mahbub Rahman

import javax.swing.JFrame;
import javax.swing.UIManager;

public class GUIDemo {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		Calculator calculator = new Calculator();
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.setSize(300, 200);
		calculator.setVisible(true);
	}
}
