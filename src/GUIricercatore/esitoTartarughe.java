package GUIricercatore;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import query.esitoTartarugheDAO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class esitoTartarughe extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdTartaruga;
	private JTextField textFieldDataMorte;
	private JTextField textFieldDataLiberazione;

	public esitoTartarughe(accessoRicercatore accesso) {
	esitoTartarugheDAO ETD = new esitoTartarugheDAO();
	
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelEasitoTartaruga = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelEasitoTartaruga.setBounds(10, 10, 720, 462);
		contentPane.add(panelEasitoTartaruga);
		panelEasitoTartaruga.setLayout(null);
		
		JLabel lblInvio = new JLabel("invio");
		lblInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblInvio.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInvio.setForeground(Color.white);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textFieldDataLiberazione.getText().isEmpty()) {
					ETD.queryDataMorte(textFieldIdTartaruga.getText(), textFieldDataMorte.getText());
				}
				else {
					ETD.queryDataLiberazione(textFieldIdTartaruga.getText(), textFieldDataLiberazione.getText());
				}
				
			}
		});
		lblInvio.setForeground(new Color(255, 255, 255));
		lblInvio.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblInvio.setBounds(335, 322, 56, 47);
		panelEasitoTartaruga.add(lblInvio);
		
		JLabel lblInserisciIdTartaruga = new JLabel("INSERISCI ID TARTARUGA");
		lblInserisciIdTartaruga.setForeground(new Color(0, 0, 0));
		lblInserisciIdTartaruga.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblInserisciIdTartaruga.setBounds(221, 10, 270, 47);
		panelEasitoTartaruga.add(lblInserisciIdTartaruga);
		
		textFieldIdTartaruga = new JTextField();
		textFieldIdTartaruga.setOpaque(false);
		textFieldIdTartaruga.setForeground(new Color(255, 255, 255));
		textFieldIdTartaruga.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldIdTartaruga.setBounds(255, 54, 185, 39);
		panelEasitoTartaruga.add(textFieldIdTartaruga);
		textFieldIdTartaruga.setColumns(10);
		
		JLabel lblInserisciDataMorte = new JLabel("inserisci data morte");
		lblInserisciDataMorte.setForeground(new Color(0, 0, 0));
		lblInserisciDataMorte.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblInserisciDataMorte.setBounds(44, 158, 201, 47);
		panelEasitoTartaruga.add(lblInserisciDataMorte);
		
		textFieldDataMorte = new JTextField();
		textFieldDataMorte.setOpaque(false);
		textFieldDataMorte.setForeground(Color.WHITE);
		textFieldDataMorte.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldDataMorte.setColumns(10);
		textFieldDataMorte.setBounds(55, 200, 178, 39);
		panelEasitoTartaruga.add(textFieldDataMorte);
		
		JLabel lblInserisciDataLiberazione = new JLabel("inserisci data liberazione");
		lblInserisciDataLiberazione.setForeground(new Color(0, 0, 0));
		lblInserisciDataLiberazione.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblInserisciDataLiberazione.setBounds(440, 158, 249, 47);
		panelEasitoTartaruga.add(lblInserisciDataLiberazione);
		
		textFieldDataLiberazione = new JTextField();
		textFieldDataLiberazione.setOpaque(false);
		textFieldDataLiberazione.setForeground(Color.WHITE);
		textFieldDataLiberazione.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldDataLiberazione.setColumns(10);
		textFieldDataLiberazione.setBounds(476, 200, 178, 39);
		panelEasitoTartaruga.add(textFieldDataLiberazione);
		
		JLabel lblOppure = new JLabel("oppure");
		lblOppure.setForeground(new Color(0, 0, 0));
		lblOppure.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblOppure.setBounds(318, 205, 78, 47);
		panelEasitoTartaruga.add(lblOppure);
		
		JLabel lblIndietro = new JLabel("indietro");
		lblIndietro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				accesso.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblIndietro.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblIndietro.setForeground(Color.white);
			}
		});
		lblIndietro.setForeground(Color.WHITE);
		lblIndietro.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblIndietro.setBounds(10, 405, 78, 47);
		panelEasitoTartaruga.add(lblIndietro);
		
		}
	}
