package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerDAO.accessoDAO;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class accesso extends JFrame {

	private JPanel contentPane;
	public primoAccesso PA;
	public viewCartellaClinica VCC;
	private JTextField textFieldIdTartaruga;
	public riammissione Riammissione;
	
	
	public accesso() {
		setTitle("accesso");
		setBackground(new Color(127, 255, 212));
		
		accessoDAO AD = new accessoDAO();
		PA = new primoAccesso(this);
		VCC = new viewCartellaClinica(this);
		Riammissione = new riammissione();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(10, 10, 720, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textFieldIdTartaruga = new JTextField();
		textFieldIdTartaruga.setBounds(239, 101, 215, 42);
		panel.add(textFieldIdTartaruga);
		textFieldIdTartaruga.setColumns(10);
		
		JButton btnPrimoAccesso = new JButton("PRIMO ACCESSO");
		btnPrimoAccesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AD.queryTarghetta(textFieldIdTartaruga.getText(), false);
				setVisible(false);
				PA.setVisible(true);
			}
		});
		btnPrimoAccesso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnPrimoAccesso.setBounds(239, 153, 215, 59);
		panel.add(btnPrimoAccesso);
		
		JButton btnRiammissione = new JButton("RIAMMISSIONE");
		btnRiammissione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Riammissione.setVisible(true);
			}
		});
		btnRiammissione.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnRiammissione.setBounds(239, 230, 215, 59);
		panel.add(btnRiammissione);
		
		JButton btnViewCartellaClinica = new JButton("VISUALIZZA CARTELLA CLINICA");
		btnViewCartellaClinica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				VCC.setVisible(true);
			}
		});
		btnViewCartellaClinica.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnViewCartellaClinica.setBounds(197, 299, 319, 59);
		panel.add(btnViewCartellaClinica);
		
		JButton btnViewStatistiche = new JButton("VISUALIZZA STATISTICHE");
		btnViewStatistiche.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnViewStatistiche.setBounds(197, 369, 319, 59);
		panel.add(btnViewStatistiche);
		
		JLabel lblNewLabel = new JLabel("INSERISCI L'ID DELLA TARTARUGA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(190, 43, 326, 48);
		panel.add(lblNewLabel);
	}
}
