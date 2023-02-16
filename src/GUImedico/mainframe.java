package GUImedico;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainframe extends JFrame {
	public mainframe() {
	}

	private JPanel contentPane;
	public loginPage LP;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage LP = new loginPage();
					LP.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        Runtime runtime = Runtime.getRuntime();
       runtime.gc();
       long memory = runtime.totalMemory() - runtime.freeMemory();
       System.out.println("Used memory is bytes: " + memory);
	}


}

