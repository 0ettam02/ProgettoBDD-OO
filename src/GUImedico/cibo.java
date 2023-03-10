package GUImedico;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import query.ciboDAO;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class cibo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTipoCibo;
	private JTextField textFieldPesoCiboTot;
	private JTextField textFieldPesoCiboMan;
	private JTextField textFieldNumVasca;
	private JTextField textFieldData;
	private JLabel lblInvio;

	public cibo(accesso accesso) {

		controller cntr = new controller();
		ciboDAO CD = new ciboDAO();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 519);
		setResizable(false);
		contentPane = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(),
						Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelCibo = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(),
						Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelCibo.setBounds(10, 10, 720, 462);
		contentPane.add(panelCibo);
		panelCibo.setLayout(null);

		textFieldTipoCibo = new JTextField();
		textFieldTipoCibo.setBounds(76, 71, 185, 36);
		panelCibo.add(textFieldTipoCibo);
		textFieldTipoCibo.setColumns(10);

		JLabel lblPesoCiboMangiato = new JLabel("PESO CIBO MANGIATO");
		lblPesoCiboMangiato.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoCiboMangiato.setForeground(Color.BLACK);
		lblPesoCiboMangiato.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblPesoCiboMangiato.setBounds(44, 214, 245, 36);
		panelCibo.add(lblPesoCiboMangiato);

		JLabel lblPesoCiboTotale = new JLabel("PESO CIBO TOTALE");
		lblPesoCiboTotale.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesoCiboTotale.setForeground(Color.BLACK);
		lblPesoCiboTotale.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblPesoCiboTotale.setBounds(44, 117, 245, 36);
		panelCibo.add(lblPesoCiboTotale);

		JLabel lblNumeroVasca = new JLabel("NUMERO VASCA");
		lblNumeroVasca.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroVasca.setForeground(Color.BLACK);
		lblNumeroVasca.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNumeroVasca.setBounds(44, 304, 245, 36);
		panelCibo.add(lblNumeroVasca);

		JLabel lbltipoCibo = new JLabel("TIPO CIBO");
		lbltipoCibo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltipoCibo.setForeground(Color.BLACK);
		lbltipoCibo.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lbltipoCibo.setBounds(44, 28, 245, 36);
		panelCibo.add(lbltipoCibo);

		textFieldPesoCiboTot = new JTextField();
		textFieldPesoCiboTot.setColumns(10);
		textFieldPesoCiboTot.setBounds(76, 152, 185, 36);
		panelCibo.add(textFieldPesoCiboTot);

		textFieldPesoCiboMan = new JTextField();
		textFieldPesoCiboMan.setColumns(10);
		textFieldPesoCiboMan.setBounds(76, 247, 185, 36);
		panelCibo.add(textFieldPesoCiboMan);

		textFieldNumVasca = new JTextField();
		textFieldNumVasca.setColumns(10);
		textFieldNumVasca.setBounds(76, 350, 185, 36);
		panelCibo.add(textFieldNumVasca);

		textFieldData = new JTextField();
		textFieldData.setColumns(10);
		textFieldData.setBounds(434, 187, 185, 36);
		panelCibo.add(textFieldData);

		JLabel lblDataGiornaliera = new JLabel("DATA");
		lblDataGiornaliera.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataGiornaliera.setForeground(Color.BLACK);
		lblDataGiornaliera.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblDataGiornaliera.setBounds(400, 152, 245, 36);
		panelCibo.add(lblDataGiornaliera);

		lblInvio = new JLabel("invio");
		lblInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cntr.queryStatisticheCibo(CD, textFieldTipoCibo, textFieldPesoCiboTot, textFieldPesoCiboMan, textFieldNumVasca);
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
		lblInvio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInvio.setForeground(new Color(255, 255, 255));
		lblInvio.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblInvio.setBounds(305, 416, 56, 36);
		panelCibo.add(lblInvio);

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
		lblIndietro.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndietro.setForeground(new Color(255, 255, 255));
		lblIndietro.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblIndietro.setBounds(0, 416, 82, 36);
		panelCibo.add(lblIndietro);
	}
}
