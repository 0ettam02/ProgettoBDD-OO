package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllerDAO.primoAccessoDAO;

import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class primoAccesso extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	public primoAccesso(accesso Accesso) {
		setBackground(new Color(127, 225, 212));
		setTitle("primo accesso");
		
		primoAccessoDAO PAD = new primoAccessoDAO();
		menuMedico menuMedicoVet = new menuMedico();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 225, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPrimoAccesso = new JPanel();
		panelPrimoAccesso.setBackground(new Color(0, 128, 128));
		panelPrimoAccesso.setBounds(10, 10, 719, 494);
		contentPane.add(panelPrimoAccesso);
		panelPrimoAccesso.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(230, 176, 216, 56);
		panelPrimoAccesso.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("inseirire il numero della vasca");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		lblNewLabel.setBounds(212, 94, 258, 72);
		panelPrimoAccesso.add(lblNewLabel);
		
		JButton btnInvio = new JButton("invio");
		btnInvio.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnInvio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PAD.queryInsertNumeroVasca(textField.getText(), textField.getText());
				setVisible(false);
				menuMedicoVet.setVisible(true);
			}
		});
		btnInvio.setBounds(275, 242, 124, 32);
		panelPrimoAccesso.add(btnInvio);
		
		JButton btnIndietro = new JButton("<--");
		btnIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Accesso.setVisible(true);
			}
		});
		btnIndietro.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnIndietro.setBounds(10, 452, 153, 32);
		panelPrimoAccesso.add(btnIndietro);
	}
}
