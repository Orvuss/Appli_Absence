package Mois;

public class Octobre {
	private String dateDebutO;
	private String dateFinO;
	private String affectationO;
	
	public Octobre(String uneAffectationO) {
		this.affectationO = uneAffectationO;
	}
	public Octobre(String uneDateDebutO, String uneDateFinO, String uneAffectationO) {
		this.dateDebutO = uneDateDebutO;
		this.dateFinO = uneDateFinO;
		this.affectationO = uneAffectationO;
	}
	
	public String getDateDebutO() {
		return dateDebutO;
	}
	public void setDateDebutO(String uneDateDebutO) {
		this.dateDebutO = uneDateDebutO;
	}
	
	public String getDateFinO() {
		return dateFinO;
	}
	public void setDateFinO(String uneDateFinO) {
		this.dateFinO = uneDateFinO;
	}
	
	public String getAffectationO() {
		return affectationO;
	}
	public void setAffectationO(String uneAffectationO) {
		this.affectationO = uneAffectationO;
	}	
}
