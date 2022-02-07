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
	//Beghin
	public static ArrayList<PersonnesProduction> affichageG09308(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09308;
        listeG09308 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09308'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09308.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09308;
    }
	//Delecroix
	public static ArrayList<PersonnesProduction> affichageG09086(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09086;
        listeG09086 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09086'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09086.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09086;
    }
	//Euraxiel
	public static ArrayList<PersonnesProduction> affichageE51300(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51300;
        listeE51300 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51300'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51300.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51300;
    }
	//Martin
	public static ArrayList<PersonnesProduction> affichageG01838(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG01838;
        listeG01838 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G01838'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG01838.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG01838;
    }
	//Cunin
	public static ArrayList<PersonnesProduction> affichageG09844(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09844;
        listeG09844 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09844'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09844.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09844;
    }
	//COULOMBEL
	public static ArrayList<PersonnesProduction> affichageG02486(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG02486;
        listeG02486 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G02486'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG02486.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG02486;
    }
	//FOREST
	public static ArrayList<PersonnesProduction> affichageG09304(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09304;
        listeG09304 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09304'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09304.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09304;
    }
	//INETUM CM
	public static ArrayList<PersonnesProduction> affichageE51349(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51349;
        listeE51349 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51349'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51349.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51349;
    }
	//INETUM PI
	public static ArrayList<PersonnesProduction> affichageE51408(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51408;
        listeE51408 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51408'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51408.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51408;
    }
	//BUI
	public static ArrayList<PersonnesProduction> affichageG09311(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09311;
        listeG09311 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09311'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09311.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09311;
    }
	//PASQUET
	public static ArrayList<PersonnesProduction> affichageG09513(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09513;
        listeG09513 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09513'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09513.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09513;
    }
	//BAHANI
	public static ArrayList<PersonnesProduction> affichageG02634(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG02634;
        listeG02634 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G02634'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG02634.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG02634;
    }
	//INETUM BM
	public static ArrayList<PersonnesProduction> affichageE51634(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51634;
        listeE51634 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51634'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51634.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51634;
    }
	//CARRU
	public static ArrayList<PersonnesProduction> affichageG09057(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09057;
        listeG09057 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09057'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09057.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09057;
    }
	//OHANA
	public static ArrayList<PersonnesProduction> affichageG02662(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG02662;
        listeG02662 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G02662'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG02662.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG02662;
    }
	//GLEMAIN
	public static ArrayList<PersonnesProduction> affichageG09305(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09305;
        listeG09305 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09305'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09305.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09305;
    }
	//INETUM OT
	public static ArrayList<PersonnesProduction> affichageE51122(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51122;
        listeE51122 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51122'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51122.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51122;
    }
	//INETUM EW
	public static ArrayList<PersonnesProduction> affichageE51713(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51713;
        listeE51713 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51713'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51713.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51713;
    }
	//THIERRY
	public static ArrayList<PersonnesProduction> affichageG09307(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09307;
        listeG09307 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09307'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09307.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09307;
    }
	//ABOJIAN
	public static ArrayList<PersonnesProduction> affichageG03087(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03087;
        listeG03087 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03087'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03087.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03087;
    }
	//INETUM SM
	public static ArrayList<PersonnesProduction> affichageE51679(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51679;
        listeE51679 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51679'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51679.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51679;
    }
	//RAMENE
	public static ArrayList<PersonnesProduction> affichageG00994(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG00994;
        listeG00994 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G00994'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG00994.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG00994;
    }
	//LEBLOND
	public static ArrayList<PersonnesProduction> affichageG01221(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG01221;
        listeG01221 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G01221'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG01221.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG01221;
    }
	//GUIGNEBERT
	public static ArrayList<PersonnesProduction> affichageG01304(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG01304;
        listeG01304 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G01304'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG01304.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG01304;
    }
	//FERTER
	public static ArrayList<PersonnesProduction> affichageG02428(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG02428;
        listeG02428 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G02428'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG02428.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG02428;
    }
	//DIDARET
	public static ArrayList<PersonnesProduction> affichageG09626(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09626;
        listeG09626 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09626'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09626.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09626;
    }
	//INETUM DA
	public static ArrayList<PersonnesProduction> affichageE51710(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51710;
        listeE51710 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51710'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51710.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51710;
    }
	//SAIDOU
	public static ArrayList<PersonnesProduction> affichageG03547(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03547;
        listeG03547 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03547'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03547.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03547;
    }
	//INETUM YB
	public static ArrayList<PersonnesProduction> affichageE51574(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51574;
        listeE51574 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51574'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51574.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51574;
    }
	//INETUM FB
	public static ArrayList<PersonnesProduction> affichageE51575(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51575;
        listeE51575 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51575'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51575.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51575;
    }
	//BOISSET
	public static ArrayList<PersonnesProduction> affichageG09566(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09566;
        listeG09566 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09566'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09566.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09566;
    }
	//INETUM CB
	public static ArrayList<PersonnesProduction> affichageE51126(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51126;
        listeE51126 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51126'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51126.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51126;
    }
	//DUCHAUSSOY
	public static ArrayList<PersonnesProduction> affichageG01646(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG01646;
        listeG01646 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G01646'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG01646.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG01646;
    }
	//ANOLIS
	public static ArrayList<PersonnesProduction> affichageE51369(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51369;
        listeE51369 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51369'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51369.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51369;
    }
	//INETUM TP
	public static ArrayList<PersonnesProduction> affichageE51660(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51660;
        listeE51660 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51660'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51660.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51660;
    }
	//FONTESSE
	public static ArrayList<PersonnesProduction> affichageB50424(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeB50424;
        listeB50424 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'B50424'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeB50424.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeB50424;
    }
	//GILLE
	public static ArrayList<PersonnesProduction> affichageG03713(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03713;
        listeG03713 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03713'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03713.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03713;
    }
	//HABACHOU
	public static ArrayList<PersonnesProduction> affichageG03546(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03546;
        listeG03546 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03546'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03546.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03546;
    }
	//ARDILIO
	public static ArrayList<PersonnesProduction> affichageG09108(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09108;
        listeG09108 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09108'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09108.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09108;
    }
	//BEYLIER
	public static ArrayList<PersonnesProduction> affichageG03973(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03973;
        listeG03973 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03973'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03973.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03973;
    }
	//NSIS
	public static ArrayList<PersonnesProduction> affichageE51427(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51427;
        listeE51427 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51427'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51427.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51427;
    }
	//CATTAINI
	public static ArrayList<PersonnesProduction> affichageG03459(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03459;
        listeG03459 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03459'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03459.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03459;
    }
	//BIGOT
	public static ArrayList<PersonnesProduction> affichageG03431(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03431;
        listeG03431 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03431'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03431.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03431;
    }
	//CLINKAST ZZ
	public static ArrayList<PersonnesProduction> affichageE51659(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51659;
        listeE51659 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51659'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51659.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51659;
    }
	//CLINKAST MA
	public static ArrayList<PersonnesProduction> affichageE51707(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51707;
        listeE51707 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51707'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51707.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51707;
    }
	//BUTEUX
	public static ArrayList<PersonnesProduction> affichageG09282(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09282;
        listeG09282 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09282'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09282.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09282;
    }
	//BAUDOIN
	public static ArrayList<PersonnesProduction> affichageG09262(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09262;
        listeG09262 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09262'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09262.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09262;
    }
	//JEAN
	public static ArrayList<PersonnesProduction> affichageG02763(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG02763;
        listeG02763 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G02763'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG02763.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG02763;
    }
	//HUMBERT
	public static ArrayList<PersonnesProduction> affichageG01984(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG01984;
        listeG01984 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G01984'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG01984.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG01984;
    }
	//MENARD
	public static ArrayList<PersonnesProduction> affichageG09265(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09265;
        listeG09265 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09265'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09265.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09265;
    }
	//RIEUX
	public static ArrayList<PersonnesProduction> affichageG09104(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09104;
        listeG09104 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09104'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09104.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09104;
    }
	//ROULLAND
	public static ArrayList<PersonnesProduction> affichageG09641(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09641;
        listeG09641 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09641'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09641.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09641;
    }
	//ADONYS
	public static ArrayList<PersonnesProduction> affichageE51424(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51424;
        listeE51424 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51424'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51424.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51424;
    }
	//LEROUX
	public static ArrayList<PersonnesProduction> affichageG02520(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG02520;
        listeG02520 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G02520'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG02520.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG02520;
    }
	//ERDINC
	public static ArrayList<PersonnesProduction> affichageG02539(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG02539;
        listeG02539 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G02539'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG02539.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG02539;
    }
	//MARCHAND
	public static ArrayList<PersonnesProduction> affichageG09735(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09735;
        listeG09735 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09735'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09735.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09735;
    }
	//KHY
	public static ArrayList<PersonnesProduction> affichageG03329(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03329;
        listeG03329 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03329'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03329.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03329;
    }
	//SCC
	public static ArrayList<PersonnesProduction> affichageE51438(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51438;
        listeE51438 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51438'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51438.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51438;
    }
	//Bouloc
	public static ArrayList<PersonnesProduction> affichageG03739(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG03739;
        listeG03739 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G03739'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG03739.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG03739;
    }
	//VAN DER CRUYSSEN
	public static ArrayList<PersonnesProduction> affichageG04030(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG04030;
        listeG04030 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G04030'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG04030.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG04030;
    }
	//HT TEAM
	public static ArrayList<PersonnesProduction> affichageE51507(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51507;
        listeE51507 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51507'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51507.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51507;
    }
	//CELAD RD
	public static ArrayList<PersonnesProduction> affichageE51570(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51570;
        listeE51570 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51570'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51570.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51570;
    }
	//CELAD LF
	public static ArrayList<PersonnesProduction> affichageE51627(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51627;
        listeE51627 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51627'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51627.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51627;
    }
	//CELAD ABA
	public static ArrayList<PersonnesProduction> affichageE51648(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51648;
        listeE51648 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51648'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51648.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51648;
    }
	//CELAD GK
	public static ArrayList<PersonnesProduction> affichageE51681(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51681;
        listeE51681 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51681'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51681.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51681;
    }
	//COESSI
	public static ArrayList<PersonnesProduction> affichageE51533(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51533;
        listeE51533 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51533'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51533.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51533;
    }
	//CELAD ABH
	public static ArrayList<PersonnesProduction> affichageE5704(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE5704;
        listeE5704 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E5704'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE5704.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE5704;
    }
	//CELAD HF
	public static ArrayList<PersonnesProduction> affichageE51700(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51700;
        listeE51700 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51700'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51700.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51700;
    }
	//METSYS
	public static ArrayList<PersonnesProduction> affichageE51705(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51705;
        listeE51705 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51705'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51705.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51705;
    }
	//OLIER
	public static ArrayList<PersonnesProduction> affichageG09258(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeG09258;
        listeG09258 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'G09258'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeG09258.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeG09258;
    }
	//MARLIERE
	public static ArrayList<PersonnesProduction> affichageB50423(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeB50423;
        listeB50423 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'B50423'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeB50423.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeB50423;
    }
	//ELANZ
	public static ArrayList<PersonnesProduction> affichageE51576(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51576;
        listeE51576 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51576'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51576.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51576;
    }
	//HR TEAM
	public static ArrayList<PersonnesProduction> affichageE51665(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listeE51665;
        listeE51665 = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Matricule_p = 'E51665'");
            while (rs.next()) {
                String nom_p = rs.getString(1);
                String prenom_p = rs.getString(2);
                listeE51665.add(new PersonnesProduction(nom_p, prenom_p));
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return listeE51665;
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
