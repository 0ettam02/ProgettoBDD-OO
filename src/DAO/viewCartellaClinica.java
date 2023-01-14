package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerDAO.viewCartellaClinicaDAO;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class viewCartellaClinica extends JFrame {

	private JPanel contentPane;
	private JTextArea textFieldCartellaClinica;
	private JTextField textFieldSceltaId;
	
	public viewCartellaClinica(accesso Accesso) {
		setTitle("View cartella clinica");
		
		viewCartellaClinicaDAO VCCD = new viewCartellaClinicaDAO();
		
		setBackground(new Color(127, 255, 212));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelViewCartellaClinica = new JPanel();
		panelViewCartellaClinica.setBackground(new Color(127, 255, 212));
		panelViewCartellaClinica.setBounds(10, 10, 761, 481);
		contentPane.add(panelViewCartellaClinica);
		
		JButton btnIndietro = new JButton("INDIETRO");
		btnIndietro.setBounds(10, 419, 141, 52);
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Accesso.setVisible(true);
			}
		});
		panelViewCartellaClinica.setLayout(null);
		btnIndietro.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		panelViewCartellaClinica.add(btnIndietro);
		
		textFieldSceltaId = new JTextField();
		textFieldSceltaId.setBounds(610, 426, 141, 45);
		panelViewCartellaClinica.add(textFieldSceltaId);
		textFieldSceltaId.setColumns(10);
		
		textFieldCartellaClinica = new JTextArea();
		textFieldCartellaClinica.setBounds(10, 10, 739, 397);
		textFieldCartellaClinica.setVisible(false);
		panelViewCartellaClinica.add(textFieldCartellaClinica);
		textFieldCartellaClinica.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldCartellaClinica.setColumns(10);
		
		JButton btnIdCartellaClinica = new JButton("inserisci l'ID della\r\ncartella clinica ");
		btnIdCartellaClinica.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		btnIdCartellaClinica.setBounds(352, 419, 248, 52);
		btnIdCartellaClinica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldCartellaClinica.setVisible(true);
				ArrayList <String> lista = VCCD.querySelezioneCartellaClinica(textFieldSceltaId.getText());
				String stringa = "";
				for(String temp:lista) {
					stringa += temp;
				}
				textFieldCartellaClinica.setText(stringa);
				System.out.println(stringa);
			}
		});
		panelViewCartellaClinica.add(btnIdCartellaClinica);
		
	
	}
}
