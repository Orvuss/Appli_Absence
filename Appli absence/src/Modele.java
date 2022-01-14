import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Personnes.Personnes;
import Personnes.PersonnesProduction;

public class Modele {
	//Pour git

	/**
	 * Attributs privés static de la classe Modele
	 */
	//Déclaration des variables
	private static Connection connexion;
	private static Statement st;
	private static ResultSet rs;
	private static PreparedStatement statement;
	
	//Méthode seConnecter
	/**
	 * Méthode pour se connecter à la BDD
	 */
	public static void connexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/absence?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "");
			st = connexion.createStatement();
		} catch (ClassNotFoundException erreur) {
			//Message d'erreur
			System.out.println("Le driver n'a pas pu être chargé");
			erreur.printStackTrace();
		} catch (SQLException erreur) {
			//Message d'erreur
			System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
			erreur.printStackTrace();
		}
	}
	
	//Méthode seDeconnecter
	/**
	 * Méthode pour se déconnecter de la BDD
	 */
	public static void deconnexion() {
		try {
			connexion.close();
		} catch(SQLException erreur) {
			//Message d'erreur
			System.out.println("La déconnexion n'a pas été effectuée.");
			erreur.printStackTrace();
		}
	}
	
	/**
	 * Méthode qui permet d'afficher le personnel dans le tableau
	 * @return
	 */
	public static ArrayList<Personnes> affichagePersonnel(){
        Modele.connexion();
        ArrayList <Personnes> listePersonnes;
        listePersonnes = new ArrayList<Personnes>();
        try {
            rs = st.executeQuery("SELECT * FROM personnel");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                String service_p = rs.getString(3);
                String matricule_p = rs.getString(4);
                listePersonnes.add(new Personnes(nom_p, prenom_p, service_p, matricule_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnes;
    }
	/**
	 * Méthode qui permet d'afficher le personnel du service production
	 * @return
	 */
	public static ArrayList<PersonnesProduction> affichagePersonnelProduction(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesProd;
        listePersonnesProd = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Production'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesProd.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesProd;
    }
	/**
	 * Méthode qui permet d'afficher le personnel du service coordination globale production
	 * @return
	 */
	public static ArrayList<PersonnesProduction> affichagePersonnelCoordinationGlobaleProduction(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesProd;
        listePersonnesProd = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Coordination Globale Production' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesProd.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesProd;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelExploitationServices(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesExplServ;
        listePersonnesExplServ = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Exploitation & Services' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesExplServ.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesExplServ;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelPilotage(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesPil;
        listePersonnesPil = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Pilotage' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesPil.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesPil;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelDbaMetro(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesDBA;
        listePersonnesDBA = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'DBA-Metrologie' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesDBA.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesDBA;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelEditiqueEtArch(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesEditiqueEtArch;
        listePersonnesEditiqueEtArch = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Editique et Archivage' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesEditiqueEtArch.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesEditiqueEtArch;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnel3points(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnes3pts;
        listePersonnes3pts = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = '....' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnes3pts.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnes3pts;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelServDesk(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesServDesk;
        listePersonnesServDesk = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Service Desk' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesServDesk.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesServDesk;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelChangMEP(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesChangMEP;
        listePersonnesChangMEP = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Changement, MEP' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesChangMEP.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesChangMEP;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelInte(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesInte;
        listePersonnesInte = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Integration - STE - GDF - EAR' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesInte.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesInte;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelInteMF(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesInteMF;
        listePersonnesInteMF = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Integration MF' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesInteMF.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesInteMF;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelInteOpen(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesInteOpen;
        listePersonnesInteOpen = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Integration Open' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesInteOpen.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesInteOpen;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelFlux(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesFlux;
        listePersonnesFlux = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Flux' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesFlux.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesFlux;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelSTE(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesSTE;
        listePersonnesSTE = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'STE' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesSTE.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesSTE;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelSecurite(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesSecurite;
        listePersonnesSecurite = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Securite' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesSecurite.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesSecurite;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelSECOP(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesSECOP;
        listePersonnesSECOP = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'SECOP' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesSECOP.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesSECOP;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelRSI(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesRSI;
        listePersonnesRSI = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'RSI' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesRSI.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesRSI;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelSOC(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesSOC;
        listePersonnesSOC = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'SOC' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesSOC.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesSOC;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelArchiInfraSys(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesArchiInfraSys;
        listePersonnesArchiInfraSys = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Architecture Infra & Systeme' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesArchiInfraSys.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesArchiInfraSys;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelArchiTech(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesArchiTech;
        listePersonnesArchiTech = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Architecture Technique' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesArchiTech.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesArchiTech;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelSysteme(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesSysteme;
        listePersonnesSysteme = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Systeme' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesSysteme.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesSysteme;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelRSB(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesRSB;
        listePersonnesRSB = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Reseaux, Serveurs, Bureautique' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesRSB.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesRSB;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelReseaux(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesReseaux;
        listePersonnesReseaux = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Reseaux' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesReseaux.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesReseaux;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelServBur(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesServBur;
        listePersonnesServBur = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Serveurs et Bureautique' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesServBur.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesServBur;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelWindows(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesWindows;
        listePersonnesWindows = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Windows' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesWindows.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesWindows;
    }
	public static ArrayList<PersonnesProduction> affichagePersonnelLinux(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesLinux;
        listePersonnesLinux = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Linux' LIMIT 1");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listePersonnesLinux.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listePersonnesLinux;
    }
}
