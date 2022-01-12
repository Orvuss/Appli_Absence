package Personnes;

public class PersonnesProduction {
	//Pour git

	private String nomPersonnel;
	private String prenomPersonnel;
	
	public PersonnesProduction(String unNomPersonnel, String unPrenomPersonnel) {
		this.nomPersonnel = unNomPersonnel;
		this.prenomPersonnel = unPrenomPersonnel;
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
	
	
	public String toString() {
        String rep = "";
        if(this.nomPersonnel != null) {
        	rep += this.nomPersonnel + " ";
        }
        if(this.prenomPersonnel != null) {
        	rep += this.prenomPersonnel;
        }
        return rep;
    }
}
