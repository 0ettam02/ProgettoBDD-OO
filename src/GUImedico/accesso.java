package GUImedico;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class accesso extends JFrame {

	private JPanel contentPane;
	public primoAccesso PA;
	public viewCartellaClinica VCC;
	public riammissione Riammissione;
	public statisticheMedico statistiche;
	controller cntr = new controller();
	
	public accesso() {
		setTitle("accesso");
		setBackground(new Color(127, 255, 212));
		
		PA = new primoAccesso(this);
		VCC = new viewCartellaClinica(this);
		Riammissione = new riammissione(this);
		statistiche = new statisticheMedico(this, null, null, null, "accessoMedico");
		cibo cibo = new cibo(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 519);
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
		
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(10, 10, 720, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel btnPrimoAccesso = new JLabel("PRIMO ACCESSO");
		btnPrimoAccesso.setForeground(new Color(255, 255, 255));
		btnPrimoAccesso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				PA.setVisible(true);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPrimoAccesso.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPrimoAccesso.setForeground(Color.white);
			}
		});
		btnPrimoAccesso.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnPrimoAccesso.setBounds(281, 102, 150, 30);
		panel.add(btnPrimoAccesso);
		
		JLabel btnRiammissione = new JLabel("RIAMMISSIONE");
		btnRiammissione.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Riammissione.setVisible(true);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRiammissione.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRiammissione.setForeground(Color.white);
			}
		});
		btnRiammissione.setForeground(new Color(255, 255, 255));
		btnRiammissione.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnRiammissione.setBounds(291, 161, 128, 30);
		panel.add(btnRiammissione);
		
		JLabel btnViewCartellaClinica = new JLabel("VISUALIZZA CARTELLA CLINICA");
		btnViewCartellaClinica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				VCC.setVisible(true);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnViewCartellaClinica.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnViewCartellaClinica.setForeground(Color.white);
			}
		});
		btnViewCartellaClinica.setForeground(new Color(255, 255, 255));
		btnViewCartellaClinica.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnViewCartellaClinica.setBounds(240, 224, 258, 28);
		panel.add(btnViewCartellaClinica);
		
		JLabel btnViewStatistiche = new JLabel("VISUALIZZA STATISTICHE");
		btnViewStatistiche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				statistiche.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnViewStatistiche.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnViewStatistiche.setForeground(Color.white);
			}
		});
		btnViewStatistiche.setForeground(new Color(255, 255, 255));
		btnViewStatistiche.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnViewStatistiche.setBounds(251, 284, 234, 30);
		panel.add(btnViewStatistiche);
		
		JLabel lblStatisticheCibo = new JLabel("STATISTICHE CIBO");
		lblStatisticheCibo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				cibo.setVisible(true);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				lblStatisticheCibo.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblStatisticheCibo.setForeground(Color.white);
			}
		});
		lblStatisticheCibo.setForeground(Color.WHITE);
		lblStatisticheCibo.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblStatisticheCibo.setBounds(275, 349, 169, 30);
		panel.add(lblStatisticheCibo);
	
	}
}
