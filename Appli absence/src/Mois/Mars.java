package Mois;

public class Mars {
	private String dateDebutM;
	private String dateFinM;
	private String affectationM;
	
	public Mars(String uneAffectationM) {
		this.affectationM = uneAffectationM;
	}
	public Mars(String uneDateDebutM, String uneDateFinM, String uneAffectationM) {
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
