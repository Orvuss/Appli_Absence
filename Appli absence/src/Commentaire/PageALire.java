package Commentaire;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Classe PageALire
 * @author ldatchi
 *
 */
public class PageALire extends JPanel implements ActionListener{

	/**
	 * Attributs privés de la classe PageALire
	 */
	//Attributs privés
	//Panel
	private JPanel panelPageALire;
	private JPanel panelMessage;
	private JPanel panelChamps;
	
	//Label
	private JLabel lblMessage;
	private JLabel lblALire;

	//Constructeur
	public PageALire() {	
	    /**
	     * Instanciation de mes panels "panelPageALire", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Instanciation des panels
	    this.panelPageALire = new JPanel();
	    this.panelMessage = new JPanel();
	    this.panelChamps = new JPanel();

	    /**
	     * Mise en place des background des panels "panelPageALire", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Background des panels
	    this.panelPageALire.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);

	    /**
	     * Mise en place des dispositions des panels "panelPageALire", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Disposition des panels
	    this.panelPageALire.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());
	    this.panelChamps.setLayout(new FlowLayout());

	    /**
	     * Instanciation des label "lblMessage", "lblNomCircuit", "lblTailleCircuit", "lblPaysCircuit" et "lblInsertion"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("À lire attentivement !");
	    this.lblMessage.setFont(new Font("Century Gothic", Font.BOLD, 15));
	    String texte = "<html><br><br><br><br><br><hr><p align='center'>Utiliser les raccourcis pour saisir les absences (c, cet, r, rc, rh, ...)</p><br>"
	    		+ "<p align='center'>Mettre un 2 après le raccourci pour présenter une 1/2 journée (c2, cet2, r2, rh2, rc2, ...)</p><br>"
	    		+ "<p align='center'>On peut cumuler les raccourcis uniquement dans le cas où le <span color='purple'>temps partiel</span> est une 1/2 journée</p><br>"
	    		+ "<p align='center'><span color='purple'><u>ctp</u></span> correspond à une 1/2 journée de congé + une 1/2 journée de temps partiel</p><br>"
	    		+ "<p align='center'><span color='purple'><u>rtp</u></span> correspond à une 1/2 journée de RTT + une 1/2 journée de temps partiel</p><br>"
	    		+ "<p align='center'>Les temps partiel sont mis à jour automatiquement par l'intermédiaire de la feuille 'Personnes'</p><br>"
	    		+ "<p align='center'>Seules les personnes habilitées peuvent modifier le tableau</p><hr></html>";
	    this.lblALire = new JLabel(texte);

	    /**
	     * Mise en place de la couleur d'écriture des label "lblMessage", "lblNomCircuit", "lblTailleCircuit" et "lblPaysCircuit"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);
	    
	    /**
	     * Ajout des attributs à mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelPageALire.add(panelMessage, BorderLayout.PAGE_START);
	    this.panelPageALire.add(panelChamps, BorderLayout.CENTER);
	    
	    this.panelMessage.add(lblMessage);

	    this.panelChamps.add(lblALire);

	    //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
  		this.setVisible(true);
	}
	
	public JPanel getMonPanelPageALire() {
    	return panelPageALire;
    }
	
	/**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
        
	}
}