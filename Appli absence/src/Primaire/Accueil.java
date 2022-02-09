package Primaire;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
import Mois.PageAout;
import Mois.PageAvril;
import Mois.PageDecembre;
import Mois.PageFevrier;
import Mois.PageJanvier;
import Mois.PageJuillet;
import Mois.PageJuin;
import Mois.PageMai;
import Mois.PageMars;
import Mois.PageNovembre;
import Mois.PageOctobre;
import Mois.PageSeptembre;
import Mois.Septembre;
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
	private JMenu jmMenuCommentaire;
	private JMenu jmMenuPersonnes;
	private JMenu jmMenuJanvier;
	private JMenu jmMenuFevrier;
	private JMenu jmMenuMars;
	private JMenu jmMenuAvril;
	private JMenu jmMenuMai;
	private JMenu jmMenuJuin;
	private JMenu jmMenuJuillet;
	private JMenu jmMenuAout;
	private JMenu jmMenuSeptembre;
	private JMenu jmMenuOctobre;
	private JMenu jmMenuNovembre;
	private JMenu jmMenuDecembre;

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
	private JMenuItem jmiMai;
	private JMenuItem jmiJuin;
	private JMenuItem jmiJuillet;
	private JMenuItem jmiAout;
	private JMenuItem jmiSeptembre;
	private JMenuItem jmiOctobre;
	private JMenuItem jmiNovembre;
	private JMenuItem jmiDecembre;
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
	    this.jmMenuCommentaire = new JMenu("Commentaires");
	    this.jmMenuCommentaire.setFont(new Font("Century Gothic", Font.PLAIN, 14));
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
	    
	    this.jmMenuPersonnes = new JMenu("Personnes");
	    this.jmMenuPersonnes.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    
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
	    this.jmMenuMai = new JMenu("Mai");
	    this.jmMenuMai.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuJuin = new JMenu("Juin");
	    this.jmMenuJuin.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuJuillet = new JMenu("Juillet");
	    this.jmMenuJuillet.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuAout = new JMenu("Août");
	    this.jmMenuAout.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuSeptembre = new JMenu("Septembre");
	    this.jmMenuSeptembre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuOctobre = new JMenu("Octobre");
	    this.jmMenuOctobre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuNovembre = new JMenu("Novembre");
	    this.jmMenuNovembre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuDecembre = new JMenu("Décembre");
	    this.jmMenuDecembre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    
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
	    this.jmiMai = new JMenuItem("Mai");
	    this.jmiMai.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiMai.addActionListener(this);
	    this.jmiJuin = new JMenuItem("Juin");
	    this.jmiJuin.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiJuin.addActionListener(this);
	    this.jmiJuillet = new JMenuItem("Juillet");
	    this.jmiJuillet.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiJuillet.addActionListener(this);
	    this.jmiAout = new JMenuItem("Août");
	    this.jmiAout.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiAout.addActionListener(this);
	    this.jmiSeptembre = new JMenuItem("Septembre");
	    this.jmiSeptembre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiSeptembre.addActionListener(this);
	    this.jmiOctobre = new JMenuItem("Octobre");
	    this.jmiOctobre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiOctobre.addActionListener(this);
	    this.jmiNovembre = new JMenuItem("Novembre");
	    this.jmiNovembre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiNovembre.addActionListener(this);
	    this.jmiDecembre = new JMenuItem("Décembre");
	    this.jmiDecembre.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiDecembre.addActionListener(this);
	    
	    /**
	     * Ajout des boutons au menu
	     */
	    //Ajout des boutons au menu
	    this.jmMenuCommentaire.add(jmiAffectation);
	    this.jmMenuCommentaire.add(jmiALire);
	    this.jmMenuCommentaire.add(jmiJoursFeries);
	    this.jmMenuCommentaire.add(jmiCongesScolaires);
	    this.jmMenuCommentaire.add(jmiQuitter);
	    this.jmMenuPersonnes.add(jmiPersonnes);
	    this.jmMenuJanvier.add(jmiJanvier);
	    this.jmMenuFevrier.add(jmiFevrier);
	    this.jmMenuMars.add(jmiMars);
	    this.jmMenuAvril.add(jmiAvril);
	    this.jmMenuMai.add(jmiMai);
	    this.jmMenuJuin.add(jmiJuin);
	    this.jmMenuJuillet.add(jmiJuillet);
	    this.jmMenuAout.add(jmiAout);
	    this.jmMenuSeptembre.add(jmiSeptembre);
	    this.jmMenuOctobre.add(jmiOctobre);
	    this.jmMenuNovembre.add(jmiNovembre);
	    this.jmMenuDecembre.add(jmiDecembre);

	    //Ajout du JMenu à la barre
	    this.jmbBarre.add(jmMenuCommentaire);
	    this.jmbBarre.add(jmMenuPersonnes);
	    this.jmbBarre.add(jmMenuJanvier);
	    this.jmbBarre.add(jmMenuFevrier);
	    this.jmbBarre.add(jmMenuMars);
	    this.jmbBarre.add(jmMenuAvril);
	    this.jmbBarre.add(jmMenuMai);
	    this.jmbBarre.add(jmMenuJuin);
	    this.jmbBarre.add(jmMenuJuillet);
	    this.jmbBarre.add(jmMenuAout);
	    this.jmbBarre.add(jmMenuSeptembre);
	    this.jmbBarre.add(jmMenuOctobre);
	    this.jmbBarre.add(jmMenuNovembre);
	    this.jmbBarre.add(jmMenuDecembre);

	    this.setJMenuBar(jmbBarre);
	    
	    /**
	     * Instanciation du label "lblMessage"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("Veuillez choisir une catégorie.");
	    
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
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Janvier> listeJanvier;
			listeJanvier = new ArrayList<Janvier>();
			listeJanvier = Modele.afficherAffectationJanvier();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();
			
			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();

			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJanvier(listeE51665 ,listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeJanvier, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageJanvier());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiFevrier)) {
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Fevrier> listeFevrier;
			listeFevrier = new ArrayList<Fevrier>();
			listeFevrier = Modele.afficherAffectationFevrier();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();
			
			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();

			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageFevrier(listeE51665 ,listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeFevrier, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageFevrier());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiMars)) {
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Mars> listeMars;
			listeMars = new ArrayList<Mars>();
			listeMars = Modele.afficherAffectationMars();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();
			
			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();

			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageMars(listeE51665 ,listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeMars, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageMars());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiAvril)) {
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Avril> listeAvril;
			listeAvril = new ArrayList<Avril>();
			listeAvril = Modele.afficherAffectationAvril();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();
			
			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();

			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageAvril(listeE51665 ,listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeAvril, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageAvril());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiMai)) {
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Mai> listeMai;
			listeMai = new ArrayList<Mai>();
			listeMai = Modele.afficherAffectationMai();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();
			
			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();

			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageMai(listeE51665 ,listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeMai, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageMai());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiJuin)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Juin> listeJuin;
			listeJuin = new ArrayList<Juin>();
			listeJuin = Modele.afficherAffectationJuin();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();

			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();
			
			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJuin(listeE51665, listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeJuin, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageJuin());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiJuillet)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Juillet> listeJuillet;
			listeJuillet = new ArrayList<Juillet>();
			listeJuillet = Modele.afficherAffectationJuillet();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();

			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();
			
			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJuillet(listeE51665, listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeJuillet, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageJuillet());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiAout)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Aout> listeAout;
			listeAout = new ArrayList<Aout>();
			listeAout = Modele.afficherAffectationAout();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();

			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();
			
			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageAout(listeE51665, listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeAout, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageAout());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiSeptembre)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Septembre> listeSeptembre;
			listeSeptembre = new ArrayList<Septembre>();
			listeSeptembre = Modele.afficherAffectationSeptembre();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();

			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();
			
			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageSeptembre(listeE51665, listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeSeptembre, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageSeptembre());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiOctobre)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Octobre> listeOctobre;
			listeOctobre = new ArrayList<Octobre>();
			listeOctobre = Modele.afficherAffectationOctobre();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();

			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();
			
			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageOctobre(listeE51665, listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeOctobre, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageOctobre());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiNovembre)) {
			ArrayList<PersonnesProduction> listePersonnesProd;
			listePersonnesProd = new ArrayList<PersonnesProduction>();
			listePersonnesProd = Modele.affichagePersonnelProduction();
			
			ArrayList<PersonnesProduction> listeG09308;
			listeG09308 = new ArrayList<PersonnesProduction>();
			listeG09308 = Modele.affichageG09308();
			
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
			
			ArrayList<Novembre> listeNovembre;
			listeNovembre = new ArrayList<Novembre>();
			listeNovembre = Modele.afficherAffectationNovembre();
			
			ArrayList<PersonnesProduction> listeG09086;
			listeG09086 = new ArrayList<PersonnesProduction>();
			listeG09086 = Modele.affichageG09086();
			
			ArrayList<PersonnesProduction> listeE51300;
			listeE51300 = new ArrayList<PersonnesProduction>();
			listeE51300 = Modele.affichageE51300();
			
			ArrayList<PersonnesProduction> listeG01838;
			listeG01838 = new ArrayList<PersonnesProduction>();
			listeG01838 = Modele.affichageG01838();
			
			ArrayList<PersonnesProduction> listeG09844;
			listeG09844 = new ArrayList<PersonnesProduction>();
			listeG09844 = Modele.affichageG09844();
			
			ArrayList<PersonnesProduction> listeG02486;
			listeG02486 = new ArrayList<PersonnesProduction>();
			listeG02486 = Modele.affichageG02486();
			
			ArrayList<PersonnesProduction> listeG09304;
			listeG09304 = new ArrayList<PersonnesProduction>();
			listeG09304 = Modele.affichageG09304();
			
			ArrayList<PersonnesProduction> listeE51349;
			listeE51349 = new ArrayList<PersonnesProduction>();
			listeE51349 = Modele.affichageE51349();
			
			ArrayList<PersonnesProduction> listeE51408;
			listeE51408 = new ArrayList<PersonnesProduction>();
			listeE51408 = Modele.affichageE51408();
			
			ArrayList<PersonnesProduction> listeG09311;
			listeG09311 = new ArrayList<PersonnesProduction>();
			listeG09311 = Modele.affichageG09311();
			
			ArrayList<PersonnesProduction> listeG09513;
			listeG09513 = new ArrayList<PersonnesProduction>();
			listeG09513 = Modele.affichageG09513();
			
			ArrayList<PersonnesProduction> listeG02634;
			listeG02634 = new ArrayList<PersonnesProduction>();
			listeG02634 = Modele.affichageG02634();
			
			ArrayList<PersonnesProduction> listeE51634;
			listeE51634 = new ArrayList<PersonnesProduction>();
			listeE51634 = Modele.affichageE51634();
			
			ArrayList<PersonnesProduction> listeG09057;
			listeG09057 = new ArrayList<PersonnesProduction>();
			listeG09057 = Modele.affichageG09057();
			
			ArrayList<PersonnesProduction> listeG02662;
			listeG02662 = new ArrayList<PersonnesProduction>();
			listeG02662 = Modele.affichageG02662();
			
			ArrayList<PersonnesProduction> listeG09305;
			listeG09305 = new ArrayList<PersonnesProduction>();
			listeG09305 = Modele.affichageG09305();
			
			ArrayList<PersonnesProduction> listeE51122;
			listeE51122 = new ArrayList<PersonnesProduction>();
			listeE51122 = Modele.affichageE51122();
			
			ArrayList<PersonnesProduction> listeE51713;
			listeE51713 = new ArrayList<PersonnesProduction>();
			listeE51713 = Modele.affichageE51713();
			
			ArrayList<PersonnesProduction> listeG09307;
			listeG09307 = new ArrayList<PersonnesProduction>();
			listeG09307 = Modele.affichageG09307();
			
			ArrayList<PersonnesProduction> listeG03087;
			listeG03087 = new ArrayList<PersonnesProduction>();
			listeG03087 = Modele.affichageG03087();
			
			ArrayList<PersonnesProduction> listeE51679;
			listeE51679 = new ArrayList<PersonnesProduction>();
			listeE51679 = Modele.affichageE51679();
			
			ArrayList<PersonnesProduction> listeG00994;
			listeG00994 = new ArrayList<PersonnesProduction>();
			listeG00994 = Modele.affichageG00994();
			
			ArrayList<PersonnesProduction> listeG01221;
			listeG01221 = new ArrayList<PersonnesProduction>();
			listeG01221 = Modele.affichageG01221();
			
			ArrayList<PersonnesProduction> listeG01304;
			listeG01304 = new ArrayList<PersonnesProduction>();
			listeG01304 = Modele.affichageG01304();
			
			ArrayList<PersonnesProduction> listeG02428;
			listeG02428 = new ArrayList<PersonnesProduction>();
			listeG02428 = Modele.affichageG02428();
			
			ArrayList<PersonnesProduction> listeG09626;
			listeG09626 = new ArrayList<PersonnesProduction>();
			listeG09626 = Modele.affichageG09626();
			
			ArrayList<PersonnesProduction> listeE51710;
			listeE51710 = new ArrayList<PersonnesProduction>();
			listeE51710 = Modele.affichageE51710();
			
			ArrayList<PersonnesProduction> listeG03547;
			listeG03547 = new ArrayList<PersonnesProduction>();
			listeG03547 = Modele.affichageG03547();
			
			ArrayList<PersonnesProduction> listeE51574;
			listeE51574 = new ArrayList<PersonnesProduction>();
			listeE51574 = Modele.affichageE51574();
			
			ArrayList<PersonnesProduction> listeE51575;
			listeE51575 = new ArrayList<PersonnesProduction>();
			listeE51575 = Modele.affichageE51575();
			
			ArrayList<PersonnesProduction> listeG09566;
			listeG09566 = new ArrayList<PersonnesProduction>();
			listeG09566 = Modele.affichageG09566();
			
			ArrayList<PersonnesProduction> listeE51126;
			listeE51126 = new ArrayList<PersonnesProduction>();
			listeE51126 = Modele.affichageE51126();
			
			ArrayList<PersonnesProduction> listeG01646;
			listeG01646 = new ArrayList<PersonnesProduction>();
			listeG01646 = Modele.affichageG01646();
			
			ArrayList<PersonnesProduction> listeE51369;
			listeE51369 = new ArrayList<PersonnesProduction>();
			listeE51369 = Modele.affichageE51369();
			
			ArrayList<PersonnesProduction> listeE51660;
			listeE51660 = new ArrayList<PersonnesProduction>();
			listeE51660 = Modele.affichageE51660();
			
			ArrayList<PersonnesProduction> listeB50424;
			listeB50424 = new ArrayList<PersonnesProduction>();
			listeB50424 = Modele.affichageB50424();
			
			ArrayList<PersonnesProduction> listeG03713;
			listeG03713 = new ArrayList<PersonnesProduction>();
			listeG03713 = Modele.affichageG03713();
			
			ArrayList<PersonnesProduction> listeG03546;
			listeG03546 = new ArrayList<PersonnesProduction>();
			listeG03546 = Modele.affichageG03546();
			
			ArrayList<PersonnesProduction> listeG09108;
			listeG09108 = new ArrayList<PersonnesProduction>();
			listeG09108 = Modele.affichageG09108();
			
			ArrayList<PersonnesProduction> listeG03973;
			listeG03973 = new ArrayList<PersonnesProduction>();
			listeG03973 = Modele.affichageG03973();
			
			ArrayList<PersonnesProduction> listeE51427;
			listeE51427 = new ArrayList<PersonnesProduction>();
			listeE51427 = Modele.affichageE51427();
			
			ArrayList<PersonnesProduction> listeG03459;
			listeG03459 = new ArrayList<PersonnesProduction>();
			listeG03459 = Modele.affichageG03459();
			
			ArrayList<PersonnesProduction> listeG03431;
			listeG03431 = new ArrayList<PersonnesProduction>();
			listeG03431 = Modele.affichageG03431();
			
			ArrayList<PersonnesProduction> listeE51659;
			listeE51659 = new ArrayList<PersonnesProduction>();
			listeE51659 = Modele.affichageE51659();
			
			ArrayList<PersonnesProduction> listeE51707;
			listeE51707 = new ArrayList<PersonnesProduction>();
			listeE51707 = Modele.affichageE51707();
			
			ArrayList<PersonnesProduction> listeG09282;
			listeG09282 = new ArrayList<PersonnesProduction>();
			listeG09282 = Modele.affichageG09282();
			
			ArrayList<PersonnesProduction> listeG09262;
			listeG09262 = new ArrayList<PersonnesProduction>();
			listeG09262 = Modele.affichageG09262();
			
			ArrayList<PersonnesProduction> listeG02763;
			listeG02763 = new ArrayList<PersonnesProduction>();
			listeG02763 = Modele.affichageG02763();
			
			ArrayList<PersonnesProduction> listeG01984;
			listeG01984 = new ArrayList<PersonnesProduction>();
			listeG01984 = Modele.affichageG01984();
			
			ArrayList<PersonnesProduction> listeG09265;
			listeG09265 = new ArrayList<PersonnesProduction>();
			listeG09265 = Modele.affichageG09265();
			
			ArrayList<PersonnesProduction> listeG09104;
			listeG09104 = new ArrayList<PersonnesProduction>();
			listeG09104 = Modele.affichageG09104();
			
			ArrayList<PersonnesProduction> listeG09641;
			listeG09641 = new ArrayList<PersonnesProduction>();
			listeG09641 = Modele.affichageG09641();
			
			ArrayList<PersonnesProduction> listeE51424;
			listeE51424 = new ArrayList<PersonnesProduction>();
			listeE51424 = Modele.affichageE51424();
			
			ArrayList<PersonnesProduction> listeG02520;
			listeG02520 = new ArrayList<PersonnesProduction>();
			listeG02520 = Modele.affichageG02520();
			
			ArrayList<PersonnesProduction> listeG02539;
			listeG02539 = new ArrayList<PersonnesProduction>();
			listeG02539 = Modele.affichageG02539();

			ArrayList<PersonnesProduction> listeG09735;
			listeG09735 = new ArrayList<PersonnesProduction>();
			listeG09735 = Modele.affichageG09735();
			
			ArrayList<PersonnesProduction> listeG03329;
			listeG03329 = new ArrayList<PersonnesProduction>();
			listeG03329 = Modele.affichageG03329();
			
			ArrayList<PersonnesProduction> listeE51438;
			listeE51438 = new ArrayList<PersonnesProduction>();
			listeE51438 = Modele.affichageE51438();
			
			ArrayList<PersonnesProduction> listeG03739;
			listeG03739 = new ArrayList<PersonnesProduction>();
			listeG03739 = Modele.affichageG03739();
			
			ArrayList<PersonnesProduction> listeG04030;
			listeG04030 = new ArrayList<PersonnesProduction>();
			listeG04030 = Modele.affichageG04030();
			
			ArrayList<PersonnesProduction> listeE51507;
			listeE51507 = new ArrayList<PersonnesProduction>();
			listeE51507 = Modele.affichageE51507();
			
			ArrayList<PersonnesProduction> listeE51570;
			listeE51570 = new ArrayList<PersonnesProduction>();
			listeE51570 = Modele.affichageE51570();
			
			ArrayList<PersonnesProduction> listeE51627;
			listeE51627 = new ArrayList<PersonnesProduction>();
			listeE51627 = Modele.affichageE51627();
			
			ArrayList<PersonnesProduction> listeE51648;
			listeE51648 = new ArrayList<PersonnesProduction>();
			listeE51648 = Modele.affichageE51648();
			
			ArrayList<PersonnesProduction> listeE51681;
			listeE51681 = new ArrayList<PersonnesProduction>();
			listeE51681 = Modele.affichageE51681();
			
			ArrayList<PersonnesProduction> listeE51533;
			listeE51533 = new ArrayList<PersonnesProduction>();
			listeE51533 = Modele.affichageE51533();
			
			ArrayList<PersonnesProduction> listeE5704;
			listeE5704 = new ArrayList<PersonnesProduction>();
			listeE5704 = Modele.affichageE5704();
			
			ArrayList<PersonnesProduction> listeE51700;
			listeE51700 = new ArrayList<PersonnesProduction>();
			listeE51700 = Modele.affichageE51700();
			
			ArrayList<PersonnesProduction> listeE51705;
			listeE51705 = new ArrayList<PersonnesProduction>();
			listeE51705 = Modele.affichageE51705();
			
			ArrayList<PersonnesProduction> listeG09258;
			listeG09258 = new ArrayList<PersonnesProduction>();
			listeG09258 = Modele.affichageG09258();
			
			ArrayList<PersonnesProduction> listeB50423;
			listeB50423 = new ArrayList<PersonnesProduction>();
			listeB50423 = Modele.affichageB50423();
			
			ArrayList<PersonnesProduction> listeE51576;
			listeE51576 = new ArrayList<PersonnesProduction>();
			listeE51576 = Modele.affichageE51576();
			
			ArrayList<PersonnesProduction> listeE51665;
			listeE51665 = new ArrayList<PersonnesProduction>();
			listeE51665 = Modele.affichageE51665();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageNovembre(listeE51665, listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeNovembre, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageNovembre());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiDecembre)) {
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
			
			ArrayList<Decembre> listeDecembre;
			listeDecembre = new ArrayList<Decembre>();
			listeDecembre = Modele.afficherAffectationDecembre();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageDecembre(listeDecembre, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageDecembre());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource() == jmiQuitter) {
			this.dispose();
		}
	}

}
