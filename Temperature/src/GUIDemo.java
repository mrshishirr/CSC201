// Student: Mahbub Rahman

import javax.swing.JFrame;
import javax.swing.UIManager;

public class GUIDemo {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		Temperature temperature = new Temperature();
		temperature.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		temperature.setSize(300, 150);
		temperature.setVisible(true);
	}
}
