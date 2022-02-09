package Mois;

public class Juillet {
	private String dateDebutJ;
	private String dateFinJ;
	private String affectationJ;
	
	public Juillet(String uneAffectationJ) {
		this.affectationJ = uneAffectationJ;
	}
	public Juillet(String uneDateDebutJ, String uneDateFinJ, String uneAffectationJ) {
		this.dateDebutJ = uneDateDebutJ;
		this.dateFinJ = uneDateFinJ;
		this.affectationJ = uneAffectationJ;
	}
	
	public String getDateDebutJ() {
		return dateDebutJ;
	}
	public void setDateDebutJ(String uneDateDebutJ) {
		this.dateDebutJ = uneDateDebutJ;
	}
	
	public String getDateFinJ() {
		return dateFinJ;
	}
	public void setDateFinJ(String uneDateFinJ) {
		this.dateFinJ = uneDateFinJ;
	}
	
	public String getAffectationJ() {
		return affectationJ;
	}
	public void setAffectationJ(String uneAffectationJ) {
		this.affectationJ = uneAffectationJ;
	}	
}
