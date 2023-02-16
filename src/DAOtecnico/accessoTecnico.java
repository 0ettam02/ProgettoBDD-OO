package DAOtecnico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAOricercatore.statisticheRicercatore;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
//import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class accessoTecnico extends JFrame {

	private JPanel contentPane;
	cartellaClinicaTecnico CCT = new cartellaClinicaTecnico(this);
	statisticheTecnico statistiche = new statisticheTecnico(this);

	
	public accessoTecnico() {
		setTitle("operatore");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 509);
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
		setResizable(false);
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAccesso = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelAccesso.setBackground(new Color(127, 255, 212));
		panelAccesso.setBounds(10, 10, 745, 460);
		contentPane.add(panelAccesso);
		panelAccesso.setLayout(null);
		
		JLabel lblCartellaClinica = new JLabel("CARTELLA CLINICA");
		lblCartellaClinica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				CCT.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblCartellaClinica.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblCartellaClinica.setForeground(Color.white);
			}
		});
		lblCartellaClinica.setForeground(new Color(255, 255, 255));
		lblCartellaClinica.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblCartellaClinica.setBounds(294, 216, 151, 23);
		panelAccesso.add(lblCartellaClinica);
		
		JLabel lblStatistiche = new JLabel("STATISTICHE");
		lblStatistiche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				statistiche.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblStatistiche.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblStatistiche.setForeground(Color.white);
			}
		});
		lblStatistiche.setForeground(Color.WHITE);
		lblStatistiche.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblStatistiche.setBounds(315, 253, 113, 23);
		panelAccesso.add(lblStatistiche);
	}
}
