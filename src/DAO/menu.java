package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class menu extends JFrame {

	private JPanel contentPane;

	
	public menu() {
		setTitle("menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 509);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(127, 255, 212));
		panelMenu.setBounds(10, 10, 745, 460);
		contentPane.add(panelMenu);
		
		JButton btnAreaMedico = new JButton("Area medico");
		btnAreaMedico.setIcon(new ImageIcon("C:\\Users\\aruta\\OneDrive\\Desktop\\medicoN.jpg"));
		btnAreaMedico.setBackground(new Color(192, 192, 192));
		btnAreaMedico.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnAreaMedico.setBounds(7, 7, 180, 437);
		
		JButton btnAreaOperatore = new JButton("Area operatore");
		btnAreaOperatore.setIcon(new ImageIcon("C:\\Users\\aruta\\OneDrive\\Desktop\\sugus.jpg"));
		btnAreaOperatore.setBackground(new Color(192, 192, 192));
		btnAreaOperatore.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnAreaOperatore.setBounds(191, 7, 180, 437);
		
		JButton btnAreaRicercatore = new JButton("Area ricercatore");
		btnAreaRicercatore.setIcon(new ImageIcon("C:\\Users\\aruta\\OneDrive\\Desktop\\faccia massimo.png"));
		btnAreaRicercatore.setBackground(new Color(192, 192, 192));
		btnAreaRicercatore.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnAreaRicercatore.setBounds(375, 7, 179, 437);
		
		JButton btnAreaTecnicoLaboratorio = new JButton("Area tecnico \r\n");
		btnAreaTecnicoLaboratorio.setIcon(new ImageIcon("C:\\Users\\aruta\\OneDrive\\Desktop\\triangoletano.png"));
		btnAreaTecnicoLaboratorio.setBackground(new Color(192, 192, 192));
		btnAreaTecnicoLaboratorio.setFont(new Font("Yu Gothic Light", Font.PLAIN, 20));
		btnAreaTecnicoLaboratorio.setBounds(558, 7, 180, 437);
		panelMenu.setLayout(null);
		panelMenu.add(btnAreaMedico);
		panelMenu.add(btnAreaOperatore);
		panelMenu.add(btnAreaRicercatore);
		panelMenu.add(btnAreaTecnicoLaboratorio);
	}
}
