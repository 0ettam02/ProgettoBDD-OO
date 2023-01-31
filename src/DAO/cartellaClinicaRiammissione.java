package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerDAO.riammissioneDAO;

import javax.swing.JTextField;

public class cartellaClinicaRiammissione extends JFrame {
	collegamento cl = new collegamento();

	private JPanel contentPane;
	private String id_cartellaclinica;
	private String id_tartaruga;
	private String lunghezza;
	private String larghezza;
	private String peso;
	private String descrizione;
	private String data_ingresso;
	private JTextField textField;
	
	public cartellaClinicaRiammissione() {
		
		riammissioneDAO RD = new riammissioneDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCartellaClinicaRiammissione = new JPanel();
		panelCartellaClinicaRiammissione.setBounds(10, 10, 720, 462);
		contentPane.add(panelCartellaClinicaRiammissione);
		panelCartellaClinicaRiammissione.setLayout(null);
		
//		textField = new JTextField();
//		textField.setText(RD.queryCartellaClinica());
//		textField.setBounds(71, 182, 277, 65);
//		panelCartellaClinicaRiammissione.add(textField);
//		textField.setColumns(10);
	}
}
