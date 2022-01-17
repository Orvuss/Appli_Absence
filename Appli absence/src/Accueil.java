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
import Mois.PageAvril;
import Mois.PageFevrier;
import Mois.PageJanvier;
import Mois.PageMars;
import Personnes.PagePersonnes;
import Personnes.Personnes;
import Personnes.PersonnesProduction;
/**
 * Classe Accueil
 * @author ldatchi
 *
 */
public class Accueil extends JFrame implements ActionListener{
	//Pour git
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
	private JMenu jmMenuJanvier;
	private JMenu jmMenuFevrier;
	private JMenu jmMenuMars;
	private JMenu jmMenuAvril;




	//JMenuBar
	private JMenuBar jmbBarre;
	
	//JmenuItem
	private JMenuItem jmiAffectation;
	private JMenuItem jmiALire;
	private JMenuItem jmiJoursFeries;
	private JMenuItem jmiCongesScolaires;
	private JMenuItem jmiPersonnes;
	private JMenuItem jmiJanvier;
	private JMenuItem jmiFevrier;
	private JMenuItem jmiMars;
	private JMenuItem jmiAvril;

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
	    
	    this.jmMenuJanvier = new JMenu("Janvier");
	    this.jmMenuJanvier.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuFevrier = new JMenu("Février");
	    this.jmMenuFevrier.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuMars = new JMenu("Mars");
	    this.jmMenuMars.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuAvril = new JMenu("Avril");
	    this.jmMenuAvril.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    
	    this.jmiJanvier = new JMenuItem("Janvier");
	    this.jmiJanvier.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiJanvier.addActionListener(this);
	    this.jmiFevrier = new JMenuItem("Février");
	    this.jmiFevrier.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiFevrier.addActionListener(this);
	    this.jmiMars = new JMenuItem("Mars");
	    this.jmiMars.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiMars.addActionListener(this);
	    this.jmiAvril = new JMenuItem("Avril");
	    this.jmiAvril.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiAvril.addActionListener(this);
	    
	    
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
	    this.jmMenuJanvier.add(jmiJanvier);
	    this.jmMenuFevrier.add(jmiFevrier);
	    this.jmMenuMars.add(jmiMars);
	    this.jmMenuAvril.add(jmiAvril);


	    //Ajout du JMenu à la barre
	    this.jmbBarre.add(jmMenu1);
	    this.jmbBarre.add(jmMenu2);
	    this.jmbBarre.add(jmMenuJanvier);
	    this.jmbBarre.add(jmMenuFevrier);
	    this.jmbBarre.add(jmMenuMars);
	    this.jmbBarre.add(jmMenuAvril);


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
			
			ArrayList<PersonnesProduction> listePersonnesCoor;
			listePersonnesCoor = new ArrayList<PersonnesProduction>();
			listePersonnesCoor = Modele.affichagePersonnelCoordinationGlobaleProduction();
			
			ArrayList<PersonnesProduction> listePersonnesExplServ;
			listePersonnesExplServ = new ArrayList<PersonnesProduction>();
			listePersonnesExplServ = Modele.affichagePersonnelExploitationServices();
			
			ArrayList<PersonnesProduction> listePersonnesPil;
			listePersonnesPil = new ArrayList<PersonnesProduction>();
			listePersonnesPil = Modele.affichagePersonnelPilotage();
			
			ArrayList<PersonnesProduction> listePersonnesDBA;
			listePersonnesDBA = new ArrayList<PersonnesProduction>();
			listePersonnesDBA = Modele.affichagePersonnelDbaMetro();
			
			ArrayList<PersonnesProduction> listePersonnesEditiqueEtArch;
			listePersonnesEditiqueEtArch = new ArrayList<PersonnesProduction>();
			listePersonnesEditiqueEtArch = Modele.affichagePersonnelEditiqueEtArch();
			
			ArrayList<PersonnesProduction> listePersonnes3pts;
			listePersonnes3pts = new ArrayList<PersonnesProduction>();
			listePersonnes3pts = Modele.affichagePersonnel3points();
			
			ArrayList<PersonnesProduction> listePersonnesServDesk;
			listePersonnesServDesk = new ArrayList<PersonnesProduction>();
			listePersonnesServDesk = Modele.affichagePersonnelServDesk();
			
