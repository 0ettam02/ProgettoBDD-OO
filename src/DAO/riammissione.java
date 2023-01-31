package DAO;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerDAO.riammissioneDAO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class riammissione extends JFrame {

	private JPanel contentPane;
	public JTextField textFieldIdTartaruga;
	riammissioneDAO RD = new riammissioneDAO();
	private JTable tableViewId;
	public String stringa = new String();
	cartellaClinicaRiammissione CCR = new cartellaClinicaRiammissione();
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
	//String idtartaruga;
	
	
	public riammissione(accesso accesso) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//System.out.println(tableViewId.getValueAt(0, 1));
		
		panelCartellaClinicaRiammissione = new JPanel();
		panelCartellaClinicaRiammissione.setBounds(0, 0, 740, 482);
		contentPane.add(panelCartellaClinicaRiammissione);
		panelCartellaClinicaRiammissione.setLayout(null);
		
		//---------------------------------------------------------------------------------
		JPanel panelRiammissione = new JPanel();
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
		lblInviocc = new JLabel("invio");
		
		JLabel lblInvio = new JLabel("invio");
		lblInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				stringa = textFieldIdTartaruga.getText();
				for(int i = 0; i<tableViewId.getRowCount(); i++) {
					if(stringa.equals(tableViewId.getValueAt(i,0))) {
						panelRiammissione.setVisible(false);
						panelCartellaClinicaRiammissione.setVisible(true);
					}
					
				}
				textFieldTartaruga.setText(RD.queryIdTartaruga(stringa));
				textFieldIdCartellaClinica.setText(RD.queryIdCartellaClinica(stringa));
				textFieldLunghezza.setText(RD.queryLunghezza(stringa));
				textFieldLarghezza.setText(RD.queryLarghezza(stringa));
				textFieldPeso.setText(RD.queryPeso(stringa));
				textFieldDescrizione.setText(RD.queryDescrizione(stringa));
				textFieldDataIngresso.setText(RD.queryDataIngresso(stringa));
				textFieldTarghetta.setText(RD.querySelezioneTarghetta(stringa));
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
				System.out.println(textFieldTarghetta.getText());
				RD.queryInserimentoDB(textFieldTarghetta.getText(),textFieldIdCartellaClinica.getText());
				System.out.println(textFieldTarghetta.getText());
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
		textFieldPeso.setBounds(387, 61, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldPeso);
		
		JLabel PESO = new JLabel("PESO");
		PESO.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		PESO.setBounds(461, 24, 45, 27);
		panelCartellaClinicaRiammissione.add(PESO);
		
		
		textFieldDescrizione.setColumns(10);
		textFieldDescrizione.setBounds(387, 160, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldDescrizione);
		
		JLabel lblDescrizione = new JLabel("DESCRIZIONE");
		lblDescrizione.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblDescrizione.setBounds(425, 120, 119, 27);
		panelCartellaClinicaRiammissione.add(lblDescrizione);
		
		
		textFieldTartaruga.setBounds(9, 160, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldTartaruga);
		textFieldTartaruga.setColumns(10);
		
		
		textFieldDataIngresso.setColumns(10);
		textFieldDataIngresso.setBounds(387, 270, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldDataIngresso);
		
		JLabel lblDataIngresso = new JLabel("DATA INGRESSO");
		lblDataIngresso.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblDataIngresso.setBounds(416, 230, 151, 27);
		panelCartellaClinicaRiammissione.add(lblDataIngresso);
		
		
		
		lblInviocc.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblInviocc.setBounds(294, 445, 45, 27);
		panelCartellaClinicaRiammissione.add(lblInviocc);
		
		
		textFieldTarghetta.setColumns(10);
		textFieldTarghetta.setBounds(387, 382, 203, 35);
		panelCartellaClinicaRiammissione.add(textFieldTarghetta);
		
		JLabel lblTarghetta = new JLabel("TARGHETTA");
		lblTarghetta.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblTarghetta.setBounds(439, 342, 105, 27);
		panelCartellaClinicaRiammissione.add(lblTarghetta);
		
	}
}

