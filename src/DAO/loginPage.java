package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerDAO.loginPageDAO;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldMatricola;
	public menu Menu;
	public String stringa;
	public menuMedico menuMedicoVet;
	public accesso Accesso;
	public loginPageDAO LPD;

	/**
	 * Create the frame.
	 */
	public loginPage() {
		loginPageDAO LPD = new loginPageDAO();
		Menu = new menu();
		menuMedicoVet = new menuMedico();
		Accesso = new accesso();

		setTitle("login page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelLogin = new JPanel();
		panelLogin.setBounds(10, 10, 745, 451);
		panelLogin.setBackground(new Color(127, 255, 212));
		contentPane.add(panelLogin);
		panelLogin.setLayout(null);

		JLabel lblMatricola = new JLabel("MATRICOLA");
		lblMatricola.setForeground(new Color(0, 0, 0));
		lblMatricola.setFont(new Font("Yu Gothic Light", Font.PLAIN, 35));
		lblMatricola.setBounds(10, 179, 197, 73);
		panelLogin.add(lblMatricola);

		textFieldMatricola = new JTextField();
		textFieldMatricola.setFont(new Font("Yu Gothic Light", Font.PLAIN, 25));
		textFieldMatricola.setBounds(206, 174, 209, 58);
		panelLogin.add(textFieldMatricola);
		textFieldMatricola.setColumns(10);

		JLabel lblLogo = new JLabel("New label");
		lblLogo.setIcon(new ImageIcon("C:\\Users\\aruta\\OneDrive\\Desktop\\progetto bd oo\\logo progetto.png"));
		lblLogo.setBounds(425, 101, 288, 226);
		panelLogin.add(lblLogo);

		JLabel lblBolle1 = new JLabel("New label");
		lblBolle1.setIcon(new ImageIcon("C:\\Users\\aruta\\OneDrive\\Desktop\\bolle.png"));
		lblBolle1.setBounds(363, 70, 221, 242);
		panelLogin.add(lblBolle1);

		JLabel lblBolle2 = new JLabel("New label");
		lblBolle2.setIcon(new ImageIcon("C:\\Users\\aruta\\OneDrive\\Desktop\\bolle.png"));
		lblBolle2.setBounds(514, 79, 231, 225);
		panelLogin.add(lblBolle2);

		JButton btnAccesso = new JButton("accedi");
		btnAccesso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// cntr.quesryNapoletana(textFieldMatricola.getText(),
				// textFieldMatricola.getText());
				stringa = textFieldMatricola.getText();
				if (LPD.queryAccessoDip(textFieldMatricola.getText())) {
					if (stringa.charAt(0) == 'm') {
						setVisible(false);
						Accesso.setVisible(true);
					}
					else{
						setVisible(false);
						Menu.setVisible(true);
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "sugus");
				}
			}
		});
		btnAccesso.setFont(new Font("Yu Gothic Light", Font.PLAIN, 25));
		btnAccesso.setBounds(163, 262, 126, 43);
		panelLogin.add(btnAccesso);

	}
}