			ArrayList<PersonnesProduction> listePersonnesChangMEP;
			listePersonnesChangMEP = new ArrayList<PersonnesProduction>();
			listePersonnesChangMEP = Modele.affichagePersonnelChangMEP();
			
			ArrayList<PersonnesProduction> listePersonnesInte;
			listePersonnesInte = new ArrayList<PersonnesProduction>();
			listePersonnesInte = Modele.affichagePersonnelInte();
			
			ArrayList<PersonnesProduction> listePersonnesInteMF;
			listePersonnesInteMF = new ArrayList<PersonnesProduction>();
			listePersonnesInteMF = Modele.affichagePersonnelInteMF();
			
			ArrayList<PersonnesProduction> listePersonnesInteOpen;
			listePersonnesInteOpen = new ArrayList<PersonnesProduction>();
			listePersonnesInteOpen = Modele.affichagePersonnelInteOpen();
			
			ArrayList<PersonnesProduction> listePersonnesFlux;
			listePersonnesFlux = new ArrayList<PersonnesProduction>();
			listePersonnesFlux = Modele.affichagePersonnelFlux();
			
			ArrayList<PersonnesProduction> listePersonnesSTE;
			listePersonnesSTE = new ArrayList<PersonnesProduction>();
			listePersonnesSTE = Modele.affichagePersonnelSTE();
			
			ArrayList<PersonnesProduction> listePersonnesSecurite;
			listePersonnesSecurite = new ArrayList<PersonnesProduction>();
			listePersonnesSecurite = Modele.affichagePersonnelSecurite();
			
			ArrayList<PersonnesProduction> listePersonnesSECOP;
			listePersonnesSECOP = new ArrayList<PersonnesProduction>();
			listePersonnesSECOP = Modele.affichagePersonnelSECOP();
			
			ArrayList<PersonnesProduction> listePersonnesRSI;
			listePersonnesRSI = new ArrayList<PersonnesProduction>();
			listePersonnesRSI = Modele.affichagePersonnelRSI();
			
			ArrayList<PersonnesProduction> listePersonnesSOC;
			listePersonnesSOC = new ArrayList<PersonnesProduction>();
			listePersonnesSOC = Modele.affichagePersonnelSOC();
			
			ArrayList<PersonnesProduction> listePersonnesArchiInfraSys;
			listePersonnesArchiInfraSys = new ArrayList<PersonnesProduction>();
			listePersonnesArchiInfraSys = Modele.affichagePersonnelArchiInfraSys();
			
			ArrayList<PersonnesProduction> listePersonnesArchiTech;
			listePersonnesArchiTech = new ArrayList<PersonnesProduction>();
			listePersonnesArchiTech = Modele.affichagePersonnelArchiTech();
			
			ArrayList<PersonnesProduction> listePersonnesSysteme;
			listePersonnesSysteme = new ArrayList<PersonnesProduction>();
			listePersonnesSysteme = Modele.affichagePersonnelSysteme();
			
			ArrayList<PersonnesProduction> listePersonnesRSB;
			listePersonnesRSB = new ArrayList<PersonnesProduction>();
			listePersonnesRSB = Modele.affichagePersonnelRSB();
			
			ArrayList<PersonnesProduction> listePersonnesReseaux;
			listePersonnesReseaux = new ArrayList<PersonnesProduction>();
			listePersonnesReseaux = Modele.affichagePersonnelReseaux();
			
			ArrayList<PersonnesProduction> listePersonnesServBur;
			listePersonnesServBur = new ArrayList<PersonnesProduction>();
			listePersonnesServBur = Modele.affichagePersonnelServBur();
			
			ArrayList<PersonnesProduction> listePersonnesWindows;
			listePersonnesWindows = new ArrayList<PersonnesProduction>();
			listePersonnesWindows = Modele.affichagePersonnelWindows();
			
