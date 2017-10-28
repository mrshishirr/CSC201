// Student: Mahbub Rahman

import javax.swing.JFrame;
import javax.swing.UIManager;

public class GUIDemo {

	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		ColorSelect colorSelect = new ColorSelect();
		colorSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorSelect.setSize(300, 150);
		colorSelect.setVisible(true);
	}
}
