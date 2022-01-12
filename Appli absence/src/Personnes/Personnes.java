package Personnes;

public class Personnes {
	
	private String nomPersonnel;
	private String prenomPersonnel;
	private String servicePersonnel;
	private String matriculePersonnel;
	
	
	
	public Personnes(String unNomPersonnel, String unPrenomPersonnel, String unServicePersonnel, String unMatriculePersonnel) {
		this.nomPersonnel = unNomPersonnel;
		this.prenomPersonnel = unPrenomPersonnel;
		this.servicePersonnel = unServicePersonnel;
		this.matriculePersonnel = unMatriculePersonnel;
	}



	public String getNomPersonnel() {
		return nomPersonnel;
	}
	public void setNomPersonnel(String unNomPersonnel) {
		this.nomPersonnel = unNomPersonnel;
	}
	
	public String getPrenomPersonnel() {
		return prenomPersonnel;
	}
	public void setPrenomPersonnel(String unPrenomPersonnel) {
		this.prenomPersonnel = unPrenomPersonnel;
	}
	
	public String getServicePersonnel() {
		return servicePersonnel;
	}
	public void setServicePersonnel(String unServicePersonnel) {
		this.servicePersonnel = unServicePersonnel;
	}
	
	public String getMatriculePersonnel() {
		return matriculePersonnel;
	}
	public void setMatriculePersonnel(String unMatriculePersonnel) {
		this.matriculePersonnel = unMatriculePersonnel;
	}
}
