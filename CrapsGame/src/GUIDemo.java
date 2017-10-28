// Student: Mahbub Rahman

import javax.swing.JFrame;
import javax.swing.UIManager;

public class GUIDemo {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		CrapsUI ui = new CrapsUI();
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setSize(250, 180);
		ui.setVisible(true);
	}
}