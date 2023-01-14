package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controllerDAO.cartellaClinicaDAO;

import javax.swing.AbstractListModel;
import javax.swing.JCheckBox;

public class cartellaClinica extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFieldIdCartellaClinica;
	private JTextField textFieldIdTartaruga;
	private JTextField textFieldNomeTartaruga;
	private JTextField textFieldInfoSpecie;
	private JTextField textFieldLunghezza;
	private JTextField textFieldLarghezza;
	private JTextField textFieldPeso;
	private JTextField textFieldLuogoRitrovamento;
	private JTextField textFieldDescrizione;
	private JTextField textFieldDataLiberazione;
	private JTextField textFieldDataAccesso;
	private JTextField textFieldDataDecesso;
	
	public cartellaClinica(menuMedico MMV) {
		setTitle("cartella clinica\r\n");
		cartellaClinicaDAO CCD = new cartellaClinicaDAO ();
		
		setBackground(new Color(127, 255, 212));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1017, 761);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCartellaClinica = new JPanel();
		panelCartellaClinica.setBackground(new Color(127, 255, 212));
		panelCartellaClinica.setBounds(10, 10, 983, 704);
		contentPane.add(panelCartellaClinica);
		panelCartellaClinica.setLayout(null);
		
		JButton btnNewButton = new JButton("invio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MMV.enable(true);
				//
				CCD.queryInsertIdTartaruga(textFieldIdTartaruga.getText(), textFieldNomeTartaruga.getText(), true);
				CCD.queryInsertCartella(textFieldIdCartellaClinica.getText(), textFieldIdTartaruga.getText(), textFieldNomeTartaruga.getText(), textFieldInfoSpecie.getText(), textFieldLunghezza.getText(), textFieldLarghezza.getText(), textFieldPeso.getText(), textFieldLuogoRitrovamento.getText(), textFieldDescrizione.getText(), textFieldDataLiberazione.getText(), textFieldDataAccesso.getText(), textFieldDataDecesso.getText());
				//cntr.queryProva(textFieldIdCartellaClinica.getText());
				//cntr.quesryNapoletana(textFieldIdCartellaClinica.getText(), textFieldIdTartaruga.getText());
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnNewButton.setBounds(349, 641, 174, 53);
		panelCartellaClinica.add(btnNewButton);
		
		textFieldIdCartellaClinica = new JTextField();
		textFieldIdCartellaClinica.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldIdCartellaClinica.setBounds(10, 49, 475, 44);
		panelCartellaClinica.add(textFieldIdCartellaClinica);
		textFieldIdCartellaClinica.setColumns(10);
		
		JLabel lblIdCartellaClinica = new JLabel("ID CARTELLA CLINICA");
		lblIdCartellaClinica.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblIdCartellaClinica.setBounds(10, 10, 220, 40);
		panelCartellaClinica.add(lblIdCartellaClinica);
		
		JLabel lblIdCartellaTartaruga = new JLabel("ID TARTARUGA");
		lblIdCartellaTartaruga.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblIdCartellaTartaruga.setBounds(10, 100, 147, 33);
		panelCartellaClinica.add(lblIdCartellaTartaruga);
		
		textFieldIdTartaruga = new JTextField();
		textFieldIdTartaruga.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldIdTartaruga.setColumns(10);
		textFieldIdTartaruga.setBounds(10, 127, 475, 44);
		panelCartellaClinica.add(textFieldIdTartaruga);
		
		JLabel lblNomeTartaruga = new JLabel("NOME TARTARUGA");
		lblNomeTartaruga.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNomeTartaruga.setBounds(10, 181, 190, 33);
		panelCartellaClinica.add(lblNomeTartaruga);
		
		textFieldNomeTartaruga = new JTextField();
		textFieldNomeTartaruga.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldNomeTartaruga.setColumns(10);
		textFieldNomeTartaruga.setBounds(10, 213, 475, 44);
		panelCartellaClinica.add(textFieldNomeTartaruga);
		
		JLabel lblInfoSpecie = new JLabel("INFO SPECIE");
		lblInfoSpecie.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblInfoSpecie.setBounds(10, 267, 190, 33);
		panelCartellaClinica.add(lblInfoSpecie);
		
		textFieldInfoSpecie = new JTextField();
		textFieldInfoSpecie.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldInfoSpecie.setColumns(10);
		textFieldInfoSpecie.setBounds(10, 299, 475, 44);
		panelCartellaClinica.add(textFieldInfoSpecie);
		
		JLabel lblLunghezza = new JLabel("LUNGHEZZA");
		lblLunghezza.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblLunghezza.setBounds(10, 353, 190, 33);
		panelCartellaClinica.add(lblLunghezza);
		
		textFieldLunghezza = new JTextField();
		textFieldLunghezza.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldLunghezza.setColumns(10);
		textFieldLunghezza.setBounds(10, 386, 475, 44);
		panelCartellaClinica.add(textFieldLunghezza);
		
		JLabel lblLarghezza = new JLabel("LARGHEZZA");
		lblLarghezza.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblLarghezza.setBounds(10, 440, 190, 33);
		panelCartellaClinica.add(lblLarghezza);
		
		textFieldLarghezza = new JTextField();
		textFieldLarghezza.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldLarghezza.setColumns(10);
		textFieldLarghezza.setBounds(10, 475, 475, 44);
		panelCartellaClinica.add(textFieldLarghezza);
		
		JLabel lblPeso = new JLabel("PESO");
		lblPeso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblPeso.setBounds(10, 529, 190, 33);
		panelCartellaClinica.add(lblPeso);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldPeso.setColumns(10);
		textFieldPeso.setBounds(10, 558, 475, 44);
		panelCartellaClinica.add(textFieldPeso);
		
		JLabel lblLuogoRitrovamento = new JLabel("LUOGO RITROVAMENTO");
		lblLuogoRitrovamento.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblLuogoRitrovamento.setBounds(495, 10, 232, 40);
		panelCartellaClinica.add(lblLuogoRitrovamento);
		
		textFieldLuogoRitrovamento = new JTextField();
		textFieldLuogoRitrovamento.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldLuogoRitrovamento.setColumns(10);
		textFieldLuogoRitrovamento.setBounds(495, 49, 475, 44);
		panelCartellaClinica.add(textFieldLuogoRitrovamento);
		
		JLabel lblDescrizione = new JLabel("DESCRIZIONE");
		lblDescrizione.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblDescrizione.setBounds(495, 100, 232, 33);
		panelCartellaClinica.add(lblDescrizione);
		
		textFieldDescrizione = new JTextField();
		textFieldDescrizione.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldDescrizione.setColumns(10);
		textFieldDescrizione.setBounds(495, 127, 475, 44);
		panelCartellaClinica.add(textFieldDescrizione);
		
		JLabel lblDataLiberazione = new JLabel("DATA LIBERAZIONE");
		lblDataLiberazione.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblDataLiberazione.setBounds(495, 181, 190, 33);
		panelCartellaClinica.add(lblDataLiberazione);
		
		textFieldDataLiberazione = new JTextField();
		textFieldDataLiberazione.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldDataLiberazione.setColumns(10);
		textFieldDataLiberazione.setBounds(495, 213, 475, 44);
		panelCartellaClinica.add(textFieldDataLiberazione);
		
		JLabel lblDataAccesso = new JLabel("DATA ACCESSO");
		lblDataAccesso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblDataAccesso.setBounds(495, 267, 190, 33);
		panelCartellaClinica.add(lblDataAccesso);
		
		textFieldDataAccesso = new JTextField();
		textFieldDataAccesso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldDataAccesso.setColumns(10);
		textFieldDataAccesso.setBounds(495, 299, 475, 44);
		panelCartellaClinica.add(textFieldDataAccesso);
		
		JLabel lblDataDecesso = new JLabel("DATA DECESSO");
		lblDataDecesso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblDataDecesso.setBounds(495, 361, 190, 33);
		panelCartellaClinica.add(lblDataDecesso);
		
		textFieldDataDecesso = new JTextField();
		textFieldDataDecesso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldDataDecesso.setColumns(10);
		textFieldDataDecesso.setBounds(495, 386, 475, 44);
		panelCartellaClinica.add(textFieldDataDecesso);
	}
}
