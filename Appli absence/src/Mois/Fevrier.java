package Mois;

public class Fevrier {
	private String dateDebutF;
	private String dateFinF;
	private String affectationF;
	
	public Fevrier(String uneAffectationF) {
		this.affectationF = uneAffectationF;
	}
	public Fevrier(String uneDateDebutF, String uneDateFinF, String uneAffectationF) {
		this.dateDebutF = uneDateDebutF;
		this.dateFinF = uneDateFinF;
		this.affectationF = uneAffectationF;
	}

	public String getDateDebutF() {
		return dateDebutF;
	}
	public void setDateDebutF(String uneDateDebutF) {
		this.dateDebutF = uneDateDebutF;
	}

	public String getDateFinF() {
		return dateFinF;
	}
	public void setDateFinF(String uneDateFinF) {
		this.dateFinF = uneDateFinF;
	}

	public String getAffectationF() {
		return affectationF;
	}
	public void setAffectationF(String uneAffectationF) {
		this.affectationF = uneAffectationF;
	}
	
}
