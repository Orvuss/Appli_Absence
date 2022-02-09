package Mois;

public class Mai {
	private String dateDebutM;
	private String dateFinM;
	private String affectationM;
	
	public Mai(String uneAffectationM) {
		this.affectationM = uneAffectationM;
	}
	public Mai(String uneDateDebutM, String uneDateFinM, String uneAffectationM) {
		this.dateDebutM = uneDateDebutM;
		this.dateFinM = uneDateFinM;
		this.affectationM = uneAffectationM;
	}
	
	public String getDateDebutM() {
		return dateDebutM;
	}
	public void setDateDebutM(String uneDateDebutM) {
		this.dateDebutM = uneDateDebutM;
	}

	public String getDateFinM() {
		return dateFinM;
	}
	public void setDateFinM(String uneDateFinM) {
		this.dateFinM = uneDateFinM;
	}

	public String getAffectationM() {
		return affectationM;
	}
	public void setAffectationM(String uneAffectationM) {
		this.affectationM = uneAffectationM;
	}
}
