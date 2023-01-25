package DAOricercatore;

import java.awt.EventQueue;
import DAO.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DAO.accesso;
import controllerDAO.statisticheDAO;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClasseStatistiche extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNumeroTartarughe;
	private JTextField textFieldNumeroTartarugheLiberate;
	private JTextField textFieldNumeroTartarugheCurate;
	private JTextField textFieldNumeroTartarugheMalate;
	private JTextField textFieldNumeroTartarugheDecedute;
	private JTextField textFieldDataInizio;
	private JTextField textFieldDataFine;

	public ClasseStatistiche(accessoRicercatore accesso, accesso accesso1) {
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
		lblNumeroTartarughe.setBounds(10, 107, 232, 30);
		panelStatistiche.add(lblNumeroTartarughe);
		
		textFieldNumeroTartarughe = new JTextField();
		textFieldNumeroTartarughe.setForeground(new Color(255, 255, 255));
		textFieldNumeroTartarughe.setOpaque(false);
		textFieldNumeroTartarughe.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldNumeroTartarughe.setColumns(10);
		textFieldNumeroTartarughe.setBounds(10, 136, 232, 45);
		panelStatistiche.add(textFieldNumeroTartarughe);
		
		JLabel lblNumeroTartarugheLiberate = new JLabel("NUMERO TARTARUGHE LIBERATE");
		lblNumeroTartarugheLiberate.setForeground(new Color(255, 255, 255));
		lblNumeroTartarugheLiberate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblNumeroTartarugheLiberate.setBounds(10, 203, 325, 30);
		panelStatistiche.add(lblNumeroTartarugheLiberate);
		
		textFieldNumeroTartarugheLiberate = new JTextField();
		textFieldNumeroTartarugheLiberate.setForeground(new Color(255, 255, 255));
		textFieldNumeroTartarugheLiberate.setOpaque(false);
		textFieldNumeroTartarugheLiberate.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldNumeroTartarugheLiberate.setColumns(10);
		textFieldNumeroTartarugheLiberate.setBounds(10, 234, 232, 45);
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
		textFieldNumeroTartarugheDecedute.setBounds(10, 52, 232, 45);
		panelStatistiche.add(textFieldNumeroTartarugheDecedute);
		
		JLabel lblDataInizio = new JLabel("DATA INIZIO");
		lblDataInizio.setForeground(new Color(255, 255, 255));
		lblDataInizio.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblDataInizio.setBounds(402, 52, 125, 33);
		panelStatistiche.add(lblDataInizio);
		
		textFieldDataInizio = new JTextField();
		textFieldDataInizio.setForeground(new Color(255, 255, 255));
		textFieldDataInizio.setOpaque(false);
		textFieldDataInizio.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldDataInizio.setColumns(10);
		textFieldDataInizio.setBounds(402, 92, 232, 45);
		panelStatistiche.add(textFieldDataInizio);
		
		JLabel lblDataFine = new JLabel("DATA FINE");
		lblDataFine.setForeground(new Color(255, 255, 255));
		lblDataFine.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblDataFine.setBounds(402, 148, 125, 33);
		panelStatistiche.add(lblDataFine);
		
		textFieldDataFine = new JTextField();
		textFieldDataFine.setForeground(new Color(255, 255, 255));
		textFieldDataFine.setOpaque(false);
		textFieldDataFine.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldDataFine.setColumns(10);
		textFieldDataFine.setBounds(402, 180, 232, 45);
		panelStatistiche.add(textFieldDataFine);
		
		JLabel lblInvio = new JLabel("invio");
		lblInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				textFieldNumeroTartarughe.setText(SD.queryNumeroTartarugheTotali(textFieldDataInizio.getText(), textFieldDataFine.getText()));
				textFieldNumeroTartarugheDecedute.setText(SD.queryNumeroTartarugheMorte(textFieldDataInizio.getText(), textFieldDataFine.getText()));
				textFieldNumeroTartarugheLiberate.setText(SD.queryNumeroTartarugheLiberate(textFieldDataInizio.getText(), textFieldDataFine.getText()));
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
		lblInvio.setBounds(310, 327, 46, 33);
		panelStatistiche.add(lblInvio);
		
		JLabel lblIndietro = new JLabel("indietro");
		lblIndietro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				accesso1.setVisible(true);
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
		
		/*JLabel lblSelezionaData = new JLabel("seleziona data");
		lblSelezionaData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SD.queryInsertStatistiche(textFieldDataInizio.getText(), textFieldDataFine.getText());
			}
		});
		lblSelezionaData.setForeground(Color.WHITE);
		lblSelezionaData.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblSelezionaData.setBounds(451, 239, 148, 33);
		panelStatistiche.add(lblSelezionaData);*/
		
	}
}
