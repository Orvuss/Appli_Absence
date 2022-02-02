package Primaire;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Mois.Aout;
import Mois.Avril;
import Mois.Decembre;
import Mois.Fevrier;
import Mois.Janvier;
import Mois.Juillet;
import Mois.Juin;
import Mois.Mai;
import Mois.Mars;
import Mois.Mois;
import Mois.Novembre;
import Mois.Octobre;
import Mois.Septembre;
import Personnes.Personnes;
import Personnes.PersonnesProduction;

public class Modele {
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
	
	public static boolean AjouterAffectationJanvier(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO janvier VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Janvier> afficherAffectationJanvier(){
        Modele.connexion();
        ArrayList <Janvier> listeJanvier;
        listeJanvier = new ArrayList<Janvier>();
        try {
            rs = st.executeQuery("SELECT affectationJ FROM janvier");
            while (rs.next()) {
                String uneAffectationJ = rs.getString(1);
                listeJanvier.add(new Janvier(uneAffectationJ));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeJanvier;
    }
	
	public static ArrayList<Janvier> afficherDateDebutJanvier(){
        Modele.connexion();
        ArrayList <Janvier> listeDateDebutJanvier;
        listeDateDebutJanvier = new ArrayList<Janvier>();
        try {
            rs = st.executeQuery("SELECT * FROM janvier");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutJanvier.add(new Janvier(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutJanvier;
    }
	
	public static boolean suppressionAffectationJanvier(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM janvier WHERE dateDebutJ = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationFevrier(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO fevrier VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Fevrier> afficherAffectationFevrier(){
        Modele.connexion();
        ArrayList <Fevrier> listeFevrier;
        listeFevrier = new ArrayList<Fevrier>();
        try {
            rs = st.executeQuery("SELECT affectationF FROM fevrier");
            while (rs.next()) {
                String uneAffectationF = rs.getString(1);
                listeFevrier.add(new Fevrier(uneAffectationF));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeFevrier;
    }
	
	public static ArrayList<Fevrier> afficherDateDebutFevrier(){
        Modele.connexion();
        ArrayList <Fevrier> listeDateDebutFevrier;
        listeDateDebutFevrier = new ArrayList<Fevrier>();
        try {
            rs = st.executeQuery("SELECT * FROM fevrier");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutFevrier.add(new Fevrier(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutFevrier;
    }
	
	public static boolean suppressionAffectationFevrier(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM fevrier WHERE dateDebutF = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationMars(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO mars VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Mars> afficherAffectationMars(){
        Modele.connexion();
        ArrayList <Mars> listeMars;
        listeMars = new ArrayList<Mars>();
        try {
            rs = st.executeQuery("SELECT affectationM FROM mars");
            while (rs.next()) {
                String uneAffectationM = rs.getString(1);
                listeMars.add(new Mars(uneAffectationM));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeMars;
    }
	
	public static ArrayList<Mars> afficherDateDebutMars(){
        Modele.connexion();
        ArrayList <Mars> listeDateDebutMars;
        listeDateDebutMars = new ArrayList<Mars>();
        try {
            rs = st.executeQuery("SELECT * FROM mars");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutMars.add(new Mars(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutMars;
    }
	
	public static boolean suppressionAffectationMars(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM mars WHERE dateDebutM = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationAvril(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO avril VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Avril> afficherAffectationAvril(){
        Modele.connexion();
        ArrayList <Avril> listeAvril;
        listeAvril = new ArrayList<Avril>();
        try {
            rs = st.executeQuery("SELECT affectationA FROM avril");
            while (rs.next()) {
                String uneAffectationA = rs.getString(1);
                listeAvril.add(new Avril(uneAffectationA));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeAvril;
    }
	
	public static ArrayList<Avril> afficherDateDebutAvril(){
        Modele.connexion();
        ArrayList <Avril> listeDateDebutAvril;
        listeDateDebutAvril = new ArrayList<Avril>();
        try {
            rs = st.executeQuery("SELECT * FROM avril");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutAvril.add(new Avril(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutAvril;
    }
	
	public static boolean suppressionAffectationAvril(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM avril WHERE dateDebutA = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationMai(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO mai VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Mai> afficherAffectationMai(){
        Modele.connexion();
        ArrayList <Mai> listeMai;
        listeMai = new ArrayList<Mai>();
        try {
            rs = st.executeQuery("SELECT affectationMai FROM mai");
            while (rs.next()) {
                String uneAffectationM = rs.getString(1);
                listeMai.add(new Mai(uneAffectationM));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeMai;
    }
	
	public static ArrayList<Mai> afficherDateDebutMai(){
        Modele.connexion();
        ArrayList <Mai> listeDateDebutMai;
        listeDateDebutMai = new ArrayList<Mai>();
        try {
            rs = st.executeQuery("SELECT * FROM mai");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutMai.add(new Mai(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutMai;
    }
	
	public static boolean suppressionAffectationMai(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM mai WHERE dateDebutMai = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationJuin(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO juin VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Juin> afficherAffectationJuin(){
        Modele.connexion();
        ArrayList <Juin> listeJuin;
        listeJuin = new ArrayList<Juin>();
        try {
            rs = st.executeQuery("SELECT affectationJ FROM juin");
            while (rs.next()) {
                String uneAffectation = rs.getString(1);
                listeJuin.add(new Juin(uneAffectation));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeJuin;
    }
	
	public static ArrayList<Juin> afficherDateDebutJuin(){
        Modele.connexion();
        ArrayList <Juin> listeDateDebutJuin;
        listeDateDebutJuin = new ArrayList<Juin>();
        try {
            rs = st.executeQuery("SELECT * FROM juin");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutJuin.add(new Juin(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutJuin;
    }
	
	public static boolean suppressionAffectationJuin(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM juin WHERE dateDebutJ = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationJuillet(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO juillet VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Juillet> afficherAffectationJuillet(){
        Modele.connexion();
        ArrayList <Juillet> listeJuillet;
        listeJuillet = new ArrayList<Juillet>();
        try {
            rs = st.executeQuery("SELECT affectationJ FROM juillet");
            while (rs.next()) {
                String uneAffectation = rs.getString(1);
                listeJuillet.add(new Juillet(uneAffectation));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeJuillet;
    }
	
	public static ArrayList<Juillet> afficherDateDebutJuillet(){
        Modele.connexion();
        ArrayList <Juillet> listeDateDebutJuillet;
        listeDateDebutJuillet = new ArrayList<Juillet>();
        try {
            rs = st.executeQuery("SELECT * FROM juillet");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutJuillet.add(new Juillet(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutJuillet;
    }
	
	public static boolean suppressionAffectationJuillet(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM juillet WHERE dateDebutJ = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationAout(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO aout VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Aout> afficherAffectationAout(){
        Modele.connexion();
        ArrayList <Aout> listeAout;
        listeAout = new ArrayList<Aout>();
        try {
            rs = st.executeQuery("SELECT affectationA FROM aout");
            while (rs.next()) {
                String uneAffectation = rs.getString(1);
                listeAout.add(new Aout(uneAffectation));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeAout;
    }
	
	public static ArrayList<Aout> afficherDateDebutAout(){
        Modele.connexion();
        ArrayList <Aout> listeDateDebutAout;
        listeDateDebutAout = new ArrayList<Aout>();
        try {
            rs = st.executeQuery("SELECT * FROM aout");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutAout.add(new Aout(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutAout;
    }
	
	public static boolean suppressionAffectationAout(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM aout WHERE dateDebutA = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationSeptembre(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO septembre VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Septembre> afficherAffectationSeptembre(){
        Modele.connexion();
        ArrayList <Septembre> listeSeptembre;
        listeSeptembre = new ArrayList<Septembre>();
        try {
            rs = st.executeQuery("SELECT affectationS FROM septembre");
            while (rs.next()) {
                String uneAffectation = rs.getString(1);
                listeSeptembre.add(new Septembre(uneAffectation));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeSeptembre;
    }
	
	public static ArrayList<Septembre> afficherDateDebutSeptembre(){
        Modele.connexion();
        ArrayList <Septembre> listeDateDebutSeptembre;
        listeDateDebutSeptembre = new ArrayList<Septembre>();
        try {
            rs = st.executeQuery("SELECT * FROM septembre");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutSeptembre.add(new Septembre(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutSeptembre;
    }
	
	public static boolean suppressionAffectationSeptembre(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM septembre WHERE dateDebutS = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationOctobre(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO octobre VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Octobre> afficherAffectationOctobre(){
        Modele.connexion();
        ArrayList <Octobre> listeOctobre;
        listeOctobre = new ArrayList<Octobre>();
        try {
            rs = st.executeQuery("SELECT affectationO FROM octobre");
            while (rs.next()) {
                String uneAffectation = rs.getString(1);
                listeOctobre.add(new Octobre(uneAffectation));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeOctobre;
    }
	
	public static ArrayList<Octobre> afficherDateDebutOctobre(){
        Modele.connexion();
        ArrayList <Octobre> listeDateDebutOctobre;
        listeDateDebutOctobre = new ArrayList<Octobre>();
        try {
            rs = st.executeQuery("SELECT * FROM octobre");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutOctobre.add(new Octobre(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutOctobre;
    }
	
	public static boolean suppressionAffectationOctobre(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM octobre WHERE dateDebutO = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationNovembre(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO novembre VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Novembre> afficherAffectationNovembre(){
        Modele.connexion();
        ArrayList <Novembre> listeNovembre;
        listeNovembre = new ArrayList<Novembre>();
        try {
            rs = st.executeQuery("SELECT affectationN FROM novembre");
            while (rs.next()) {
                String uneAffectation = rs.getString(1);
                listeNovembre.add(new Novembre(uneAffectation));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeNovembre;
    }
	
	public static ArrayList<Novembre> afficherDateDebutNovembre(){
        Modele.connexion();
        ArrayList <Novembre> listeDateDebutNovembre;
        listeDateDebutNovembre = new ArrayList<Novembre>();
        try {
            rs = st.executeQuery("SELECT * FROM novembre");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutNovembre.add(new Novembre(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutNovembre;
    }
	
	public static boolean suppressionAffectationNovembre(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM novembre WHERE dateDebutN = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
	
	public static boolean AjouterAffectationDecembre(Date dateDebut, Date dateFin, String affectation, String autre) {
        boolean rep = true;
        int count;
        try {
        	statement = connexion.prepareStatement("INSERT INTO decembre VALUES (?,?,?,?);");
        	statement.setDate(1, dateDebut);
        	statement.setDate(2, dateFin);
        	statement.setString(3, affectation);
        	statement.setString(4, autre);
            count = statement.executeUpdate();
        }
        catch (SQLException erreur) {
            rep = false;
            System.out.println("Insertion échoué");
            erreur.printStackTrace();
        }
        return rep;
    }
	
	public static ArrayList<Decembre> afficherAffectationDecembre(){
        Modele.connexion();
        ArrayList <Decembre> listeDecembre;
        listeDecembre = new ArrayList<Decembre>();
        try {
            rs = st.executeQuery("SELECT affectationD FROM decembre");
            while (rs.next()) {
                String uneAffectation = rs.getString(1);
                listeDecembre.add(new Decembre(uneAffectation));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDecembre;
    }
	
	public static ArrayList<Decembre> afficherDateDebutDecembre(){
        Modele.connexion();
        ArrayList <Decembre> listeDateDebutDecembre;
        listeDateDebutDecembre = new ArrayList<Decembre>();
        try {
            rs = st.executeQuery("SELECT * FROM decembre");
            while (rs.next()) {
                String uneDateDebut = rs.getString(1);
                String uneDateFin = rs.getString(2);
                String uneAffectation = rs.getString(3);
                String uneAutreAbsence = rs.getString(4);
                listeDateDebutDecembre.add(new Decembre(uneDateDebut, uneDateFin, uneAffectation, uneAutreAbsence));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeDateDebutDecembre;
    }
	
	public static boolean suppressionAffectationDecembre(String dateDebut) {
        Modele.connexion();
        boolean rep; 
        int nbLogin;
        rep = false;
        nbLogin = 0;
        int count;
        try {
            statement = connexion.prepareStatement( "DELETE FROM decembre WHERE dateDebutD = ?");
            statement.setString(1, dateDebut);
            count = statement.executeUpdate();
            if (count == 1) {
                rep = true;
            }
        } catch (SQLException erreur) {
            System.out.println("Erreur de suppression");
        }
        return rep;
    }
}
