import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Commentaire.PageALire;
import Commentaire.PageAffectation;
import Commentaire.PageCongesScolaires;
import Commentaire.PageJoursFeries;
import Janvier.PageJanvier;
import Personnes.PagePersonnes;
import Personnes.Personnes;
import Personnes.PersonnesProduction;
/**
 * Classe Accueil
 * @author ldatchi
 *
 */
public class Accueil extends JFrame implements ActionListener{

	/**
	 * Attributs privés de la classe Accueil
	 */
	//Attributs privés
	//Panel
	private JPanel panelAccueil;
	private JPanel panelMessage;
	
	//Jmenu
	private JMenu jmMenu1;
	private JMenu jmMenu2;
	private JMenu jmMenu3;

	//JMenuBar
	private JMenuBar jmbBarre;
	
	//JmenuItem
	private JMenuItem jmiAffectation;
	private JMenuItem jmiALire;
	private JMenuItem jmiJoursFeries;
	private JMenuItem jmiCongesScolaires;
	private JMenuItem jmiPersonnes;
	private JMenuItem jmiJanvier;
	private JMenuItem jmiQuitter;
	
	//Label
	private JLabel lblMessage;
	
	//Constructeur
	public Accueil() {
		//Configuration
		/**
		 * Titre, localisation, taille etc.. indispensable au début de chaque page IHM
		 */
	    this.setTitle("Accueil");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize((int)getToolkit().getScreenSize().getWidth(), ((int)getToolkit().getScreenSize().getHeight() - 40));
	    this.setLocationRelativeTo(null);
	    this.setResizable(true);
	    
	    /**
	     * Instanciation de mes panels "panelAccueil" et "panelMessage"
	     */
	    //Instanciation des panels
	    this.panelAccueil = new JPanel();
	    this.panelMessage = new JPanel();

	    /**
	     * Mise en place des background des panels "panelAccueil" et "panelMessage"
	     */
	    //Background des panels
	    this.panelAccueil.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);

	    /**
	     * Mise en place des dispositions des panels "panelAccueil" et "panelMessage"
	     */
	    //Disposition des panels
	    this.panelAccueil.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());

	    /**
	     * Instanciation du tableau avec les options de réservation
	     */
	    //Instanciation 
	    this.jmMenu1 = new JMenu("Commentaire");
	    this.jmMenu1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    //Instanciation JMenuBar
	    this.jmbBarre = new JMenuBar();
	    //Instanciation des éléments JMenuItem
	    this.jmiAffectation = new JMenuItem("Affectation");
	    this.jmiAffectation.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiAffectation.addActionListener(this);
	    this.jmiALire = new JMenuItem("À lire");
	    this.jmiALire.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiALire.addActionListener(this);
	    this.jmiJoursFeries = new JMenuItem("Jours fériés");
	    this.jmiJoursFeries.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiJoursFeries.addActionListener(this);
	    this.jmiCongesScolaires = new JMenuItem("Congés scolaires");
	    this.jmiCongesScolaires.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiCongesScolaires.addActionListener(this);
	    this.jmiQuitter = new JMenuItem("Quitter");
	    this.jmiQuitter.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiQuitter.addActionListener(this);
	    
	    this.jmMenu2 = new JMenu("Personnes");
	    this.jmMenu2.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    
	    this.jmiPersonnes = new JMenuItem("Affichage personnes");
	    this.jmiPersonnes.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiPersonnes.addActionListener(this);
	    
	    this.jmMenu3 = new JMenu("Janvier");
	    this.jmMenu3.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    
	    this.jmiJanvier = new JMenuItem("Janvier");
	    this.jmiJanvier.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiJanvier.addActionListener(this);
	    /**
	     * Ajout des boutons au menu
	     */
	    //Ajout des boutons au menu
	    this.jmMenu1.add(jmiAffectation);
	    this.jmMenu1.add(jmiALire);
	    this.jmMenu1.add(jmiJoursFeries);
	    this.jmMenu1.add(jmiCongesScolaires);
	    this.jmMenu1.add(jmiQuitter);
	    this.jmMenu2.add(jmiPersonnes);
	    this.jmMenu3.add(jmiJanvier);
	    //Ajout du JMenu à la barre
	    this.jmbBarre.add(jmMenu1);
	    this.jmbBarre.add(jmMenu2);
	    this.jmbBarre.add(jmMenu3);
	    this.setJMenuBar(jmbBarre);
	    
	    /**
	     * Instanciation du label "lblMessage"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("Veuillez choisir une option.");
	    
	    /**
	     * Mise en place de la couleur d'écriture du label "lblMessage"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);

	    /**
	     * Ajout des attributs à mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelAccueil.add(panelMessage, BorderLayout.PAGE_START);

	    this.panelMessage.add(lblMessage);
	    
	    //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
  		this.setAlwaysOnTop(true);
  		this.getContentPane().add(panelAccueil);
  		this.setVisible(true);
	}
	
	public JPanel getMonPanelAccueil() {
    	return panelAccueil;
    }
	
	/**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(jmiAffectation)) {
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageAffectation().getMonPanelPageAffectation());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiALire)) {
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageALire().getMonPanelPageALire());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiJoursFeries)) {
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJoursFeries().getMonPanelPageJoursFeries());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiCongesScolaires)) {
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageCongesScolaires().getMonPanelPageCongesScolaires());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiPersonnes)) {
			ArrayList<Personnes> listePersonnes;
			listePersonnes = new ArrayList<Personnes>();
			listePersonnes = Modele.affichagePersonnel();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PagePersonnes(listePersonnes).getMonPanelPagePersonnes());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiJanvier)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			ArrayList<PersonnesProduction> listePersonnesProdCoor;
			listePersonnesProdCoor = new ArrayList<PersonnesProduction>();
			listePersonnesProdCoor = Modele.affichagePersonnelCoordinationGlobaleProduction();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJanvier(listePersonnesProd, listePersonnesProdCoor).getMonPanelPageJanvier());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource() == jmiQuitter) {
			this.dispose();
		}
	}


}
