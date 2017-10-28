// Student: Mahbub Rahman

import javax.swing.JFrame;
import javax.swing.UIManager;

public class GUIDemo {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		Temperature temperature = new Temperature();
		temperature.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		temperature.setSize(425, 200);
		temperature.setVisible(true);
	}
}
