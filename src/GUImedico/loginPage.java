package GUImedico;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GUIoperatore.accessoOperatore;
import GUIricercatore.accessoRicercatore;
import GUItecnico.accessoTecnico;
import query.loginPageDAO;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
public class loginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMatricola;
	public accessoOperatore AO;
	public String stringa;
	public accesso Accesso;
	public loginPageDAO LPD;

	
	public loginPage() {
		loginPageDAO LPD = new loginPageDAO();
		AO = new accessoOperatore();
		Accesso = new accesso();
		accessoRicercatore AR = new accessoRicercatore();
		accessoTecnico AT = new accessoTecnico();

		setTitle("login page");
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
		setResizable(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelLogin = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.decode("#7fffd4"), 0, getHeight(), Color.decode("#008080"));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panelLogin.setBounds(10, 10, 745, 451);
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);

		JLabel lblMatricola = new JLabel("MATRICOLA");
		lblMatricola.setForeground(new Color(255, 255, 255));
		lblMatricola.setFont(new Font("Tw Cen MT", Font.PLAIN, 35));
		lblMatricola.setBounds(10, 179, 197, 73);
		panelLogin.add(lblMatricola);

		textFieldMatricola = new JTextField();
		textFieldMatricola.setForeground(new Color(255, 255, 255));
		textFieldMatricola.setOpaque(false);
		textFieldMatricola.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		textFieldMatricola.setBounds(193, 189, 209, 58);
		panelLogin.add(textFieldMatricola);
		textFieldMatricola.setColumns(10);

		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon("C:\\Users\\aruta\\OneDrive\\Desktop\\progetto bd oo\\logo2.png"));
		lblLogo.setBounds(485, 112, 250, 248);
		panelLogin.add(lblLogo);

		JLabel btnAccesso = new JLabel("accedi");
		btnAccesso.setForeground(new Color(255, 255, 255));
		btnAccesso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stringa = textFieldMatricola.getText();
				if (LPD.queryAccessoDip(textFieldMatricola.getText())) {
					if (stringa.charAt(0) == 'm') {
						setVisible(false);
						Accesso.setVisible(true);
					}
					else if(stringa.charAt(0) == 'r'){
						setVisible(false);
						AR.setVisible(true);
					}else if(stringa.charAt(0) == 'o'){
						setVisible(false);
						AO.setVisible(true);
					}else {
						setVisible(false);
						AT.setVisible(true);
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "inserimento invalido, riprova");
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAccesso.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAccesso.setForeground(Color.white);
			}
		});
		btnAccesso.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		btnAccesso.setBounds(220, 283, 78, 30);
		panelLogin.add(btnAccesso);

	}
}
