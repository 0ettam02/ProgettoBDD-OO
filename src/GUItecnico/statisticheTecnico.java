package GUItecnico;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

import GUImedico.*;
import query.statisticheDAO;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class statisticheTecnico extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNumeroTartarughe;
	private JTextField textFieldNumeroTartarugheLiberate;
	private JTextField textFieldNumeroTartarugheDecedute;
	private JTable tableViewStats;
	public JComboBox comboBox;
	controller cntr = new controller();

	public statisticheTecnico(accessoTecnico accesso) {
		setTitle("statistiche");
		
		statisticheDAO SD = new statisticheDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 542);
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
		contentPane.setBackground(new Color(127, 225, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelStatistiche = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelStatistiche.setBackground(new Color(127, 225, 212));
		panelStatistiche.setBounds(10, 10, 751, 495);
		contentPane.add(panelStatistiche);
		panelStatistiche.setLayout(null);
		
		
		JLabel lblNumeroTartarughe = new JLabel("NUMERO TARTARUGHE");
		lblNumeroTartarughe.setForeground(new Color(255, 255, 255));
		lblNumeroTartarughe.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNumeroTartarughe.setBounds(369, 12, 232, 30);
		panelStatistiche.add(lblNumeroTartarughe);
		
		textFieldNumeroTartarughe = new JTextField();
		textFieldNumeroTartarughe.setForeground(new Color(255, 255, 255));
		textFieldNumeroTartarughe.setOpaque(false);
		textFieldNumeroTartarughe.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldNumeroTartarughe.setColumns(10);
		textFieldNumeroTartarughe.setBounds(357, 46, 232, 45);
		textFieldNumeroTartarughe.setText(SD.queryNumeroTartarugheTotali());
		panelStatistiche.add(textFieldNumeroTartarughe);
		
		JLabel lblNumeroTartarugheLiberate = new JLabel("NUMERO TARTARUGHE LIBERATE");
		lblNumeroTartarugheLiberate.setForeground(new Color(255, 255, 255));
		lblNumeroTartarugheLiberate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNumeroTartarugheLiberate.setBounds(10, 102, 278, 30);
		panelStatistiche.add(lblNumeroTartarugheLiberate);
		
		textFieldNumeroTartarugheLiberate = new JTextField();
		textFieldNumeroTartarugheLiberate.setForeground(new Color(255, 255, 255));
		textFieldNumeroTartarugheLiberate.setOpaque(false);
		textFieldNumeroTartarugheLiberate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldNumeroTartarugheLiberate.setColumns(10);
		textFieldNumeroTartarugheLiberate.setBounds(20, 131, 232, 45);
		textFieldNumeroTartarugheLiberate.setText(SD.queryNumeroTartarugheLiberate());
		panelStatistiche.add(textFieldNumeroTartarugheLiberate);
		
		JLabel lblNumeroTartarugheDecedute = new JLabel("NUMERO TARTARUGHE  DECEDUTE");
		lblNumeroTartarugheDecedute.setForeground(new Color(255, 255, 255));
		lblNumeroTartarugheDecedute.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNumeroTartarugheDecedute.setBounds(10, 12, 339, 30);
		panelStatistiche.add(lblNumeroTartarugheDecedute);
		
		textFieldNumeroTartarugheDecedute = new JTextField();
		textFieldNumeroTartarugheDecedute.setForeground(new Color(255, 255, 255));
		textFieldNumeroTartarugheDecedute.setOpaque(false);
		textFieldNumeroTartarugheDecedute.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldNumeroTartarugheDecedute.setColumns(10);
		textFieldNumeroTartarugheDecedute.setBounds(10, 46, 232, 45);
		textFieldNumeroTartarugheDecedute.setText(SD.queryNumeroTartarugheMorte());
		panelStatistiche.add(textFieldNumeroTartarugheDecedute);
		
		JLabel lblInvio = new JLabel("invio");
		lblInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cntr.querySelezioneStatsTecnico(SD, comboBox, tableViewStats);
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
		lblInvio.setForeground(new Color(255, 255, 255));
		lblInvio.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblInvio.setBounds(516, 156, 46, 33);
		panelStatistiche.add(lblInvio);
		
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
		lblIndietro.setBounds(10, 452, 82, 33);
		panelStatistiche.add(lblIndietro);
		
		JScrollPane scrollPaneViewSts = new JScrollPane();
		scrollPaneViewSts.setBounds(20, 210, 678, 240);
		panelStatistiche.add(scrollPaneViewSts);
		
		tableViewStats = new JTable();
		scrollPaneViewSts.setViewportView(tableViewStats);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"annuali totali", "mensili totali", "annuali liberate", "mensili liberate", "annuali morte", "mensili morte"}));
		comboBox.setBounds(357, 146, 149, 54);
		panelStatistiche.add(comboBox);
		
	}
}
