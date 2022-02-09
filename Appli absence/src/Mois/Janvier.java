package Mois;

public class Janvier {
	private String dateDebutJ;
	private String dateFinJ;
	private String affectationJ;
	
	public Janvier(String uneAffectationJ) {
		this.affectationJ = uneAffectationJ;
	}
	public Janvier(String uneDateDebutJ, String uneDateFinJ, String uneAffectationJ) {
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
