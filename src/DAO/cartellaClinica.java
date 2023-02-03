package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

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
	private JTextField textFieldDataIngresso;
	private JLabel lblDataIngresso;
	public JTextArea textArea;

	public cartellaClinica(primoAccesso primoAccesso) {
		setTitle("cartella clinica\r\n");
		cartellaClinicaDAO CCD = new cartellaClinicaDAO();
		controller cntr = new controller();

		setBackground(new Color(127, 255, 212));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1017, 761);
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
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelCartellaClinica = new JPanel() {
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
		panelCartellaClinica.setBackground(new Color(127, 255, 212));
		panelCartellaClinica.setBounds(10, 10, 983, 704);
		contentPane.add(panelCartellaClinica);
		panelCartellaClinica.setLayout(null);

		JLabel btnInvio = new JLabel("invio");
		btnInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				primoAccesso.setVisible(true);
				cntr.queryCartellaClinicaDAO(CCD,textFieldIdTartaruga,
						textFieldIdCartellaClinica, textFieldNomeTartaruga,textFieldInfoSpecie,
						textFieldLunghezza, textFieldLarghezza, textFieldPeso,
						textFieldLuogoRitrovamento, textArea,textFieldDataIngresso );
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnInvio.setForeground(Color.black);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnInvio.setForeground(Color.white);
			}
		});
		btnInvio.setForeground(new Color(255, 255, 255));
		btnInvio.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		btnInvio.setBounds(431, 650, 65, 44);
		panelCartellaClinica.add(btnInvio);

		textFieldIdCartellaClinica = new JTextField();
		textFieldIdCartellaClinica.setOpaque(false);
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
		textFieldIdTartaruga.setOpaque(false);
		textFieldIdTartaruga.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldIdTartaruga.setColumns(10);
		textFieldIdTartaruga.setBounds(10, 127, 475, 44);
		panelCartellaClinica.add(textFieldIdTartaruga);

		JLabel lblNomeTartaruga = new JLabel("NOME TARTARUGA");
		lblNomeTartaruga.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNomeTartaruga.setBounds(10, 181, 190, 33);
		panelCartellaClinica.add(lblNomeTartaruga);

		textFieldNomeTartaruga = new JTextField();
		textFieldNomeTartaruga.setOpaque(false);
		textFieldNomeTartaruga.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldNomeTartaruga.setColumns(10);
		textFieldNomeTartaruga.setBounds(10, 213, 475, 44);
		panelCartellaClinica.add(textFieldNomeTartaruga);

		JLabel lblInfoSpecie = new JLabel("INFO SPECIE");
		lblInfoSpecie.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblInfoSpecie.setBounds(10, 267, 190, 33);
		panelCartellaClinica.add(lblInfoSpecie);

		textFieldInfoSpecie = new JTextField();
		textFieldInfoSpecie.setOpaque(false);
		textFieldInfoSpecie.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldInfoSpecie.setColumns(10);
		textFieldInfoSpecie.setBounds(10, 299, 475, 44);
		panelCartellaClinica.add(textFieldInfoSpecie);

		JLabel lblLunghezza = new JLabel("LUNGHEZZA");
		lblLunghezza.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblLunghezza.setBounds(10, 353, 190, 33);
		panelCartellaClinica.add(lblLunghezza);

		textFieldLunghezza = new JTextField();
		textFieldLunghezza.setOpaque(false);
		textFieldLunghezza.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldLunghezza.setColumns(10);
		textFieldLunghezza.setBounds(10, 386, 475, 44);
		panelCartellaClinica.add(textFieldLunghezza);

		JLabel lblLarghezza = new JLabel("LARGHEZZA");
		lblLarghezza.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblLarghezza.setBounds(10, 440, 190, 33);
		panelCartellaClinica.add(lblLarghezza);

		textFieldLarghezza = new JTextField();
		textFieldLarghezza.setOpaque(false);
		textFieldLarghezza.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldLarghezza.setColumns(10);
		textFieldLarghezza.setBounds(10, 475, 475, 44);
		panelCartellaClinica.add(textFieldLarghezza);

		JLabel lblPeso = new JLabel("PESO");
		lblPeso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblPeso.setBounds(10, 529, 190, 33);
		panelCartellaClinica.add(lblPeso);

		textFieldPeso = new JTextField();
		textFieldPeso.setOpaque(false);
		textFieldPeso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldPeso.setColumns(10);
		textFieldPeso.setBounds(10, 558, 475, 44);
		panelCartellaClinica.add(textFieldPeso);

		JLabel lblLuogoRitrovamento = new JLabel("LUOGO RITROVAMENTO");
		lblLuogoRitrovamento.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblLuogoRitrovamento.setBounds(495, 10, 232, 40);
		panelCartellaClinica.add(lblLuogoRitrovamento);

		textFieldLuogoRitrovamento = new JTextField();
		textFieldLuogoRitrovamento.setOpaque(false);
		textFieldLuogoRitrovamento.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldLuogoRitrovamento.setColumns(10);
		textFieldLuogoRitrovamento.setBounds(495, 49, 475, 44);
		panelCartellaClinica.add(textFieldLuogoRitrovamento);

		JLabel lblDescrizione = new JLabel("DESCRIZIONE");
		lblDescrizione.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblDescrizione.setBounds(495, 100, 232, 33);
		panelCartellaClinica.add(lblDescrizione);

		textFieldDataIngresso = new JTextField();
		textFieldDataIngresso.setOpaque(false);
		textFieldDataIngresso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		textFieldDataIngresso.setColumns(10);
		textFieldDataIngresso.setBounds(495, 299, 475, 44);
		panelCartellaClinica.add(textFieldDataIngresso);
		
		lblDataIngresso = new JLabel("DATA INGRESSO");
		lblDataIngresso.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblDataIngresso.setBounds(495, 267, 147, 33);
		panelCartellaClinica.add(lblDataIngresso);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(495, 127, 478, 87);
		panelCartellaClinica.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setToolTipText("testa");
		scrollPane.setViewportView(textArea);
	}
}