			ArrayList<PersonnesProduction> listePersonnesLinux;
			listePersonnesLinux = new ArrayList<PersonnesProduction>();
			listePersonnesLinux = Modele.affichagePersonnelLinux();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJanvier(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageJanvier());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiFevrier)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listePersonnesCoor;
			listePersonnesCoor = new ArrayList<PersonnesProduction>();
			listePersonnesCoor = Modele.affichagePersonnelCoordinationGlobaleProduction();
			
			ArrayList<PersonnesProduction> listePersonnesExplServ;
			listePersonnesExplServ = new ArrayList<PersonnesProduction>();
			listePersonnesExplServ = Modele.affichagePersonnelExploitationServices();
			
			ArrayList<PersonnesProduction> listePersonnesPil;
			listePersonnesPil = new ArrayList<PersonnesProduction>();
			listePersonnesPil = Modele.affichagePersonnelPilotage();
			
			ArrayList<PersonnesProduction> listePersonnesDBA;
			listePersonnesDBA = new ArrayList<PersonnesProduction>();
			listePersonnesDBA = Modele.affichagePersonnelDbaMetro();
			
			ArrayList<PersonnesProduction> listePersonnesEditiqueEtArch;
			listePersonnesEditiqueEtArch = new ArrayList<PersonnesProduction>();
			listePersonnesEditiqueEtArch = Modele.affichagePersonnelEditiqueEtArch();
			
			ArrayList<PersonnesProduction> listePersonnes3pts;
			listePersonnes3pts = new ArrayList<PersonnesProduction>();
			listePersonnes3pts = Modele.affichagePersonnel3points();
			
			ArrayList<PersonnesProduction> listePersonnesServDesk;
			listePersonnesServDesk = new ArrayList<PersonnesProduction>();
			listePersonnesServDesk = Modele.affichagePersonnelServDesk();
			
			ArrayList<PersonnesProduction> listePersonnesChangMEP;
			listePersonnesChangMEP = new ArrayList<PersonnesProduction>();
			listePersonnesChangMEP = Modele.affichagePersonnelChangMEP();
			
			ArrayList<PersonnesProduction> listePersonnesInte;
			listePersonnesInte = new ArrayList<PersonnesProduction>();
			listePersonnesInte = Modele.affichagePersonnelInte();
			
			ArrayList<PersonnesProduction> listePersonnesInteMF;
			listePersonnesInteMF = new ArrayList<PersonnesProduction>();
			listePersonnesInteMF = Modele.affichagePersonnelInteMF();
			
			ArrayList<PersonnesProduction> listePersonnesInteOpen;
			listePersonnesInteOpen = new ArrayList<PersonnesProduction>();
			listePersonnesInteOpen = Modele.affichagePersonnelInteOpen();
			
			ArrayList<PersonnesProduction> listePersonnesFlux;
			listePersonnesFlux = new ArrayList<PersonnesProduction>();
			listePersonnesFlux = Modele.affichagePersonnelFlux();
			
			ArrayList<PersonnesProduction> listePersonnesSTE;
			listePersonnesSTE = new ArrayList<PersonnesProduction>();
			listePersonnesSTE = Modele.affichagePersonnelSTE();
			
			ArrayList<PersonnesProduction> listePersonnesSecurite;
			listePersonnesSecurite = new ArrayList<PersonnesProduction>();
			listePersonnesSecurite = Modele.affichagePersonnelSecurite();
			
			ArrayList<PersonnesProduction> listePersonnesSECOP;
			listePersonnesSECOP = new ArrayList<PersonnesProduction>();
			listePersonnesSECOP = Modele.affichagePersonnelSECOP();
			
			ArrayList<PersonnesProduction> listePersonnesRSI;
			listePersonnesRSI = new ArrayList<PersonnesProduction>();
			listePersonnesRSI = Modele.affichagePersonnelRSI();
			
			ArrayList<PersonnesProduction> listePersonnesSOC;
			listePersonnesSOC = new ArrayList<PersonnesProduction>();
			listePersonnesSOC = Modele.affichagePersonnelSOC();
			
			ArrayList<PersonnesProduction> listePersonnesArchiInfraSys;
			listePersonnesArchiInfraSys = new ArrayList<PersonnesProduction>();
			listePersonnesArchiInfraSys = Modele.affichagePersonnelArchiInfraSys();
			
			ArrayList<PersonnesProduction> listePersonnesArchiTech;
			listePersonnesArchiTech = new ArrayList<PersonnesProduction>();
			listePersonnesArchiTech = Modele.affichagePersonnelArchiTech();
			
			ArrayList<PersonnesProduction> listePersonnesSysteme;
			listePersonnesSysteme = new ArrayList<PersonnesProduction>();
			listePersonnesSysteme = Modele.affichagePersonnelSysteme();
			
			ArrayList<PersonnesProduction> listePersonnesRSB;
			listePersonnesRSB = new ArrayList<PersonnesProduction>();
			listePersonnesRSB = Modele.affichagePersonnelRSB();
			
			ArrayList<PersonnesProduction> listePersonnesReseaux;
			listePersonnesReseaux = new ArrayList<PersonnesProduction>();
			listePersonnesReseaux = Modele.affichagePersonnelReseaux();
			
			ArrayList<PersonnesProduction> listePersonnesServBur;
			listePersonnesServBur = new ArrayList<PersonnesProduction>();
			listePersonnesServBur = Modele.affichagePersonnelServBur();
			
			ArrayList<PersonnesProduction> listePersonnesWindows;
			listePersonnesWindows = new ArrayList<PersonnesProduction>();
			listePersonnesWindows = Modele.affichagePersonnelWindows();
			
			ArrayList<PersonnesProduction> listePersonnesLinux;
			listePersonnesLinux = new ArrayList<PersonnesProduction>();
			listePersonnesLinux = Modele.affichagePersonnelLinux();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageFevrier(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageFevrier());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiMars)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listePersonnesCoor;
			listePersonnesCoor = new ArrayList<PersonnesProduction>();
			listePersonnesCoor = Modele.affichagePersonnelCoordinationGlobaleProduction();
			
			ArrayList<PersonnesProduction> listePersonnesExplServ;
			listePersonnesExplServ = new ArrayList<PersonnesProduction>();
			listePersonnesExplServ = Modele.affichagePersonnelExploitationServices();
			
			ArrayList<PersonnesProduction> listePersonnesPil;
			listePersonnesPil = new ArrayList<PersonnesProduction>();
			listePersonnesPil = Modele.affichagePersonnelPilotage();
			
			ArrayList<PersonnesProduction> listePersonnesDBA;
			listePersonnesDBA = new ArrayList<PersonnesProduction>();
			listePersonnesDBA = Modele.affichagePersonnelDbaMetro();
			
			ArrayList<PersonnesProduction> listePersonnesEditiqueEtArch;
			listePersonnesEditiqueEtArch = new ArrayList<PersonnesProduction>();
			listePersonnesEditiqueEtArch = Modele.affichagePersonnelEditiqueEtArch();
			
			ArrayList<PersonnesProduction> listePersonnes3pts;
			listePersonnes3pts = new ArrayList<PersonnesProduction>();
			listePersonnes3pts = Modele.affichagePersonnel3points();
			
			ArrayList<PersonnesProduction> listePersonnesServDesk;
			listePersonnesServDesk = new ArrayList<PersonnesProduction>();
			listePersonnesServDesk = Modele.affichagePersonnelServDesk();
			
			ArrayList<PersonnesProduction> listePersonnesChangMEP;
			listePersonnesChangMEP = new ArrayList<PersonnesProduction>();
			listePersonnesChangMEP = Modele.affichagePersonnelChangMEP();
			
			ArrayList<PersonnesProduction> listePersonnesInte;
			listePersonnesInte = new ArrayList<PersonnesProduction>();
			listePersonnesInte = Modele.affichagePersonnelInte();
			
			ArrayList<PersonnesProduction> listePersonnesInteMF;
			listePersonnesInteMF = new ArrayList<PersonnesProduction>();
			listePersonnesInteMF = Modele.affichagePersonnelInteMF();
			
			ArrayList<PersonnesProduction> listePersonnesInteOpen;
			listePersonnesInteOpen = new ArrayList<PersonnesProduction>();
			listePersonnesInteOpen = Modele.affichagePersonnelInteOpen();
			
			ArrayList<PersonnesProduction> listePersonnesFlux;
			listePersonnesFlux = new ArrayList<PersonnesProduction>();
			listePersonnesFlux = Modele.affichagePersonnelFlux();
			
			ArrayList<PersonnesProduction> listePersonnesSTE;
			listePersonnesSTE = new ArrayList<PersonnesProduction>();
			listePersonnesSTE = Modele.affichagePersonnelSTE();
			
			ArrayList<PersonnesProduction> listePersonnesSecurite;
			listePersonnesSecurite = new ArrayList<PersonnesProduction>();
			listePersonnesSecurite = Modele.affichagePersonnelSecurite();
			
			ArrayList<PersonnesProduction> listePersonnesSECOP;
			listePersonnesSECOP = new ArrayList<PersonnesProduction>();
			listePersonnesSECOP = Modele.affichagePersonnelSECOP();
			
			ArrayList<PersonnesProduction> listePersonnesRSI;
			listePersonnesRSI = new ArrayList<PersonnesProduction>();
			listePersonnesRSI = Modele.affichagePersonnelRSI();
			
			ArrayList<PersonnesProduction> listePersonnesSOC;
			listePersonnesSOC = new ArrayList<PersonnesProduction>();
			listePersonnesSOC = Modele.affichagePersonnelSOC();
			
			ArrayList<PersonnesProduction> listePersonnesArchiInfraSys;
			listePersonnesArchiInfraSys = new ArrayList<PersonnesProduction>();
			listePersonnesArchiInfraSys = Modele.affichagePersonnelArchiInfraSys();
			
			ArrayList<PersonnesProduction> listePersonnesArchiTech;
			listePersonnesArchiTech = new ArrayList<PersonnesProduction>();
			listePersonnesArchiTech = Modele.affichagePersonnelArchiTech();
			
			ArrayList<PersonnesProduction> listePersonnesSysteme;
			listePersonnesSysteme = new ArrayList<PersonnesProduction>();
			listePersonnesSysteme = Modele.affichagePersonnelSysteme();
			
			ArrayList<PersonnesProduction> listePersonnesRSB;
			listePersonnesRSB = new ArrayList<PersonnesProduction>();
			listePersonnesRSB = Modele.affichagePersonnelRSB();
			
			ArrayList<PersonnesProduction> listePersonnesReseaux;
			listePersonnesReseaux = new ArrayList<PersonnesProduction>();
			listePersonnesReseaux = Modele.affichagePersonnelReseaux();
			
			ArrayList<PersonnesProduction> listePersonnesServBur;
			listePersonnesServBur = new ArrayList<PersonnesProduction>();
			listePersonnesServBur = Modele.affichagePersonnelServBur();
			
			ArrayList<PersonnesProduction> listePersonnesWindows;
			listePersonnesWindows = new ArrayList<PersonnesProduction>();
			listePersonnesWindows = Modele.affichagePersonnelWindows();
			
			ArrayList<PersonnesProduction> listePersonnesLinux;
			listePersonnesLinux = new ArrayList<PersonnesProduction>();
			listePersonnesLinux = Modele.affichagePersonnelLinux();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageMars(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageMars());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiAvril)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listePersonnesCoor;
			listePersonnesCoor = new ArrayList<PersonnesProduction>();
			listePersonnesCoor = Modele.affichagePersonnelCoordinationGlobaleProduction();
			
			ArrayList<PersonnesProduction> listePersonnesExplServ;
			listePersonnesExplServ = new ArrayList<PersonnesProduction>();
			listePersonnesExplServ = Modele.affichagePersonnelExploitationServices();
			
			ArrayList<PersonnesProduction> listePersonnesPil;
			listePersonnesPil = new ArrayList<PersonnesProduction>();
			listePersonnesPil = Modele.affichagePersonnelPilotage();
			
			ArrayList<PersonnesProduction> listePersonnesDBA;
			listePersonnesDBA = new ArrayList<PersonnesProduction>();
			listePersonnesDBA = Modele.affichagePersonnelDbaMetro();
			
			ArrayList<PersonnesProduction> listePersonnesEditiqueEtArch;
			listePersonnesEditiqueEtArch = new ArrayList<PersonnesProduction>();
			listePersonnesEditiqueEtArch = Modele.affichagePersonnelEditiqueEtArch();
			
			ArrayList<PersonnesProduction> listePersonnes3pts;
			listePersonnes3pts = new ArrayList<PersonnesProduction>();
			listePersonnes3pts = Modele.affichagePersonnel3points();
			
			ArrayList<PersonnesProduction> listePersonnesServDesk;
			listePersonnesServDesk = new ArrayList<PersonnesProduction>();
			listePersonnesServDesk = Modele.affichagePersonnelServDesk();
			
			ArrayList<PersonnesProduction> listePersonnesChangMEP;
			listePersonnesChangMEP = new ArrayList<PersonnesProduction>();
			listePersonnesChangMEP = Modele.affichagePersonnelChangMEP();
			
			ArrayList<PersonnesProduction> listePersonnesInte;
			listePersonnesInte = new ArrayList<PersonnesProduction>();
			listePersonnesInte = Modele.affichagePersonnelInte();
			
			ArrayList<PersonnesProduction> listePersonnesInteMF;
			listePersonnesInteMF = new ArrayList<PersonnesProduction>();
			listePersonnesInteMF = Modele.affichagePersonnelInteMF();
			
			ArrayList<PersonnesProduction> listePersonnesInteOpen;
			listePersonnesInteOpen = new ArrayList<PersonnesProduction>();
			listePersonnesInteOpen = Modele.affichagePersonnelInteOpen();
			
			ArrayList<PersonnesProduction> listePersonnesFlux;
			listePersonnesFlux = new ArrayList<PersonnesProduction>();
			listePersonnesFlux = Modele.affichagePersonnelFlux();
			
			ArrayList<PersonnesProduction> listePersonnesSTE;
			listePersonnesSTE = new ArrayList<PersonnesProduction>();
			listePersonnesSTE = Modele.affichagePersonnelSTE();
			
			ArrayList<PersonnesProduction> listePersonnesSecurite;
			listePersonnesSecurite = new ArrayList<PersonnesProduction>();
			listePersonnesSecurite = Modele.affichagePersonnelSecurite();
			
			ArrayList<PersonnesProduction> listePersonnesSECOP;
			listePersonnesSECOP = new ArrayList<PersonnesProduction>();
			listePersonnesSECOP = Modele.affichagePersonnelSECOP();
			
			ArrayList<PersonnesProduction> listePersonnesRSI;
			listePersonnesRSI = new ArrayList<PersonnesProduction>();
			listePersonnesRSI = Modele.affichagePersonnelRSI();
			
			ArrayList<PersonnesProduction> listePersonnesSOC;
			listePersonnesSOC = new ArrayList<PersonnesProduction>();
			listePersonnesSOC = Modele.affichagePersonnelSOC();
			
			ArrayList<PersonnesProduction> listePersonnesArchiInfraSys;
			listePersonnesArchiInfraSys = new ArrayList<PersonnesProduction>();
			listePersonnesArchiInfraSys = Modele.affichagePersonnelArchiInfraSys();
			
			ArrayList<PersonnesProduction> listePersonnesArchiTech;
			listePersonnesArchiTech = new ArrayList<PersonnesProduction>();
			listePersonnesArchiTech = Modele.affichagePersonnelArchiTech();
			
			ArrayList<PersonnesProduction> listePersonnesSysteme;
			listePersonnesSysteme = new ArrayList<PersonnesProduction>();
			listePersonnesSysteme = Modele.affichagePersonnelSysteme();
			
			ArrayList<PersonnesProduction> listePersonnesRSB;
			listePersonnesRSB = new ArrayList<PersonnesProduction>();
			listePersonnesRSB = Modele.affichagePersonnelRSB();
			
			ArrayList<PersonnesProduction> listePersonnesReseaux;
			listePersonnesReseaux = new ArrayList<PersonnesProduction>();
			listePersonnesReseaux = Modele.affichagePersonnelReseaux();
			
			ArrayList<PersonnesProduction> listePersonnesServBur;
			listePersonnesServBur = new ArrayList<PersonnesProduction>();
			listePersonnesServBur = Modele.affichagePersonnelServBur();
			
			ArrayList<PersonnesProduction> listePersonnesWindows;
			listePersonnesWindows = new ArrayList<PersonnesProduction>();
			listePersonnesWindows = Modele.affichagePersonnelWindows();
			
			ArrayList<PersonnesProduction> listePersonnesLinux;
			listePersonnesLinux = new ArrayList<PersonnesProduction>();
			listePersonnesLinux = Modele.affichagePersonnelLinux();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageAvril(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageAvril());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource() == jmiQuitter) {
			this.dispose();
		}
	}

}
