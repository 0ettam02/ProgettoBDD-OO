package DAO;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerDAO.riammissioneDAO;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class riammissione extends JFrame {

	private JPanel contentPane;
	public JTextField textFieldIdTartaruga;
	riammissioneDAO RD = new riammissioneDAO();
	private JTable tableViewId;
	public String stringa = new String();
	private JTextField textFieldTartaruga;
	public JPanel panelCartellaClinicaRiammissione;
	private JTextField textFieldIdCartellaClinica;
	private JTextField textFieldLunghezza;
	private JTextField textFieldLarghezza;
	private JTextField textFieldPeso;
	private JTextField textFieldDescrizione;
	private JTextField textFieldDataIngresso;
	public JLabel lblInviocc;
	public JTextField textFieldTarghetta;
	private JTextField textFieldLuogoRitrovamento;
	controller cntr = new controller();
	
	
	public riammissione(accesso accesso) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 519);
		contentPane = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(),
						Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		panelCartellaClinicaRiammissione = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(),
						Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelCartellaClinicaRiammissione.setBounds(0, 0, 740, 482);
		contentPane.add(panelCartellaClinicaRiammissione);
		panelCartellaClinicaRiammissione.setLayout(null);
		
		//---------------------------------------------------------------------------------
		JPanel panelRiammissione = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(),
						Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelRiammissione.setBounds(10, 10, 720, 462);
		panelCartellaClinicaRiammissione.add(panelRiammissione);
		panelRiammissione.setLayout(null);
		
		
		JLabel lblInserisciId = new JLabel("INSERISCI L'ID DELLA TARTARUGA");
		lblInserisciId.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserisciId.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblInserisciId.setBounds(185, 206, 352, 53);
		panelRiammissione.add(lblInserisciId);
		
		textFieldIdTartaruga = new JTextField();
		textFieldIdTartaruga.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldIdTartaruga.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIdTartaruga.setBounds(267, 269, 162, 34);
		panelRiammissione.add(textFieldIdTartaruga);
		textFieldIdTartaruga.setColumns(10);
		
		JLabel lblIndietro = new JLabel("indietro");
		lblIndietro.setForeground(new Color(255, 255, 255));
		lblIndietro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				accesso.setVisible(true);
				
			}
		});
		lblIndietro.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblIndietro.setBounds(10, 424, 66, 28);
		panelRiammissione.add(lblIndietro);
		
		textFieldIdCartellaClinica = new JTextField();
		textFieldTartaruga = new JTextField();
		textFieldLunghezza = new JTextField();
		textFieldLarghezza = new JTextField();
		textFieldPeso = new JTextField();
		textFieldDescrizione = new JTextField();
		textFieldDataIngresso = new JTextField();
		textFieldTarghetta = new JTextField();
		textFieldTarghetta.setEditable(false);
		textFieldLuogoRitrovamento = new JTextField();
		lblInviocc = new JLabel("invio");
		
		JLabel lblInvio = new JLabel("invio");
		lblInvio.setForeground(new Color(255, 255, 255));
		lblInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cntr.queryRiammissione(panelRiammissione, stringa,textFieldIdTartaruga,
						tableViewId, RD, textFieldTartaruga, textFieldIdCartellaClinica, textFieldLunghezza, textFieldLarghezza,
						textFieldPeso, textFieldDescrizione, textFieldDataIngresso,
						textFieldTarghetta, textFieldLuogoRitrovamento, panelCartellaClinicaRiammissione);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblInvio.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInvio.setForeground(Color.white);
			}
		});
		
		lblInviocc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblInviocc.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInviocc.setForeground(Color.white);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				RD.queryInserimentoDB(textFieldTarghetta.getText(),textFieldIdCartellaClinica.getText(), textFieldLunghezza.getText(), textFieldLarghezza.getText(), textFieldPeso.getText(), textFieldLuogoRitrovamento.getText(), textFieldDescrizione.getText(), textFieldDataIngresso.getText());                        
				
			}
		});
		
		
		
		lblInvio.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblInvio.setBounds(327, 313, 45, 28);
		panelRiammissione.add(lblInvio);
		
		JScrollPane scrollPaneViewId = new JScrollPane();
		scrollPaneViewId.setBounds(10, 10, 700, 201);
		panelRiammissione.add(scrollPaneViewId);
		
		tableViewId = new JTable();
		tableViewId.setModel(RD.VisualizzazioneIdTartaruga());
		scrollPaneViewId.setViewportView(tableViewId);
		
		JLabel lblIdTartaruga = new JLabel("ID TARTARUGA");
		lblIdTartaruga.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblIdTartaruga.setBounds(38, 120, 128, 27);
		panelCartellaClinicaRiammissione.add(lblIdTartaruga);
		
		
		textFieldIdCartellaClinica.setColumns(10);
		textFieldIdCartellaClinica.setBounds(10, 61, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldIdCartellaClinica);
		
		JLabel lblIdCartellaClinica = new JLabel("ID CARTELLA CLINICA");
		lblIdCartellaClinica.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblIdCartellaClinica.setBounds(18, 24, 188, 27);
		panelCartellaClinicaRiammissione.add(lblIdCartellaClinica);
		
		
		textFieldLunghezza.setColumns(10);
		textFieldLunghezza.setBounds(9, 270, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldLunghezza);
		
		JLabel lblLunghezza = new JLabel("LUNGHEZZA");
		lblLunghezza.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblLunghezza.setBounds(38, 230, 128, 27);
		panelCartellaClinicaRiammissione.add(lblLunghezza);
		
		
		textFieldLarghezza.setColumns(10);
		textFieldLarghezza.setBounds(9, 382, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldLarghezza);
		
		JLabel lblLarghezza = new JLabel("LARGHEZZA");
		lblLarghezza.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblLarghezza.setBounds(38, 342, 128, 27);
		panelCartellaClinicaRiammissione.add(lblLarghezza);
		
		
		textFieldPeso.setColumns(10);
		textFieldPeso.setBounds(527, 61, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldPeso);
		
		JLabel PESO = new JLabel("PESO");
		PESO.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		PESO.setBounds(601, 24, 45, 27);
		panelCartellaClinicaRiammissione.add(PESO);
		
		
		textFieldDescrizione.setColumns(10);
		textFieldDescrizione.setBounds(527, 160, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldDescrizione);
		
		JLabel lblDescrizione = new JLabel("DESCRIZIONE");
		lblDescrizione.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblDescrizione.setBounds(565, 120, 119, 27);
		panelCartellaClinicaRiammissione.add(lblDescrizione);
		
		
		textFieldTartaruga.setBounds(9, 160, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldTartaruga);
		textFieldTartaruga.setColumns(10);
		
		
		textFieldDataIngresso.setColumns(10);
		textFieldDataIngresso.setBounds(527, 270, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldDataIngresso);
		
		JLabel lblDataIngresso = new JLabel("DATA INGRESSO");
		lblDataIngresso.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblDataIngresso.setBounds(556, 230, 151, 27);
		panelCartellaClinicaRiammissione.add(lblDataIngresso);
		
		
		
		lblInviocc.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblInviocc.setBounds(348, 445, 45, 27);
		panelCartellaClinicaRiammissione.add(lblInviocc);
		
		
		textFieldTarghetta.setColumns(10);
		textFieldTarghetta.setBounds(266, 64, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldTarghetta);
		
		JLabel lblTarghetta = new JLabel("TARGHETTA");
		lblTarghetta.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblTarghetta.setBounds(318, 24, 105, 27);
		panelCartellaClinicaRiammissione.add(lblTarghetta);
		
		JLabel lblLuogoRitrovamento = new JLabel("LUOGO RITROVAMENTO");
		lblLuogoRitrovamento.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblLuogoRitrovamento.setBounds(524, 342, 206, 27);
		panelCartellaClinicaRiammissione.add(lblLuogoRitrovamento);
		
		
		
		textFieldLuogoRitrovamento.setColumns(10);
		textFieldLuogoRitrovamento.setBounds(527, 382, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldLuogoRitrovamento);
		
	}
}

