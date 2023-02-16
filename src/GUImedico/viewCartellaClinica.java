package GUImedico;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import query.viewCartellaClinicaDAO;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class viewCartellaClinica extends JFrame {

	private JPanel contentPane;
	private JTextArea textFieldCartellaClinica;
	private JTextField textFieldSceltaId;
	controller cntr = new controller();
	
	public viewCartellaClinica(accesso Accesso) {
		setTitle("View cartella clinica");
		
		viewCartellaClinicaDAO VCCD = new viewCartellaClinicaDAO();
		
		setBackground(new Color(127, 255, 212));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 538);
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
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelViewCartellaClinica = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelViewCartellaClinica.setBackground(new Color(127, 255, 212));
		panelViewCartellaClinica.setBounds(10, 10, 761, 481);
		contentPane.add(panelViewCartellaClinica);
		
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
		btnIndietro.setBounds(10, 419, 86, 52);
		panelViewCartellaClinica.setLayout(null);
		btnIndietro.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		panelViewCartellaClinica.add(btnIndietro);
		
		textFieldSceltaId = new JTextField();
		textFieldSceltaId.setForeground(new Color(255, 255, 255));
		textFieldSceltaId.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldSceltaId.setOpaque(false);
		textFieldSceltaId.setBounds(610, 426, 141, 45);
		panelViewCartellaClinica.add(textFieldSceltaId);
		textFieldSceltaId.setColumns(10);
		
		textFieldCartellaClinica = new JTextArea();
		textFieldCartellaClinica.setBounds(10, 10, 739, 397);
		textFieldCartellaClinica.setVisible(false);
		panelViewCartellaClinica.add(textFieldCartellaClinica);
		textFieldCartellaClinica.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldCartellaClinica.setColumns(10);
		
		JLabel btnIdCartellaClinica = new JLabel("inserisci l'ID della\r\ncartella clinica ");
		btnIdCartellaClinica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String stringa = cntr.querySelezioneCartellaClinica(VCCD, textFieldCartellaClinica, textFieldSceltaId);
				textFieldCartellaClinica.setText(stringa);
				System.out.println(stringa);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btnIdCartellaClinica.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnIdCartellaClinica.setForeground(Color.white);
			}
		});
		btnIdCartellaClinica.setForeground(new Color(255, 255, 255));
		btnIdCartellaClinica.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		btnIdCartellaClinica.setBounds(339, 432, 261, 39);
		panelViewCartellaClinica.add(btnIdCartellaClinica);
		
	
	}
}
