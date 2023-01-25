package DAOricercatore;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class accessoRicercatore extends JFrame {

	private JPanel contentPane;
	esitoTartarughe esito = new esitoTartarughe(this);
	ClasseStatistiche statistiche = new ClasseStatistiche(this, null);

	public accessoRicercatore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 508);
		setResizable(false);
		contentPane = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAccessoRiceractore = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelAccessoRiceractore.setBounds(10, 10, 745, 451);
		contentPane.add(panelAccessoRiceractore);
		panelAccessoRiceractore.setLayout(null);
		
		JLabel lblEsitoTartarughe = new JLabel("ESITO TARTARUGHE");
		lblEsitoTartarughe.setForeground(new Color(255, 255, 255));
		lblEsitoTartarughe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
					setVisible(false);
					esito.setVisible(true);
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					lblEsitoTartarughe.setForeground(Color.black);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					lblEsitoTartarughe.setForeground(Color.white);
			}
		});
		lblEsitoTartarughe.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblEsitoTartarughe.setBounds(272, 237, 206, 41);
		panelAccessoRiceractore.add(lblEsitoTartarughe);
		
		JLabel lblVisualizzaStatistiche = new JLabel("VISUALIZZA STATISTICHE");
		lblVisualizzaStatistiche.setForeground(new Color(255, 255, 255));
		lblVisualizzaStatistiche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				statistiche.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblVisualizzaStatistiche.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblVisualizzaStatistiche.setForeground(Color.white);
			}
		});
		lblVisualizzaStatistiche.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblVisualizzaStatistiche.setBounds(252, 309, 261, 41);
		panelAccessoRiceractore.add(lblVisualizzaStatistiche);
	}
}
