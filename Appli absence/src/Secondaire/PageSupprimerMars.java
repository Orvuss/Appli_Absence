package Secondaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;

import Mois.Janvier;
import Mois.Mars;
import Mois.Mois;
import Mois.PageJanvier;
import Primaire.Accueil;
import Primaire.Modele;
/**
 * Classe PageSupprimerMars
 * @author ldatchi
 *
 */
public class PageSupprimerMars extends JFrame implements ActionListener{
	/**
	 * Attributs priv?s de la classe PageSupprimerMars
	 */
	//Attributs priv?s
	//Panel
	private JPanel panelPageSupprimerMars;
	private JPanel panelMessage;
	private JPanel panelChamps;
	private JPanel panelBouton;

	//Label
	private JLabel lblMessage;
	private JLabel lblCommentaire;
	private JLabel lblDateDebut;
	private JLabel lblInsertion;
	
	//JComboBox
    private JComboBox<String> jcbDate;
	
	//JButton
	private JButton btnValider;
	private JButton btnQuitter;
	
	//Constructeur
	public PageSupprimerMars(ArrayList<Mars> listeDateDebutMars) {
		//Configuration
		/**
		 * Titre, localisation, taille etc.. indispensable au d?but de chaque page IHM
		 */
	    this.setTitle("Supprimer");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(320, 300);
	    this.setLocationRelativeTo(null);
	    this.setResizable(true);
	    
	    /**
	     * Instanciation de mes panels "panelPageSupprimerMars" et "panelMessage"
	     */
	    //Instanciation des panels
	    this.panelPageSupprimerMars = new JPanel();
	    this.panelMessage = new JPanel();
	    this.panelChamps = new JPanel();
	    this.panelBouton = new JPanel();

	    /**
	     * Mise en place des background des panels "panelPageSupprimerMars" et "panelMessage"
	     */
	    //Background des panels
	    this.panelPageSupprimerMars.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);
	    
	    /**
	     * Mise en place des dispositions des panels "panelPageSupprimerMars" et "panelMessage"
	     */
	    //Disposition des panels
	    this.panelPageSupprimerMars.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());
	    this.panelChamps.setLayout(new FlowLayout());
	    this.panelBouton.setLayout(new FlowLayout());	    

	    /**
	     * Instanciation du label "lblMessage"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("Veuillez choisir une date pour supprimer");
	    
	    //Instanciation et remplissage du JComboBox
	    this.jcbDate = new JComboBox<String>();
	    for (Mars monMars: listeDateDebutMars) {
	    	this.jcbDate.addItem(monMars.getDateDebutM());
	    }
		this.jcbDate.setMaximumSize(new Dimension(100,30));
	    
	    /**
	     * Mise en place de la couleur d'?criture du label "lblMessage"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);

	    this.lblCommentaire = new JLabel("Voir page commentaire si n?cessaire");
	    this.lblDateDebut = new JLabel("Date de debut : ");
	    this.lblInsertion = new JLabel();
	    this.lblInsertion.setText("");
	    
	   
	    /**
	     * Instanciation du bouton "btnQuitter" et ?coute du bouton
	     */
	    //Instanciation du bouton
	    this.btnValider = new JButton("Valider");
	    this.btnValider.addActionListener(this);
	    this.btnQuitter = new JButton("Quitter");
	    this.btnQuitter.addActionListener(this);
	    
	    /**
	     * Ajout des attributs ? mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelPageSupprimerMars.add(panelMessage, BorderLayout.NORTH);
	    this.panelPageSupprimerMars.add(panelChamps, BorderLayout.CENTER);
	    this.panelPageSupprimerMars.add(panelBouton, BorderLayout.SOUTH);
	    
	    this.panelMessage.add(lblMessage);
	    
	    this.panelChamps.add(lblCommentaire);
	    this.panelChamps.add(lblDateDebut);
	    this.panelChamps.add(jcbDate);
	    this.panelChamps.add(lblInsertion);

	    this.panelBouton.add(btnValider);
	    this.panelBouton.add(btnQuitter);
	    	    
	    //Toujours ? la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours ? la fin de la classe
  		 */
  		this.setAlwaysOnTop(true);
  		this.getContentPane().add(panelPageSupprimerMars);
  		this.setVisible(true);
	}
	
	public JPanel getMonPanelPageSupprimerMars() {
    	return panelPageSupprimerMars;
    }
	
	/**
	 * Action performed permettant la navigation entre les diff?rentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
		String dateDebut = jcbDate.getSelectedItem().toString();
		if(e.getSource() == btnValider) {
            
            if(Modele.suppressionAffectationMars(dateDebut)) {
                lblInsertion.setText("Suppression effectu?e."); 
            }
            else {
                lblInsertion.setText("Erreur dans la suppression."); 
            }
        }
		
		if(e.getSource() == btnQuitter) {
			this.dispose();
			System.out.println();
		}
	}
}
