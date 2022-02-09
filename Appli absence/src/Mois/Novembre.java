package Mois;

public class Novembre {
	private String dateDebutN;
	private String dateFinN;
	private String affectationN;
	
	public Novembre(String uneAffectationN) {
		this.affectationN = uneAffectationN;
	}
	public Novembre(String uneDateDebutN, String uneDateFinN, String uneAffectationN) {
		this.dateDebutN = uneDateDebutN;
		this.dateFinN = uneDateFinN;
		this.affectationN = uneAffectationN;
	}
	
	public String getDateDebutN() {
		return dateDebutN;
	}
	public void setDateDebutN(String uneDateDebutN) {
		this.dateDebutN = uneDateDebutN;
	}
	
	public String getDateFinN() {
		return dateFinN;
	}
	public void setDateFinN(String uneDateFinN) {
		this.dateFinN = uneDateFinN;
	}
	
	public String getAffectationN() {
		return affectationN;
	}
	public void setAffectationN(String uneAffectationN) {
		this.affectationN = uneAffectationN;
	}
}
