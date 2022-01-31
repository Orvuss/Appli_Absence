package Primaire;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Main {
	public static void main(String[] args) {
		Modele.connexion();
		Accueil monAccueil = new Accueil();
		Modele.deconnexion();
	}
}