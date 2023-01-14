package progetto_bd_oo;

import java.util.ArrayList;

public class cartella_clinica {
	
	ArrayList<dipendente> dipendente = new ArrayList<dipendente>();
	ArrayList<tartaruga> tartaruga = new ArrayList<tartaruga>();
	
	private String idCartellaClinica;
	private String nomeTartaruga;
	private String infoSpecie,luogoRitrovamento,dataLiberazione,dataAccesso,dataDecesso,descrizione,id_tartaruga;
	private double lunghezza,larghezza,peso;
	
	public cartella_clinica(String idCartellaClinica, String nomeTartaruga, String infoSpecie, String luogoRitrovamento,
			String dataLiberazione, String dataAccesso, String dataDecesso, String descrizione, String id_tartaruga,
			double lunghezza, double larghezza, double peso) {
		this.idCartellaClinica = idCartellaClinica;
		this.nomeTartaruga = nomeTartaruga;
		this.infoSpecie = infoSpecie;
		this.luogoRitrovamento = luogoRitrovamento;
		this.dataLiberazione = dataLiberazione;
		this.dataAccesso = dataAccesso;
		this.dataDecesso = dataDecesso;
		this.descrizione = descrizione;
		this.id_tartaruga = id_tartaruga;
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
		this.peso = peso;
	}
	public ArrayList<dipendente> getDipendente() {
		return dipendente;
	}
	public void setDipendente(ArrayList<dipendente> dipendente) {
		this.dipendente = dipendente;
	}
	public ArrayList<tartaruga> getTartaruga() {
		return tartaruga;
	}
	public void setTartaruga(ArrayList<tartaruga> tartaruga) {
		this.tartaruga = tartaruga;
	}
	public String getIdCartellaClinica() {
		return idCartellaClinica;
	}
	public void setIdCartellaClinica(String idCartellaClinica) {
		this.idCartellaClinica = idCartellaClinica;
	}
	public String getNomeTartaruga() {
		return nomeTartaruga;
	}
	public void setNomeTartaruga(String nomeTartaruga) {
		this.nomeTartaruga = nomeTartaruga;
	}
	public String getInfoSpecie() {
		return infoSpecie;
	}
	public void setInfoSpecie(String infoSpecie) {
		this.infoSpecie = infoSpecie;
	}
	public String getLuogoRitrovamento() {
		return luogoRitrovamento;
	}
	public void setLuogoRitrovamento(String luogoRitrovamento) {
		this.luogoRitrovamento = luogoRitrovamento;
	}
	public String getDataLiberazione() {
		return dataLiberazione;
	}
	public void setDataLiberazione(String dataLiberazione) {
		this.dataLiberazione = dataLiberazione;
	}
	public String getDataAccesso() {
		return dataAccesso;
	}
	public void setDataAccesso(String dataAccesso) {
		this.dataAccesso = dataAccesso;
	}
	public String getDataDecesso() {
		return dataDecesso;
	}
	public void setDataDecesso(String dataDecesso) {
		this.dataDecesso = dataDecesso;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getId_tartaruga() {
		return id_tartaruga;
	}
	public void setId_tartaruga(String id_tartaruga) {
		this.id_tartaruga = id_tartaruga;
	}
	public double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	public double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "ID CARTELLA CLINICA " + idCartellaClinica + "\n" + "ID TARTARUGA " +  id_tartaruga + "\n" + "NOME TARTARUGA " + nomeTartaruga + "\n" + 
			   "INFO SPECIE " + infoSpecie + "\n" + "LUNGHEZZA " + lunghezza + "\n" + "LARGHEZZA " + larghezza + "\n" + "PESO " + peso + "\n" + 
				"LUOGO RITROVAMENTO " + luogoRitrovamento + "\n" + "DESCRIZIONE " + descrizione;
	}

}
