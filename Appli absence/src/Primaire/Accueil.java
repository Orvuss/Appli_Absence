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
import Mois.Avril;
import Mois.Fevrier;
import Mois.Janvier;
import Mois.Juillet;
import Mois.Juin;
import Mois.Mai;
import Mois.Mars;
import Mois.Mois;
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
	 * Attributs priv�s de la classe Accueil
	 */
	//Attributs priv�s
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
		 * Titre, localisation, taille etc.. indispensable au d�but de chaque page IHM
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
	     * Instanciation du tableau avec les options de r�servation
	     */
	    //Instanciation 
	    this.jmMenuCommentaire = new JMenu("Commentaires");
	    this.jmMenuCommentaire.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    //Instanciation JMenuBar
	    this.jmbBarre = new JMenuBar();
	    //Instanciation des �l�ments JMenuItem
	    this.jmiAffectation = new JMenuItem("Affectation");
	    this.jmiAffectation.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiAffectation.addActionListener(this);
	    this.jmiALire = new JMenuItem("� lire");
	    this.jmiALire.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiALire.addActionListener(this);
	    this.jmiJoursFeries = new JMenuItem("Jours f�ri�s");
	    this.jmiJoursFeries.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiJoursFeries.addActionListener(this);
	    this.jmiCongesScolaires = new JMenuItem("Cong�s scolaires");
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
	    this.jmMenuFevrier = new JMenu("F�vrier");
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
	    this.jmMenuAout = new JMenu("Ao�t");
	    this.jmMenuAout.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuSeptembre = new JMenu("Septembre");
	    this.jmMenuSeptembre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuOctobre = new JMenu("Octobre");
	    this.jmMenuOctobre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuNovembre = new JMenu("Novembre");
	    this.jmMenuNovembre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    this.jmMenuDecembre = new JMenu("D�cembre");
	    this.jmMenuDecembre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
	    
	    this.jmiJanvier = new JMenuItem("Janvier");
	    this.jmiJanvier.setFont(new Font("Century Gothic", Font.PLAIN, 13));
	    this.jmiJanvier.addActionListener(this);
	    this.jmiFevrier = new JMenuItem("F�vrier");
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
	    this.jmiAout = new JMenuItem("Ao�t");
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
	    this.jmiDecembre = new JMenuItem("D�cembre");
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

	    //Ajout du JMenu � la barre
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
	    this.lblMessage = new JLabel("Veuillez choisir une cat�gorie.");
	    
	    /**
	     * Mise en place de la couleur d'�criture du label "lblMessage"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);

	    /**
	     * Ajout des attributs � mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelAccueil.add(panelMessage, BorderLayout.PAGE_START);

	    this.panelMessage.add(lblMessage);
	    

	    
	    
	    //Toujours � la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours � la fin de la classe
  		 */
  		this.setAlwaysOnTop(true);
  		this.getContentPane().add(panelAccueil);
  		this.setVisible(true);
	}
	
	public JPanel getMonPanelAccueil() {
    	return panelAccueil;
    }
	
	/**
	 * Action performed permettant la navigation entre les diff�rentes classe pour permettre l'affichage
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
			
			ArrayList<Janvier> listeJanvier;
			listeJanvier = new ArrayList<Janvier>();
			listeJanvier = Modele.afficherAffectationJanvier();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJanvier(listeJanvier, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageJanvier());
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
			
			ArrayList<Fevrier> listeFevrier;
			listeFevrier = new ArrayList<Fevrier>();
			listeFevrier = Modele.afficherAffectationFevrier();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageFevrier(listeFevrier, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageFevrier());
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
			
			ArrayList<Mars> listeMars;
			listeMars = new ArrayList<Mars>();
			listeMars = Modele.afficherAffectationMars();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageMars(listeMars, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageMars());
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
			
			ArrayList<Avril> listeAvril;
			listeAvril = new ArrayList<Avril>();
			listeAvril = Modele.afficherAffectationAvril();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageAvril(listeAvril, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageAvril());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiMai)) {
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
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageMai(listeMai, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageMai());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiJuin)) {
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
			
			ArrayList<Juin> listeJuin;
			listeJuin = new ArrayList<Juin>();
			listeJuin = Modele.afficherAffectationJuin();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJuin(listeJuin, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageJuin());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiJuillet)) {
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
			
			ArrayList<Juillet> listeJuillet;
			listeJuillet = new ArrayList<Juillet>();
			listeJuillet = Modele.afficherAffectationJuillet();
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageJuillet(listeJuillet, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageJuillet());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiAout)) {
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
			this.panelAccueil.add(new PageAout(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageAout());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiSeptembre)) {
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
			this.panelAccueil.add(new PageSeptembre(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageSeptembre());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiOctobre)) {
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
			this.panelAccueil.add(new PageOctobre(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageOctobre());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource().equals(jmiNovembre)) {
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
			this.panelAccueil.add(new PageNovembre(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageNovembre());
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
			this.panelAccueil.removeAll();
			this.panelAccueil.add(new PageDecembre(listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageDecembre());
			this.panelAccueil.revalidate();
			this.panelAccueil.repaint();
		}
		if(e.getSource() == jmiQuitter) {
			this.dispose();
		}
	}

}
