package DAO;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import controllerDAO.cartellaClinicaDAO;
import controllerDAO.ciboDAO;
import controllerDAO.riammissioneDAO;
import controllerDAO.viewCartellaClinicaDAO;

public class controller {
	collegamento cl = new collegamento();

	protected void queryCartellaClinicaDAO(cartellaClinicaDAO CCD, JTextField textFieldIdTartaruga,
			JTextField textFieldIdCartellaClinica, JTextField textFieldNomeTartaruga, JTextField textFieldInfoSpecie,
			JTextField textFieldLunghezza, JTextField textFieldLarghezza, JTextField textFieldPeso,
			JTextField textFieldLuogoRitrovamento, JTextArea textArea, JTextField textFieldDataIngresso) {

		CCD.queryIdTartaruga(textFieldIdTartaruga.getText());
		CCD.queryInsertCartellaClinica(textFieldIdCartellaClinica.getText(), textFieldIdTartaruga.getText(),
				textFieldNomeTartaruga.getText(), textFieldInfoSpecie.getText(),
				Double.parseDouble(textFieldLunghezza.getText()), Double.parseDouble(textFieldLarghezza.getText()),
				Double.parseDouble(textFieldPeso.getText()), textFieldLuogoRitrovamento.getText(),
				textArea.getText(), textFieldDataIngresso.getText());
	}
	
	
	

	protected void queryStatisticheCibo(ciboDAO CD, JTextField textFieldTipoCibo, JTextField textFieldPesoCiboTot,
			JTextField textFieldPesoCiboMan, JTextField textFieldNumVasca) {
		CD.queryStatisticheCibo(textFieldTipoCibo.getText(), textFieldPesoCiboTot.getText(),
				textFieldPesoCiboMan.getText(), textFieldNumVasca.getText());
		
		
	}

	protected String querySelezioneCartellaClinica(viewCartellaClinicaDAO VCCD, JTextArea textFieldCartellaClinica,
			JTextField textFieldSceltaId) {
		textFieldCartellaClinica.setVisible(true);
		ArrayList<String> lista = VCCD.querySelezioneCartellaClinica(textFieldSceltaId.getText());
		String stringa = "";
		for (String temp : lista) {
			stringa += temp;
		}
		return stringa;
	}
	
	

	protected void queryRiammissione(JPanel panelRiammissione, String stringa, JTextField textFieldIdTartaruga,
			JTable tableViewId, riammissioneDAO RD, JTextField textFieldTartaruga,
			JTextField textFieldIdCartellaClinica, JTextField textFieldLunghezza, JTextField textFieldLarghezza,
			JTextField textFieldPeso, JTextField textFieldDescrizione, JTextField textFieldDataIngresso,
			JTextField textFieldTarghetta, JTextField textFieldLuogoRitrovamento, JPanel panelCartellaClinicaRiammissione) {
		stringa = textFieldIdTartaruga.getText();
		for (int i = 0; i < tableViewId.getRowCount(); i++) {
			if (stringa.equals(tableViewId.getValueAt(i, 0))) {
				panelRiammissione.setVisible(false);
				panelCartellaClinicaRiammissione.setVisible(true);
			}

		}
		textFieldTartaruga.setText(RD.queryIdTartaruga(stringa));
		textFieldIdCartellaClinica.setText(RD.queryIdCartellaClinica(stringa));
		textFieldLunghezza.setText(RD.queryLunghezza(stringa));
		textFieldLarghezza.setText(RD.queryLarghezza(stringa));
		textFieldPeso.setText(RD.queryPeso(stringa));
		textFieldDescrizione.setText(RD.queryDescrizione(stringa));
		textFieldDataIngresso.setText(RD.queryDataIngresso(stringa));
		textFieldTarghetta.setText(RD.querySelezioneTarghetta(stringa));
		textFieldLuogoRitrovamento.setText(RD.querySelezioneLuogo(stringa));
	}




	

	

}
