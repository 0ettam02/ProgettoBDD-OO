package DAOricercatore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerDAO.cartellaClinicaDAO;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class cartellaClinicaRicercatore extends JFrame {

	private JPanel contentPane;
	cartellaClinicaDAO CCD = new cartellaClinicaDAO();
	private JTextField textFieldCartellaClinica;
	private JTextField textFieldTartaruga;
	private JTextField textFieldNomeTartaruga;
	private JTextField textFieldLuogoRitrovamento;
	private JTextField textFieldDataIngresso;
	private JLabel lblIndietro;
	private JLabel lblInvio;
	
	
	public cartellaClinicaRicercatore(accessoRicercatore accesso) {
		
		cartellaClinicaDAO CCD = new cartellaClinicaDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 508);
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelCartellaClinicaRicercatore = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelCartellaClinicaRicercatore.setBackground(new Color(128, 128, 128));
		panelCartellaClinicaRicercatore.setBounds(10, 10, 745, 461);
		contentPane.add(panelCartellaClinicaRicercatore);
		panelCartellaClinicaRicercatore.setLayout(null);
		
		textFieldCartellaClinica = new JTextField();
		textFieldCartellaClinica.setOpaque(false);
		textFieldCartellaClinica.setBounds(101, 75, 174, 42);
		panelCartellaClinicaRicercatore.add(textFieldCartellaClinica);
		textFieldCartellaClinica.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID CARTELLA CLINICA\r\n");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel.setBounds(101, 37, 174, 28);
		panelCartellaClinicaRicercatore.add(lblNewLabel);
		
		textFieldTartaruga = new JTextField();
		textFieldTartaruga.setOpaque(false);
		textFieldTartaruga.setColumns(10);
		textFieldTartaruga.setBounds(101, 178, 174, 42);
		panelCartellaClinicaRicercatore.add(textFieldTartaruga);
		
		JLabel lblIdCartellaTartaruga = new JLabel("ID TARTARUGA");
		lblIdCartellaTartaruga.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblIdCartellaTartaruga.setBounds(121, 140, 130, 28);
		panelCartellaClinicaRicercatore.add(lblIdCartellaTartaruga);
		
		textFieldNomeTartaruga = new JTextField();
		textFieldNomeTartaruga.setOpaque(false);
		textFieldNomeTartaruga.setColumns(10);
		textFieldNomeTartaruga.setBounds(101, 291, 174, 42);
		panelCartellaClinicaRicercatore.add(textFieldNomeTartaruga);
		
		JLabel lblNewLabel_2 = new JLabel("NOME TARTARUGA\r\n");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(101, 253, 174, 28);
		panelCartellaClinicaRicercatore.add(lblNewLabel_2);
		
		textFieldLuogoRitrovamento = new JTextField();
		textFieldLuogoRitrovamento.setOpaque(false);
		textFieldLuogoRitrovamento.setColumns(10);
		textFieldLuogoRitrovamento.setBounds(393, 75, 174, 42);
		panelCartellaClinicaRicercatore.add(textFieldLuogoRitrovamento);
		
		JLabel lblNewLabel_3 = new JLabel("LUOGO RITROVAMENTO");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(380, 37, 206, 28);
		panelCartellaClinicaRicercatore.add(lblNewLabel_3);
		
		textFieldDataIngresso = new JTextField();
		textFieldDataIngresso.setOpaque(false);
		textFieldDataIngresso.setColumns(10);
		textFieldDataIngresso.setBounds(393, 178, 174, 42);
		panelCartellaClinicaRicercatore.add(textFieldDataIngresso);
		
		JLabel lblNewLabel_4 = new JLabel("DATA INGRESSO");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(408, 140, 147, 28);
		panelCartellaClinicaRicercatore.add(lblNewLabel_4);
		
		lblIndietro = new JLabel("indietro");
		lblIndietro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				accesso.setVisible(true);
			}
		});
		lblIndietro.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblIndietro.setBounds(10, 423, 61, 28);
		panelCartellaClinicaRicercatore.add(lblIndietro);
		
		lblInvio = new JLabel("invio");
		lblInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CCD.queryIdTartaruga(textFieldTartaruga.getText());
				CCD.queryInsertCartellaClinicaRicercatore(textFieldCartellaClinica.getText(), textFieldTartaruga.getText(), textFieldNomeTartaruga.getText(),textFieldLuogoRitrovamento.getText(), textFieldDataIngresso.getText());
				
			}
		});
		lblInvio.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblInvio.setBounds(324, 359, 45, 28);
		panelCartellaClinicaRicercatore.add(lblInvio);
	}
}