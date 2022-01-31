package Mois;

public class Mois {

	private String dateDebut;
	private String dateFin;
	private String affectation;
	private String autre;
	
	public Mois(String uneAffectation) {
		this.affectation = uneAffectation;
	}
	
	public Mois(String uneDateDebut, String uneDateFin, String uneAffectation, String uneAutre) {
		this.dateDebut = uneDateDebut;
		this.dateFin = uneDateFin;
		this.affectation = uneAffectation;
		this.autre = uneAutre;
	}
	
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String uneDateDebut) {
		this.dateDebut = uneDateDebut;
	}
	
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String uneDateFin) {
		this.dateFin = uneDateFin;
	}
	
	public String getAffectation() {
		return affectation;
	}
	public void setAffectation(String uneAffectation) {
		this.affectation = uneAffectation;
	}
	
	public String getAutre() {
		return autre;
	}
	public void setAutre(String uneAutre) {
		this.autre = uneAutre;
	}

	public String toString() {
        String rep = "";
        if(this.dateDebut != null) {
        	rep += this.dateDebut + " ";
        }
        return rep;
    }
	
}
