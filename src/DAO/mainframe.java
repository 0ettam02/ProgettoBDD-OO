package DAO;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;


public class mainframe extends JFrame {
	public mainframe() {
	}

	private JPanel contentPane;
	public loginPage LP;

	/**
	 * Launch the application.
	 */
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
		//Memory performance test
        Runtime runtime = Runtime.getRuntime();
       // Run the garbage collector
       runtime.gc();
       // Calculate the used memory
       long memory = runtime.totalMemory() - runtime.freeMemory();
       System.out.println("Used memory is bytes: " + memory);
	}


}

