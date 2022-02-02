package Mois;

public class Novembre {
	private String dateDebutN;
	private String dateFinN;
	private String affectationN;
	private String autreN;
	
	public Novembre(String uneAffectationN) {
		this.affectationN = uneAffectationN;
	}
	public Novembre(String uneDateDebutN, String uneDateFinN, String uneAffectationN, String uneAutreN) {
		this.dateDebutN = uneDateDebutN;
		this.dateFinN = uneDateFinN;
		this.affectationN = uneAffectationN;
		this.autreN = uneAutreN;
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
	
	public String getAutreN() {
		return autreN;
	}
	public void setAutreN(String uneAutreN) {
		this.autreN = uneAutreN;
	}
}
