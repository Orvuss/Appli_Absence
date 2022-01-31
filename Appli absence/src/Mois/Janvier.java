package Mois;

public class Janvier {
	private String dateDebutJ;
	private String dateFinJ;
	private String affectationJ;
	private String autreJ;
	
	public Janvier(String uneAffectationJ) {
		this.affectationJ = uneAffectationJ;
	}
	public Janvier(String uneDateDebutJ, String uneDateFinJ, String uneAffectationJ, String uneAutreJ) {
		this.dateDebutJ = uneDateDebutJ;
		this.dateFinJ = uneDateFinJ;
		this.affectationJ = uneAffectationJ;
		this.autreJ = uneAutreJ;
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

	public String getAutreJ() {
		return autreJ;
	}
	public void setAutreJ(String uneAutreJ) {
		this.autreJ = uneAutreJ;
	}
	
	
}
