package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuMedico extends JFrame {

	private JPanel contentPane;
	//public accesso Accesso;

	public menuMedico() {
		setTitle("menu medico");
		
		controller cntr = new controller();
		
		setBackground(new Color(127, 255, 212));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 508);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMnuMedico = new JPanel();
		panelMnuMedico.setBackground(new Color(127, 255, 212));
		panelMnuMedico.setBounds(10, 10, 745, 451);
		contentPane.add(panelMnuMedico);
		panelMnuMedico.setLayout(null);
		
		JButton btnCartellaClinica = new JButton("cartella clinica");
		btnCartellaClinica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCartellaClinica.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnCartellaClinica.setBounds(277, 236, 173, 46);
		panelMnuMedico.add(btnCartellaClinica);
		
		/*JButton btnIndietro = new JButton("<---");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Accesso.setVisible(true);
			}
		});
		btnIndietro.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnIndietro.setBounds(10, 409, 133, 32);
		panelMnuMedico.add(btnIndietro);*/
	}
}
