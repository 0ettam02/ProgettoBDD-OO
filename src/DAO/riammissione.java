package DAO;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class riammissione extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIdTartaruga;
	
	
	public riammissione(accesso accesso) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelRiammissione = new JPanel();
		panelRiammissione.setBounds(10, 10, 720, 462);
		contentPane.add(panelRiammissione);
		panelRiammissione.setLayout(null);
		
		JLabel lblInserisciId = new JLabel("INSERISCI L'ID DELLA TARTARUGA");
		lblInserisciId.setHorizontalAlignment(SwingConstants.CENTER);
		lblInserisciId.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblInserisciId.setBounds(185, 206, 352, 53);
		panelRiammissione.add(lblInserisciId);
		
		textFieldIdTartaruga = new JTextField();
		textFieldIdTartaruga.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		textFieldIdTartaruga.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIdTartaruga.setBounds(267, 269, 162, 34);
		panelRiammissione.add(textFieldIdTartaruga);
		textFieldIdTartaruga.setColumns(10);
		
		JLabel lblIndietro = new JLabel("indietro");
		lblIndietro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				accesso.setVisible(true);
				
			}
		});
		lblIndietro.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lblIndietro.setBounds(10, 424, 66, 28);
		panelRiammissione.add(lblIndietro);
	}
}
