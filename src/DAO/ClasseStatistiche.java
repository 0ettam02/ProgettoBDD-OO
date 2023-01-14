package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controllerDAO.statisticheDAO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ClasseStatistiche extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdStatistica;
	private JTextField textFieldNumeroTartarughe;
	private JTextField textFieldNumeroTartarugheLiberate;
	private JTextField textFieldNumeroTartarugheCurate;
	private JTextField textFieldNumeroTartarugheMalate;
	private JTextField textFieldNumeroTartarugheDecedute;
	private JTextField textFieldDataInizio;
	private JTextField textFieldDataFine;

	public ClasseStatistiche(menuMedico MMV) {
		setTitle("statistiche");
		
		statisticheDAO SD = new statisticheDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 225, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelStatistiche = new JPanel();
		panelStatistiche.setBackground(new Color(127, 225, 212));
		panelStatistiche.setBounds(10, 10, 751, 495);
		contentPane.add(panelStatistiche);
		panelStatistiche.setLayout(null);
		
		JLabel lblId_statistica = new JLabel("ID STATISTICA");
		lblId_statistica.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblId_statistica.setBounds(10, 10, 147, 30);
		panelStatistiche.add(lblId_statistica);
		
		textFieldIdStatistica = new JTextField();
		textFieldIdStatistica.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldIdStatistica.setBounds(10, 39, 232, 45);
		panelStatistiche.add(textFieldIdStatistica);
		textFieldIdStatistica.setColumns(10);
		
		JLabel lblNumeroTartarughe = new JLabel("NUMERO TARTARUGHE");
		lblNumeroTartarughe.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNumeroTartarughe.setBounds(10, 107, 232, 30);
		panelStatistiche.add(lblNumeroTartarughe);
		
		textFieldNumeroTartarughe = new JTextField();
		textFieldNumeroTartarughe.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldNumeroTartarughe.setColumns(10);
		textFieldNumeroTartarughe.setBounds(10, 136, 232, 45);
		panelStatistiche.add(textFieldNumeroTartarughe);
		
		JLabel lblNumeroTartarugheLiberate = new JLabel("NUMERO TARTARUGHE LIBERATE");
		lblNumeroTartarugheLiberate.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNumeroTartarugheLiberate.setBounds(10, 203, 325, 30);
		panelStatistiche.add(lblNumeroTartarugheLiberate);
		
		textFieldNumeroTartarugheLiberate = new JTextField();
		textFieldNumeroTartarugheLiberate.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldNumeroTartarugheLiberate.setColumns(10);
		textFieldNumeroTartarugheLiberate.setBounds(10, 234, 232, 45);
		panelStatistiche.add(textFieldNumeroTartarugheLiberate);
		
		JLabel lblNumeroTartarugheCurate = new JLabel("NUMERO TARTARUGHE CURATE");
		lblNumeroTartarugheCurate.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNumeroTartarugheCurate.setBounds(10, 303, 325, 30);
		panelStatistiche.add(lblNumeroTartarugheCurate);
		
		textFieldNumeroTartarugheCurate = new JTextField();
		textFieldNumeroTartarugheCurate.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldNumeroTartarugheCurate.setColumns(10);
		textFieldNumeroTartarugheCurate.setBounds(10, 332, 232, 45);
		panelStatistiche.add(textFieldNumeroTartarugheCurate);
		
		JLabel lblNumeroTartarugheMalate = new JLabel("NUMERO TARTARUGHE  MALATE");
		lblNumeroTartarugheMalate.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNumeroTartarugheMalate.setBounds(10, 401, 325, 30);
		panelStatistiche.add(lblNumeroTartarugheMalate);
		
		textFieldNumeroTartarugheMalate = new JTextField();
		textFieldNumeroTartarugheMalate.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldNumeroTartarugheMalate.setColumns(10);
		textFieldNumeroTartarugheMalate.setBounds(10, 429, 232, 45);
		panelStatistiche.add(textFieldNumeroTartarugheMalate);
		
		JLabel lblNumeroTartarugheDecedute = new JLabel("NUMERO TARTARUGHE  DECEDUTE");
		lblNumeroTartarugheDecedute.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNumeroTartarugheDecedute.setBounds(402, 10, 339, 30);
		panelStatistiche.add(lblNumeroTartarugheDecedute);
		
		textFieldNumeroTartarugheDecedute = new JTextField();
		textFieldNumeroTartarugheDecedute.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldNumeroTartarugheDecedute.setColumns(10);
		textFieldNumeroTartarugheDecedute.setBounds(402, 49, 232, 45);
		panelStatistiche.add(textFieldNumeroTartarugheDecedute);
		
		JLabel lblDataInizio = new JLabel("DATA INIZIO");
		lblDataInizio.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblDataInizio.setBounds(402, 106, 125, 33);
		panelStatistiche.add(lblDataInizio);
		
		textFieldDataInizio = new JTextField();
		textFieldDataInizio.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldDataInizio.setColumns(10);
		textFieldDataInizio.setBounds(402, 136, 232, 45);
		panelStatistiche.add(textFieldDataInizio);
		
		JLabel lblDataFine = new JLabel("DATA FINE");
		lblDataFine.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblDataFine.setBounds(402, 200, 125, 33);
		panelStatistiche.add(lblDataFine);
		
		textFieldDataFine = new JTextField();
		textFieldDataFine.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldDataFine.setColumns(10);
		textFieldDataFine.setBounds(402, 234, 232, 45);
		panelStatistiche.add(textFieldDataFine);
		
		JButton btnNewButton = new JButton("INVIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SD.queryInsertStatistiche(textFieldIdStatistica.getText(),textFieldNumeroTartarughe.getText(), textFieldNumeroTartarugheLiberate.getText(), textFieldNumeroTartarugheCurate.getText(),textFieldNumeroTartarugheMalate.getText(),textFieldNumeroTartarugheDecedute.getText(),textFieldDataInizio.getText(),textFieldDataFine.getText());
				setVisible(false);
				MMV.enable(true);
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnNewButton.setBounds(471, 429, 203, 56);
		panelStatistiche.add(btnNewButton);
	}
}
