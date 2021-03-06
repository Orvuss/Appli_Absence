package Mois;

public class Septembre {
	private String dateDebutS;
	private String dateFinS;
	private String affectationS;
	
	public Septembre(String uneAffectationS) {
		this.affectationS = uneAffectationS;
	}
	public Septembre(String uneDateDebutS, String uneDateFinS, String uneAffectationS) {
		this.dateDebutS = uneDateDebutS;
		this.dateFinS = uneDateFinS;
		this.affectationS = uneAffectationS;
	}

	public String getDateDebutS() {
		return dateDebutS;
	}
	public void setDateDebutS(String uneDateDebutS) {
		this.dateDebutS = uneDateDebutS;
	}

	public String getDateFinS() {
		return dateFinS;
	}
	public void setDateFinS(String uneDateFinS) {
		this.dateFinS = uneDateFinS;
	}

	public String getAffectationS() {
		return affectationS;
	}
	public void setAffectationS(String uneAffectationS) {
		this.affectationS = uneAffectationS;
	}
}
