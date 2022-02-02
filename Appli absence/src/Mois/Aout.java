package Mois;

public class Aout {
	private String dateDebutA;
	private String dateFinA;
	private String affectationA;
	private String autreA;
	
	public Aout(String uneAffectationA) {
		this.affectationA = uneAffectationA;
	}
	public Aout(String uneDateDebutA, String uneDateFinA, String uneAffectationA, String uneAutreA) {
		this.dateDebutA = uneDateDebutA;
		this.dateFinA = uneDateFinA;
		this.affectationA = uneAffectationA;
		this.autreA = uneAutreA;
	}

	public String getDateDebutA() {
		return dateDebutA;
	}
	public void setDateDebutA(String uneDateDebutA) {
		this.dateDebutA = uneDateDebutA;
	}
	
	public String getDateFinA() {
		return dateFinA;
	}
	public void setDateFinA(String uneDateFinA) {
		this.dateFinA = uneDateFinA;
	}
	
	public String getAffectationA() {
		return affectationA;
	}
	public void setAffectationA(String uneAffectationA) {
		this.affectationA = uneAffectationA;
	}

	public String getAutreA() {
		return autreA;
	}
	public void setAutreA(String uneAutreA) {
		this.autreA = uneAutreA;
	}
	
}
