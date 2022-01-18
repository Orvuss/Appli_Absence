package Secondaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Classe PageAjouter
 * @author ldatchi
 *
 */
public class PageAjouter extends JFrame implements ActionListener{
	/**
	 * Attributs privés de la classe PageAjouter
	 */
	//Attributs privés
	//Panel
	private JPanel panelPageAjouter;
	private JPanel panelMessage;
	private JPanel panelChamps;
	private JPanel panelBouton;

	//Label
	private JLabel lblMessage;
	
	//JButton
	private JButton btnQuitter;
	
	//Constructeur
	public PageAjouter() {
		//Configuration
		/**
		 * Titre, localisation, taille etc.. indispensable au début de chaque page IHM
		 */
	    this.setTitle("Ajouter");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(700, 500);
	    this.setLocationRelativeTo(null);
	    this.setResizable(true);
	    
	    /**
	     * Instanciation de mes panels "panelPageAjouter" et "panelMessage"
	     */
	    //Instanciation des panels
	    this.panelPageAjouter = new JPanel();
	    this.panelMessage = new JPanel();
	    this.panelChamps = new JPanel();
	    this.panelBouton = new JPanel();

	    /**
	     * Mise en place des background des panels "panelPageAjouter" et "panelMessage"
	     */
	    //Background des panels
	    this.panelPageAjouter.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);
	    
	    /**
	     * Mise en place des dispositions des panels "panelPageAjouter" et "panelMessage"
	     */
	    //Disposition des panels
	    this.panelPageAjouter.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());
	    this.panelChamps.setLayout(new FlowLayout());
	    this.panelBouton.setLayout(new FlowLayout());	    

	    /**
	     * Instanciation du label "lblMessage"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("Veuillez choisir une option pour ajouter");
	    
	    /**
	     * Mise en place de la couleur d'écriture du label "lblMessage"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);
	    
	    /**
	     * Instanciation du bouton "btnQuitter" et écoute du bouton
	     */
	    //Instanciation du bouton
	    this.btnQuitter = new JButton("Quitter");
	    this.btnQuitter.addActionListener(this);
	    
	    /**
	     * Ajout des attributs à mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelPageAjouter.add(panelMessage, BorderLayout.NORTH);
	    this.panelPageAjouter.add(panelChamps, BorderLayout.CENTER);
	    this.panelPageAjouter.add(panelBouton, BorderLayout.SOUTH);
	    
	    this.panelMessage.add(lblMessage);
	    
	    this.panelBouton.add(btnQuitter);
	    	    
	    //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
  		this.setAlwaysOnTop(true);
  		this.getContentPane().add(panelPageAjouter);
  		this.setVisible(true);
	}
	public JPanel getMonPanelPageAjouter() {
    	return panelPageAjouter;
    }
	
	/**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnQuitter) {
			this.dispose();
		}
	}
}
