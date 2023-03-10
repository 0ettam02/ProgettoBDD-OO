package GUImedico;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import query.primoAccessoDAO;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class primoAccesso extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public cartellaClinica cartellaClinicaTartarughe;
	controller cntr = new controller();
	
	public primoAccesso(accesso Accesso) {
		setBackground(new Color(127, 225, 212));
		setTitle("primo accesso");
		
		cartellaClinicaTartarughe  = new cartellaClinica(this);
		primoAccessoDAO PAD = new primoAccessoDAO();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 551);
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
		
		JPanel panelPrimoAccesso = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelPrimoAccesso.setBackground(new Color(0, 128, 128));
		panelPrimoAccesso.setBounds(10, 10, 719, 494);
		contentPane.add(panelPrimoAccesso);
		panelPrimoAccesso.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		textField.setForeground(new Color(255, 255, 255));
		textField.setOpaque(false);
		textField.setBounds(230, 176, 216, 56);
		panelPrimoAccesso.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("inserire il numero della vasca");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNewLabel.setBounds(191, 100, 299, 66);
		panelPrimoAccesso.add(lblNewLabel);
		
		JLabel btnInvio = new JLabel("invio");
		btnInvio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cntr.queryInserimentoNumVasca(PAD, textField);
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
		btnInvio.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		btnInvio.setBounds(313, 242, 48, 32);
		panelPrimoAccesso.add(btnInvio);
		
		JLabel btnIndietro = new JLabel("indietro");
		btnIndietro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Accesso.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnIndietro.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnIndietro.setForeground(Color.white);
			}
		});
		btnIndietro.setForeground(new Color(255, 255, 255));
		btnIndietro.setBackground(new Color(255, 255, 255));
		btnIndietro.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		btnIndietro.setBounds(10, 452, 88, 32);
		panelPrimoAccesso.add(btnIndietro);
		
		JLabel btnNewButton = new JLabel("cartella clinica");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				cartellaClinicaTartarughe.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(Color.white);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton.setOpaque(false);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		btnNewButton.setBounds(245, 318, 187, 66);
		panelPrimoAccesso.add(btnNewButton);
	}
}
