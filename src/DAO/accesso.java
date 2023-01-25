package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAOricercatore.ClasseStatistiche;
import DAOricercatore.esitoTartarughe;
import controllerDAO.accessoDAO;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class accesso extends JFrame {

	private JPanel contentPane;
	public primoAccesso PA;
	public viewCartellaClinica VCC;
	private JTextField textFieldIdTartaruga;
	public riammissione Riammissione;
	public ClasseStatistiche viewStatistiche;
	
	public accesso() {
		setTitle("accesso");
		setBackground(new Color(127, 255, 212));
		
		accessoDAO AD = new accessoDAO();
		PA = new primoAccesso(this);
		VCC = new viewCartellaClinica(this);
		Riammissione = new riammissione(this);
		viewStatistiche = new ClasseStatistiche(null, this);
		//esitoTartarughe esito = new esitoTartarughe(this);
		
		
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
		
		textFieldIdTartaruga = new JTextField();
		textFieldIdTartaruga.setForeground(new Color(255, 255, 255));
		textFieldIdTartaruga.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldIdTartaruga.setOpaque(false);
		textFieldIdTartaruga.setBounds(239, 101, 215, 42);
		panel.add(textFieldIdTartaruga);
		textFieldIdTartaruga.setColumns(10);
		
		JLabel btnPrimoAccesso = new JLabel("PRIMO ACCESSO");
		btnPrimoAccesso.setForeground(new Color(255, 255, 255));
		btnPrimoAccesso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AD.queryTarghetta(textFieldIdTartaruga.getText(), false);
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
		btnPrimoAccesso.setBounds(275, 190, 150, 42);
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
		btnRiammissione.setBounds(285, 242, 128, 59);
		panel.add(btnRiammissione);
		
		JLabel btnViewCartellaClinica = new JLabel("VISUALIZZA CARTELLA CLINICA");
		btnViewCartellaClinica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AD.queryTarghettaRiammissione(textFieldIdTartaruga.getText(), true);
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
		btnViewCartellaClinica.setBounds(230, 311, 258, 59);
		panel.add(btnViewCartellaClinica);
		
		JLabel btnViewStatistiche = new JLabel("VISUALIZZA STATISTICHE");
		btnViewStatistiche.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				viewStatistiche.setVisible(true);
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
		btnViewStatistiche.setBounds(239, 393, 234, 59);
		panel.add(btnViewStatistiche);
		
		JLabel lblNewLabel = new JLabel("INSERISCI L'ID DELLA TARTARUGA");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel.setBounds(210, 43, 278, 48);
		panel.add(lblNewLabel);
		
		/*JLabel lblEsitoTartarughe = new JLabel("ESITO TARTARUGHE");
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
		lblEsitoTartarughe.setForeground(Color.WHITE);
		lblEsitoTartarughe.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblEsitoTartarughe.setBounds(268, 259, 174, 59);
		panel.add(lblEsitoTartarughe);*/
	}
}
