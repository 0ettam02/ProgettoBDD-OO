package entità;


public class cartella_clinica {
	
	
	private String idCartellaClinica;
	private String nomeTartaruga;
	private String infoSpecie,luogoRitrovamento,descrizione,id_tartaruga, data_ingresso;
	private double lunghezza,larghezza,peso;
	
	public cartella_clinica(String idCartellaClinica, String nomeTartaruga, String infoSpecie, String luogoRitrovamento,
			String descrizione, String id_tartaruga, String data_ingresso, double lunghezza, double larghezza,
			double peso) {
		this.idCartellaClinica = idCartellaClinica;
		this.nomeTartaruga = nomeTartaruga;
		this.infoSpecie = infoSpecie;
		this.luogoRitrovamento = luogoRitrovamento;
		this.descrizione = descrizione;
		this.id_tartaruga = id_tartaruga;
		this.data_ingresso = data_ingresso;
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
		this.peso = peso;
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
	
	public String getData_ingresso() {
		return data_ingresso;
	}

	public void setData_ingresso(String data_ingresso) {
		this.data_ingresso = data_ingresso;
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
				"LUOGO RITROVAMENTO " + luogoRitrovamento + "\n" + "DESCRIZIONE " + descrizione + "\n" +  "DATA INGRESSO " + data_ingresso;
	}

}
