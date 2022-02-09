package Mois;

public class Decembre {
	private String dateDebutD;
	private String dateFinD;
	private String affectationD;
	
	public Decembre(String uneAffectationD) {
		this.affectationD = uneAffectationD;
	}
	public Decembre(String uneDateDebutD, String uneDateFinD, String uneAffectationD) {
		super();
		this.dateDebutD = uneDateDebutD;
		this.dateFinD = uneDateFinD;
		this.affectationD = uneAffectationD;
	}
	
	public String getDateDebutD() {
		return dateDebutD;
	}
	public void setDateDebutD(String uneDateDebutD) {
		this.dateDebutD = uneDateDebutD;
	}
	
	public String getDateFinD() {
		return dateFinD;
	}
	public void setDateFinD(String uneDateFinD) {
		this.dateFinD = uneDateFinD;
	}
	
	public String getAffectationD() {
		return affectationD;
	}
	public void setAffectationD(String uneAffectationD) {
		this.affectationD = uneAffectationD;
	}
}
