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
	public static ArrayList<PersonnesProduction> affichagePersonnelCoordinationGlobaleProduction(){
        Modele.connexion();
        ArrayList <PersonnesProduction> listePersonnesProd;
        listePersonnesProd = new ArrayList<PersonnesProduction>();
        try {
            rs = st.executeQuery("SELECT Nom_p, Prénom_p FROM personnel WHERE Service_p = 'Coordination Globale Production'");
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
	
}
