package Mois;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Personnes.PersonnesProduction;
import Primaire.Modele;
import Secondaire.PageAjouterNovembre;
import Secondaire.PageAjouterOctobre;
import Secondaire.PageSupprimerNovembre;
import Secondaire.PageSupprimerOctobre;

/**
 * Classe PageNovembre
 * @author ldatchi
 *
 */
public class PageNovembre extends JPanel implements ActionListener{

	/**
	 * Attributs privés de la classe PageNovembre
	 */
	//Attributs privés
	//Panel
	private JPanel panelPageNovembre;
	private JPanel panelChamps;
	private JPanel panelBouton;

	//Label
	private JLabel lblTableauNovembre;
	
	//JTable
	private JTable tableau;
	
	//JButton
	private JButton btnAjouter;
	private JButton btnSupprimer;
	private JButton btnRefresh;
	
	//JScrollPane
	private JScrollPane scrollpane;
	
	//Constructeur
	public PageNovembre(ArrayList <PersonnesProduction> listeE51665, ArrayList <PersonnesProduction> listeE51576, ArrayList <PersonnesProduction> listeB50423, ArrayList <PersonnesProduction> listeG09258, ArrayList <PersonnesProduction> listeE51705, ArrayList <PersonnesProduction> listeE51700, ArrayList <PersonnesProduction> listeE5704, ArrayList <PersonnesProduction> listeE51533, ArrayList <PersonnesProduction> listeE51681, ArrayList <PersonnesProduction> listeE51648, ArrayList <PersonnesProduction> listeE51627, ArrayList <PersonnesProduction> listeE51570, ArrayList <PersonnesProduction> listeE51507, ArrayList <PersonnesProduction> listeG04030, ArrayList <PersonnesProduction> listeG03739, ArrayList <PersonnesProduction> listeE51438, ArrayList <PersonnesProduction> listeG03329, ArrayList <PersonnesProduction> listeG09735, ArrayList <PersonnesProduction> listeG02539, ArrayList <PersonnesProduction> listeG02520, ArrayList <PersonnesProduction> listeE51424, ArrayList <PersonnesProduction> listeG09641, ArrayList <PersonnesProduction> listeG09104, ArrayList <PersonnesProduction> listeG09265, ArrayList <PersonnesProduction> listeG01984, ArrayList <PersonnesProduction> listeG02763, ArrayList <PersonnesProduction> listeG09262, ArrayList <PersonnesProduction> listeG09282, ArrayList <PersonnesProduction> listeE51707, ArrayList <PersonnesProduction> listeE51659, ArrayList <PersonnesProduction> listeG03431, ArrayList <PersonnesProduction> listeG03459, ArrayList <PersonnesProduction> listeE51427, ArrayList <PersonnesProduction> listeG03973, ArrayList <PersonnesProduction> listeG09108, ArrayList <PersonnesProduction> listeG03546, ArrayList <PersonnesProduction> listeG03713, ArrayList <PersonnesProduction> listeB50424, ArrayList <PersonnesProduction> listeE51660, ArrayList <PersonnesProduction> listeE51369, ArrayList <PersonnesProduction> listeG01646, ArrayList <PersonnesProduction> listeE51126, ArrayList <PersonnesProduction> listeG09566, ArrayList <PersonnesProduction> listeE51575, ArrayList <PersonnesProduction> listeE51574, ArrayList <PersonnesProduction> listeG03547, ArrayList <PersonnesProduction> listeE51710, ArrayList <PersonnesProduction> listeG09626, ArrayList <PersonnesProduction> listeG02428, ArrayList <PersonnesProduction> listeG01304, ArrayList <PersonnesProduction> listeG01221, ArrayList <PersonnesProduction> listeG00994, ArrayList <PersonnesProduction> listeE51679, ArrayList <PersonnesProduction> listeG03087, ArrayList <PersonnesProduction> listeG09307, ArrayList <PersonnesProduction> listeE51713, ArrayList <PersonnesProduction> listeE51122, ArrayList <PersonnesProduction> listeG09305, ArrayList <PersonnesProduction> listeG02662, ArrayList <PersonnesProduction> listeG09057, ArrayList <PersonnesProduction> listeE51634, ArrayList <PersonnesProduction> listeG02634, ArrayList <PersonnesProduction> listeG09513, ArrayList <PersonnesProduction> listeG09311, ArrayList <PersonnesProduction> listeE51408, ArrayList <PersonnesProduction> listeE51349, ArrayList <PersonnesProduction> listeG09304, ArrayList <PersonnesProduction> listeG02486, ArrayList <PersonnesProduction> listeG09844, ArrayList <PersonnesProduction> listeG01838, ArrayList <PersonnesProduction> listeE51300, ArrayList <PersonnesProduction> listeG09086, ArrayList <PersonnesProduction> listeG09308, ArrayList<Novembre> listeNovembre, ArrayList<PersonnesProduction> listePersonnesProd, ArrayList<PersonnesProduction> listePersonnesCoor, ArrayList<PersonnesProduction> listePersonnesExplServ, ArrayList<PersonnesProduction> listePersonnesPil, ArrayList<PersonnesProduction> listePersonnesDBA, ArrayList<PersonnesProduction> listePersonnesEdEtArch, ArrayList<PersonnesProduction> listePersonnes3pts, ArrayList<PersonnesProduction> listePersonnesServDesk, ArrayList<PersonnesProduction> listePersonnesChangMEP, ArrayList<PersonnesProduction> listePersonnesInte, ArrayList<PersonnesProduction> listePersonnesInteMF, ArrayList<PersonnesProduction> listePersonnesInteOpen, ArrayList<PersonnesProduction> listePersonnesFlux, ArrayList<PersonnesProduction> listePersonnesSTE, ArrayList<PersonnesProduction> listePersonnesSecurite, ArrayList<PersonnesProduction> listePersonnesSECOP, ArrayList<PersonnesProduction> listePersonnesRSI, ArrayList<PersonnesProduction> listePersonnesSOC, ArrayList<PersonnesProduction> listePersonnesArchiInfraSys, ArrayList<PersonnesProduction> listePersonnesArchiTech, ArrayList<PersonnesProduction> listePersonnesSysteme, ArrayList<PersonnesProduction> listePersonnesRSB, ArrayList<PersonnesProduction> listePersonnesReseaux, ArrayList<PersonnesProduction> listePersonnesServBur, ArrayList<PersonnesProduction> listePersonnesWindows, ArrayList<PersonnesProduction> listePersonnesLinux) {	
	    /**
	     * Instanciation de mes panels "panelPageNovembre" et "panelChamps"
	     */
	    //Instanciation des panels
	    this.panelPageNovembre = new JPanel();
	    this.panelChamps = new JPanel();
	    this.panelBouton = new JPanel();
	   
	    /**
	     * Mise en place des background des panels "panelPageNovembre"et "panelChamps"
	     */
	    //Background des panels
	    this.panelPageNovembre.setBackground(Color.white);

	    /**
	     * Mise en place des dispositions des panels "panelPageNovembre" et "panelChamps"
	     */
	    //Disposition des panels
	    this.panelPageNovembre.setLayout(new BorderLayout());
	    this.panelChamps.setLayout(new FlowLayout());	    
	    this.panelBouton.setLayout(new FlowLayout());	    

	    String resultatMois = "";
	    for (Novembre monNovembre: listeNovembre) {
	    	resultatMois += monNovembre.getAffectationN().toString();	
	    }
	    
	  //Eric Beghin
	    String G09308 = "";
	    for(PersonnesProduction maPersonneProd: listeG09308) {
	    	G09308 += maPersonneProd.toString();
	    }
	    
	    //Laure Delecroix & LC Euraxiel
	    String G09086 = "";
	    for(PersonnesProduction maPersonneProd: listeG09086) {
	    	G09086 += maPersonneProd.toString();
	    }
	    String E51300 = "";
	    for(PersonnesProduction maPersonneProd: listeE51300) {
	    	E51300 += maPersonneProd.toString();
	    }
	    
	    //Martin
	    String G01838 = "";
	    for(PersonnesProduction maPersonneProd: listeG01838) {
	    	G01838 += maPersonneProd.toString();
	    }
	    
	    //Cunin
	    String G09844 = "";
	    for(PersonnesProduction maPersonneProd: listeG09844) {
	    	G09844 += maPersonneProd.toString();
	    }
	    
	    //Coulombel, FOREST, INETUM CM & INETUM PI
	    String G02486 = "";
	    for(PersonnesProduction maPersonneProd: listeG02486) {
	    	G02486 += maPersonneProd.toString();
	    }
	    String G09304 = "";
	    for(PersonnesProduction maPersonneProd: listeG09304) {
	    	G09304 += maPersonneProd.toString();
	    }
	    String E51349 = "";
	    for(PersonnesProduction maPersonneProd: listeE51349) {
	    	E51349 += maPersonneProd.toString();
	    }
	    String E51408 = "";
	    for(PersonnesProduction maPersonneProd: listeE51408) {
	    	E51408 += maPersonneProd.toString();
	    }
	    
	    //Bui & PASQUET
	    String G09311 = "";
	    for(PersonnesProduction maPersonneProd: listeG09311) {
	    	G09311 += maPersonneProd.toString();
	    }
	    String G09513 = "";
	    for(PersonnesProduction maPersonneProd: listeG09513) {
	    	G09513 += maPersonneProd.toString();
	    }
	    
	    //BAHANI & INETUM BM
	    String G02634 = "";
	    for(PersonnesProduction maPersonneProd: listeG02634) {
	    	G02634 += maPersonneProd.toString();
	    }
	    String E51634 = "";
	    for(PersonnesProduction maPersonneProd: listeE51634) {
	    	E51634 += maPersonneProd.toString();
	    }
	    
	    //CARRU & OHANA
	    String G09057 = "";
	    for(PersonnesProduction maPersonneProd: listeG09057) {
	    	G09057 += maPersonneProd.toString();
	    }
	    String G02662 = "";
	    for(PersonnesProduction maPersonneProd: listeG02662) {
	    	G02662 += maPersonneProd.toString();
	    }
	    
	    //GLEMAIN
	    String G09305 = "";
	    for(PersonnesProduction maPersonneProd: listeG09305) {
	    	G09305 += maPersonneProd.toString();
	    }
	    String E51122 = "";
	    for(PersonnesProduction maPersonneProd: listeE51122) {
	    	E51122 += maPersonneProd.toString();
	    }
	    String E51713 = "";
	    for(PersonnesProduction maPersonneProd: listeE51713) {
	    	E51713 += maPersonneProd.toString();
	    }
	    
	    //THIERRY
	    String G09307 = "";
	    for(PersonnesProduction maPersonneProd: listeG09307) {
	    	G09307 += maPersonneProd.toString();
	    }
	    
	    //ABOJIAN, INETUM SM, RAMENE, LEBLOND, GUIGNEBERT, FERTER, DIDARET & INETUM DA
	    String G03087 = "";
	    for(PersonnesProduction maPersonneProd: listeG03087) {
	    	G03087 += maPersonneProd.toString();
	    }
	    String E51679 = "";
	    for(PersonnesProduction maPersonneProd: listeE51679) {
	    	E51679 += maPersonneProd.toString();
	    }
	    String G00994 = "";
	    for(PersonnesProduction maPersonneProd: listeG00994) {
	    	G00994 += maPersonneProd.toString();
	    }
	    String G01221 = "";
	    for(PersonnesProduction maPersonneProd: listeG01221) {
	    	G01221 += maPersonneProd.toString();
	    }
	    String G01304 = "";
	    for(PersonnesProduction maPersonneProd: listeG01304) {
	    	G01304 += maPersonneProd.toString();
	    }
	    String G02428 = "";
	    for(PersonnesProduction maPersonneProd: listeG02428) {
	    	G02428 += maPersonneProd.toString();
	    }
	    String G09626 = "";
	    for(PersonnesProduction maPersonneProd: listeG09626) {
	    	G09626 += maPersonneProd.toString();
	    }
	    String E51710 = "";
	    for(PersonnesProduction maPersonneProd: listeE51710) {
	    	E51710 += maPersonneProd.toString();
	    }
	    
	    //SAIDOU, INETUM YB & INETUM FB
	    String G03547 = "";
	    for(PersonnesProduction maPersonneProd: listeG03547) {
	    	G03547 += maPersonneProd.toString();
	    }
	    String E51574 = "";
	    for(PersonnesProduction maPersonneProd: listeE51574) {
	    	E51574 += maPersonneProd.toString();
	    }
	    String E51575 = "";
	    for(PersonnesProduction maPersonneProd: listeE51575) {
	    	E51575 += maPersonneProd.toString();
	    }
	    
	    //BOISSET & INETUM CB
	    String G09566 = "";
	    for(PersonnesProduction maPersonneProd: listeG09566) {
	    	G09566 += maPersonneProd.toString();
	    }
	    String E51126 = "";
	    for(PersonnesProduction maPersonneProd: listeE51126) {
	    	E51126 += maPersonneProd.toString();
	    }
	    
	    //DUCHAUSSOY, ANOLIS & INETUM TP
	    String G01646 = "";
	    for(PersonnesProduction maPersonneProd: listeG01646) {
	    	G01646 += maPersonneProd.toString();
	    }
	    String E51369 = "";
	    for(PersonnesProduction maPersonneProd: listeE51369) {
	    	E51369 += maPersonneProd.toString();
	    }
	    String E51660 = "";
	    for(PersonnesProduction maPersonneProd: listeE51660) {
	    	E51660 += maPersonneProd.toString();
	    }
	    
	    //FONTESSE
	    String B50424 = "";
	    for(PersonnesProduction maPersonneProd: listeB50424) {
	    	B50424 += maPersonneProd.toString();
	    }
	    
	    //GILLE, HABACHOU, ARDILIO, BEYLIER & NSIS
	    String G03713 = "";
	    for(PersonnesProduction maPersonneProd: listeG03713) {
	    	G03713 += maPersonneProd.toString();
	    }
	    String G03546 = "";
	    for(PersonnesProduction maPersonneProd: listeG03546) {
	    	G03546 += maPersonneProd.toString();
	    }
	    String G09108 = "";
	    for(PersonnesProduction maPersonneProd: listeG09108) {
	    	G09108 += maPersonneProd.toString();
	    }
	    String G03973 = "";
	    for(PersonnesProduction maPersonneProd: listeG03973) {
	    	G03973 += maPersonneProd.toString();
	    }
	    String E51427 = "";
	    for(PersonnesProduction maPersonneProd: listeE51427) {
	    	E51427 += maPersonneProd.toString();
	    }
	    
	    //CATTAINI
	    String G03459 = "";
	    for(PersonnesProduction maPersonneProd: listeG03459) {
	    	G03459 += maPersonneProd.toString();
	    }
	    
	    //BIGOT, CLINKAST ZZ & CLINKAST MA
	    String G03431 = "";
	    for(PersonnesProduction maPersonneProd: listeG03431) {
	    	G03431 += maPersonneProd.toString();
	    }
	    String E51659 = "";
	    for(PersonnesProduction maPersonneProd: listeE51659) {
	    	E51659 += maPersonneProd.toString();
	    }
	    String E51707 = "";
	    for(PersonnesProduction maPersonneProd: listeE51707) {
	    	E51707 += maPersonneProd.toString();
	    }
	    
	    //BUTEUX
	    String G09282 = "";
	    for(PersonnesProduction maPersonneProd: listeG09282) {
	    	G09282 += maPersonneProd.toString();
	    }
	    
	    //BAUDOIN
	    String G09262 = "";
	    for(PersonnesProduction maPersonneProd: listeG09262) {
	    	G09262 += maPersonneProd.toString();
	    }
	    
	    //JEAN, HUMBERT, MENARD, RIEUX, ROULLAND & ADONYS
	    String G02763 = "";
	    for(PersonnesProduction maPersonneProd: listeG02763) {
	    	G02763 += maPersonneProd.toString();
	    }
	    String G01984 = "";
	    for(PersonnesProduction maPersonneProd: listeG01984) {
	    	G01984 += maPersonneProd.toString();
	    }
	    String G09265 = "";
	    for(PersonnesProduction maPersonneProd: listeG09265) {
	    	G09265 += maPersonneProd.toString();
	    }
	    String G09104 = "";
	    for(PersonnesProduction maPersonneProd: listeG09104) {
	    	G09104 += maPersonneProd.toString();
	    }
	    String G09641 = "";
	    for(PersonnesProduction maPersonneProd: listeG09641) {
	    	G09641 += maPersonneProd.toString();
	    }
	    String E51424 = "";
	    for(PersonnesProduction maPersonneProd: listeE51424) {
	    	E51424 += maPersonneProd.toString();
	    }
	    
	    //LEROUX
	    String G02520 = "";
	    for(PersonnesProduction maPersonneProd: listeG02520) {
	    	G02520 += maPersonneProd.toString();
	    }
	    
	    //ERDINC, MARCHAND, KHY & SCC
	    String G02539 = "";
	    for(PersonnesProduction maPersonneProd: listeG02539) {
	    	G02539 += maPersonneProd.toString();
	    }
	    String G09735 = "";
	    for(PersonnesProduction maPersonneProd: listeG09735) {
	    	G09735 += maPersonneProd.toString();
	    }
	    String G03329 = "";
	    for(PersonnesProduction maPersonneProd: listeG03329) {
	    	G03329 += maPersonneProd.toString();
	    }
	    String E51438 = "";
	    for(PersonnesProduction maPersonneProd: listeE51438) {
	    	E51438 += maPersonneProd.toString();
	    }
	    
	    //Bouloc, VAN DER CRUYSSEN, HT TEAM, CELAD RD, CELAD LF, CELAD, ABA, CELAD GK, COESSI, CELAD ABH, CELAD HF, METSYS
	    String G03739 = "";
	    for(PersonnesProduction maPersonneProd: listeG03739) {
	    	G03739 += maPersonneProd.toString();
	    }
	    String G04030 = "";
	    for(PersonnesProduction maPersonneProd: listeG04030) {
	    	G04030 += maPersonneProd.toString();
	    }
	    String E51507 = "";
	    for(PersonnesProduction maPersonneProd: listeE51507) {
	    	E51507 += maPersonneProd.toString();
	    }
	    String E51570 = "";
	    for(PersonnesProduction maPersonneProd: listeE51570) {
	    	E51570 += maPersonneProd.toString();
	    }
	    String E51627 = "";
	    for(PersonnesProduction maPersonneProd: listeE51627) {
	    	E51627 += maPersonneProd.toString();
	    }
	    String E51648 = "";
	    for(PersonnesProduction maPersonneProd: listeE51648) {
	    	E51648 += maPersonneProd.toString();
	    }
	    String E51681 = "";
	    for(PersonnesProduction maPersonneProd: listeE51681) {
	    	E51681 += maPersonneProd.toString();
	    }
	    String E51533 = "";
	    for(PersonnesProduction maPersonneProd: listeE51533) {
	    	E51533 += maPersonneProd.toString();
	    }
	    String E5704 = "";
	    for(PersonnesProduction maPersonneProd: listeE5704) {
	    	E5704 += maPersonneProd.toString();
	    }
	    String E51700 = "";
	    for(PersonnesProduction maPersonneProd: listeE51700) {
	    	E51700 += maPersonneProd.toString();
	    }
	    String E51705 = "";
	    for(PersonnesProduction maPersonneProd: listeE51705) {
	    	E51705 += maPersonneProd.toString();
	    }
	    
	    //OLIER, MARLIERE, ELANZ & HR TEAM
	    String G09258 = "";
	    for(PersonnesProduction maPersonneProd: listeG09258) {
	    	G09258 += maPersonneProd.toString();
	    }
	    String B50423 = "";
	    for(PersonnesProduction maPersonneProd: listeB50423) {
	    	B50423 += maPersonneProd.toString();
	    }
	    String E51576 = "";
	    for(PersonnesProduction maPersonneProd: listeE51576) {
	    	E51576 += maPersonneProd.toString();
	    }
	    String E51665 = "";
	    for(PersonnesProduction maPersonneProd: listeE51665) {
	    	E51665 += maPersonneProd.toString();
	    }
	    
	    String tdProd = "";
	    String resultatProd = "";
        for (PersonnesProduction maPersonneProd: listePersonnesProd) {
        	resultatProd += maPersonneProd.toString();
        	tdProd = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatProd + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td>" + resultatMois + "</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatCoor = "";
        String tdCoor = "";
        for (PersonnesProduction maPersonneCoor: listePersonnesCoor) {
        	resultatCoor += maPersonneCoor.toString();
        	tdCoor = "<tr align='center'>\r\n"
        			+ "			<td>" + G09086 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51300 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatExplServ = "";
        String tdExplServ = "";
        for (PersonnesProduction maPersonneExplServ: listePersonnesExplServ) {
        	resultatExplServ += maPersonneExplServ.toString();
        	tdExplServ = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatExplServ + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatPil = "";
        String tdPil = "";
        for (PersonnesProduction maPersonnePil: listePersonnesPil) {
        	resultatPil += maPersonnePil.toString();
        	tdPil = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatPil + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatDBA = "";
        String tdDBA = "";
        for (PersonnesProduction maPersonneDBA: listePersonnesDBA) {
        	resultatDBA += maPersonneDBA.toString();
        	tdDBA = "<tr align='center'>\r\n"
        			+ "			<td>" + G02486 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G09304 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51349 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51408 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatEdEtArch = "";
        String tdEdEtArch = "";
        for (PersonnesProduction maPersonneEdEtArch: listePersonnesEdEtArch) {
        	resultatEdEtArch += maPersonneEdEtArch.toString();
        	tdEdEtArch = "<tr align='center'>\r\n"
        			+ "			<td>" + G09311 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G09513 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultat3Pts = "";
        String td3Pts = "";
        for (PersonnesProduction maPersonne3Pts: listePersonnes3pts) {
        	resultat3Pts += maPersonne3Pts.toString();
        	td3Pts = "<tr align='center'>\r\n"
        			+ "			<td>" + G02634 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51634 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatServDesk = "";
        String tdServDesk = "";
        for (PersonnesProduction maPersonneServDesk: listePersonnesServDesk) {
        	resultatServDesk += maPersonneServDesk.toString();
        	tdServDesk = "<tr align='center'>\r\n"
        			+ "			<td>" + G09057 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G02662 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatChangMEP = "";
        String tdChangMEP = "";
        for (PersonnesProduction maPersonneChangMEP: listePersonnesChangMEP) {
        	resultatChangMEP += maPersonneChangMEP.toString();
        	tdChangMEP = "<tr align='center'>\r\n"
        			+ "			<td>" + G09305 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51122 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51713 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatInte = "";
        String tdInte = "";
        for (PersonnesProduction maPersonneInte: listePersonnesInte) {
        	resultatInte += maPersonneInte.toString();
        	tdInte = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatInte + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatInteMF = "";
        String tdInteMF = "";
        for (PersonnesProduction maPersonneInteMF: listePersonnesInteMF) {
        	resultatInteMF += maPersonneInteMF.toString();
        	tdInteMF = "<tr align='center'>\r\n"
        			+ "			<td>" + G03087 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51679 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G00994 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G01221 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G01304 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G02428 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G09626 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51710 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatInteOpen = "";
        String tdInteOpen = "";
        for (PersonnesProduction maPersonneInteOpen: listePersonnesInteOpen) {
        	resultatInteOpen += maPersonneInteOpen.toString();
        	tdInteOpen = "<tr align='center'>\r\n"
        			+ "			<td>" + G03547 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51574 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51575 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatFlux= "";
        String tdFlux = "";
        for (PersonnesProduction maPersonneFlux: listePersonnesFlux) {
        	resultatFlux += maPersonneFlux.toString();
        	tdFlux = "<tr align='center'>\r\n"
        			+ "			<td>" + G09566 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51126 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatSTE= "";
        String tdSTE = "";
        for (PersonnesProduction maPersonneSTE: listePersonnesSTE) {
        	resultatSTE += maPersonneSTE.toString();
        	tdSTE = "<tr align='center'>\r\n"
        			+ "			<td>" + G01646 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51369 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51660 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatSecurite = "";
        String tdSecurite = "";
        for (PersonnesProduction maPersonneSecurite: listePersonnesSecurite) {
        	resultatSecurite += maPersonneSecurite.toString();
        	tdSecurite = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatSecurite + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatSECOP = "";
        String tdSECOP = "";
        for (PersonnesProduction maPersonneSECOP: listePersonnesSECOP) {
        	resultatSECOP += maPersonneSECOP.toString();
        	tdSECOP = "<tr align='center'>\r\n"
        			+ "			<td>" + G03713 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G03546 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G09108 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G03973 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51427 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatRSI = "";
        String tdRSI = "";
        for (PersonnesProduction maPersonneRSI: listePersonnesRSI) {
        	resultatRSI += maPersonneRSI.toString();
        	tdRSI = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatRSI + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatSOC = "";
        String tdSOC = "";
        for (PersonnesProduction maPersonneSOC: listePersonnesSOC) {
        	resultatSOC += maPersonneSOC.toString();
        	tdSOC = "<tr align='center'>\r\n"
        			+ "			<td>" + G03431 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51659 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51707 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatArchiInfraSys = "";
        String tdArchiInfraSys = "";
        for (PersonnesProduction maPersonneArchiInfraSys: listePersonnesArchiInfraSys) {
        	resultatArchiInfraSys += maPersonneArchiInfraSys.toString();
        	tdArchiInfraSys = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatArchiInfraSys + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatArchiTech = "";
        String tdArchiTech = "";
        for (PersonnesProduction maPersonneArchiTech : listePersonnesArchiTech) {
        	resultatArchiTech += maPersonneArchiTech.toString();
        	tdArchiTech = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatArchiTech + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatSysteme = "";
        String tdSysteme = "";
        for (PersonnesProduction maPersonneSysteme : listePersonnesSysteme) {
        	resultatSysteme += maPersonneSysteme.toString();
        	tdSysteme = "<tr align='center'>\r\n"
        			+ "			<td>" + G02763 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G01984 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G09265 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G09104 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G09641 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51424 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatRSB = "";
        String tdRSB = "";
        for (PersonnesProduction maPersonneRSB : listePersonnesRSB) {
        	resultatRSB += maPersonneRSB.toString();
        	tdRSB = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatRSB + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatReseaux = "";
        String tdReseaux = "";
        for (PersonnesProduction maPersonneReseaux : listePersonnesReseaux) {
        	resultatReseaux += maPersonneReseaux.toString();
        	tdReseaux = "<tr align='center'>\r\n"
        			+ "			<td>" + G02539 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G09735 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G03329 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51438 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatServBur = "";
        String tdServBur = "";
        for (PersonnesProduction maPersonneServBur : listePersonnesServBur) {
        	resultatServBur += maPersonneServBur.toString();
        	tdServBur = "<tr align='center'>\r\n"
        			+ "			<td>" + resultatServBur + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>";
        }
        
        String resultatWindows = "";
        String tdWindows = "";
        for (PersonnesProduction maPersonneWindows : listePersonnesWindows) {
        	resultatWindows += maPersonneWindows.toString();
        	tdWindows = "<tr align='center'>\r\n"
        			+ "			<td>" + G03739 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + G04030 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>"+ E51507 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51570 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>"+ E51627 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51648 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51681 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51533 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E5704 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51700 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51705 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
        String resultatLinux = "";
        String tdLinux = "";
        for (PersonnesProduction maPersonneLinux : listePersonnesLinux) {
        	resultatLinux += maPersonneLinux.toString();
        	tdLinux = "<tr align='center'>\r\n"
        			+ "			<td>" + G09258 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "		</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + B50423 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51576 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>"
        			+ "<tr align='center'>\r\n"
        			+ "			<td>" + E51665 + "</td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'>jf</td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td bgcolor='#28C7E3'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td><input type='text' size='2'></td>\r\n"
        			+ "			<td></td>\r\n"
        			+ "</tr>";
        }
        
	    String texte = "<html>\r\n"
	    		+ "	<table border=0 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<th>2022</th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th bgcolor=\"#F07D00\">BC</th>\r\n"
	    		+ "			<th bgcolor=\"#F07D00\">BC</th>\r\n"
	    		+ "			<th bgcolor=\"#F07D00\">BC</th>\r\n"
	    		+ "			<th bgcolor=\"#F07D00\">BC</th>\r\n"
	    		+ "			<th bgcolor=\"#F07D00\">BC</th>\r\n"
	    		+ "			<th bgcolor=\"#F07D00\">BC</th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "			<th></th>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Novembre</td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Mar</td>\r\n"
	    		+ "			<td>Mer</td>\r\n"
	    		+ "			<td>Jeu</td>\r\n"
	    		+ "			<td>Ven</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Sam</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Dim</td>\r\n"
	    		+ "			<td>Lun</td>\r\n"
	    		+ "			<td>Mar</td>\r\n"
	    		+ "			<td>Mer</td>\r\n"
	    		+ "			<td>Jeu</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Ven</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Sam</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Dim</td>\r\n"
	    		+ "			<td>Lun</td>\r\n"
	    		+ "			<td>Mar</td>\r\n"
	    		+ "			<td>Mer</td>\r\n"
	    		+ "			<td>Jeu</td>\r\n"
	    		+ "			<td>Ven</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Sam</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Dim</td>\r\n"
	    		+ "			<td>Lun</td>\r\n"
	    		+ "			<td>Mar</td>\r\n"
	    		+ "			<td>Mer</td>\r\n"
	    		+ "			<td>Jeu</td>\r\n"
	    		+ "			<td>Ven</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Sam</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>Dim</td>\r\n"
	    		+ "			<td>Lun</td>\r\n"
	    		+ "			<td>Mar</td>\r\n"
	    		+ "			<td>Mer</td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Noms</td>\r\n"
	    		+ "			<td>Anc. Solde CP + RTT</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>01</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>02</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>03</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>04</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>05</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>06</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>07</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>08</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>09</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>10</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>11</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>12</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>13</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>14</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>15</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>16</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>17</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>18</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>19</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>20</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>21</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>22</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>23</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>24</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>25</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>26</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>27</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>28</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>29</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'>30</td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Production</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdProd + ""
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#F6D309' color='black'>Coordination Globale Production</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdCoor + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#F6D309' color='black'>Exploitation & Services</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdExplServ + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Pilotage</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdPil + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>DBA - Metrologie</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdDBA + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Editique et Archivage</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdEdEtArch + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>....</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + td3Pts + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Service Desk</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdServDesk + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Changement, MEP</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdChangMEP + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Integration - STE - GDF - EAR</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdInte + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Integration MF</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdInteMF + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Integration Open</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdInteOpen + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Flux</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdFlux + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>STE</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdSTE + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Securite</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdSecurite + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>SECOP</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdSECOP + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>RSI</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdRSI + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>SOC</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdSOC + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Architecture Infra & Systeme</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdArchiInfraSys + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Architecture Technique</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdArchiTech + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Systeme</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdSysteme + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Reseaux, Serveurs, Bureautique</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>\r\n" + tdRSB + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Reseaux</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>\r\n" + tdReseaux + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Serveurs et Bureautique</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>" + tdServBur + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Windows</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>\r\n" + tdWindows + ""
	    		+ "<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#28C7E3' color='black'>Linux</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "		</tr>\r\n" + tdLinux + ""
	    		+ "	</table>\r\n"
	    		+ "</html>";
	    
	    this.lblTableauNovembre = new JLabel(texte);

	    this.lblTableauNovembre.setPreferredSize(new Dimension(1500, 1730));
	    
	    Object data[][] = new Object[1][1];
	    int i = 0;
		data[i ][0] = lblTableauNovembre.getText();
	    String[] title = {
	            ""
	        };
        this.tableau = new JTable(data, title);
        this.tableau.setEnabled(false);

        this.tableau.setPreferredScrollableViewportSize(new Dimension(1000, 800));

        /**
         * Mise en place de la taille du tableau
         */
        //Taille
        this.tableau.setRowHeight(2800);

        /**
         * Mise en place de la barre de scroll
         */
        //Barre de scroll
        this.scrollpane = new JScrollPane(this.tableau);
        this.panelChamps.add(this.scrollpane);
	    
        this.btnAjouter = new JButton("Ajouter");
	    this.btnAjouter.addActionListener(this);
	    this.btnSupprimer = new JButton("Supprimer");
	    this.btnSupprimer.addActionListener(this);
	    this.btnRefresh = new JButton("Refresh");
	    this.btnRefresh.addActionListener(this);
	     
	    /**
	     * Ajout des attributs à mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelPageNovembre.add(panelChamps, BorderLayout.CENTER);
	    this.panelPageNovembre.add(panelBouton, BorderLayout.SOUTH);

	    this.panelChamps.add(lblTableauNovembre);
	    this.panelBouton.add(btnAjouter);
	    this.panelBouton.add(btnSupprimer);
	    this.panelBouton.add(btnRefresh); 
	    
        this.panelPageNovembre.add(this.scrollpane);

	    //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
  		this.setVisible(true);

	}
	
	public JPanel getMonPanelPageNovembre() {
    	return panelPageNovembre;
    }
	
	/**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAjouter) {
			PageAjouterNovembre maPageAjoutNovembre = new PageAjouterNovembre();
		}
		if(e.getSource() == btnSupprimer) {
			ArrayList<Novembre> listeDateNovembre;
			listeDateNovembre = new ArrayList<Novembre>();
			listeDateNovembre = Modele.afficherDateDebutNovembre();
			PageSupprimerNovembre maPageSupprimerNovembre = new PageSupprimerNovembre(listeDateNovembre);
		}
		if(e.getSource() == btnRefresh) {
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
			this.panelPageNovembre.removeAll();
			this.panelPageNovembre.add(new PageNovembre(listeE51665, listeE51576, listeB50423, listeG09258, listeE51705, listeE51700, listeE5704, listeE51533, listeE51681, listeE51648, listeE51627, listeE51570, listeE51507, listeG04030, listeG03739, listeE51438, listeG03329, listeG09735, listeG02539, listeG02520, listeE51424, listeG09641, listeG09104, listeG09265, listeG01984, listeG02763, listeG09262, listeG09282, listeE51707, listeE51659, listeG03431, listeG03459, listeE51427, listeG03973, listeG09108, listeG03546, listeG03713, listeB50424, listeE51660, listeE51369, listeG01646, listeE51126, listeG09566, listeE51575, listeE51574, listeG03547, listeE51710, listeG09626, listeG02428, listeG01304, listeG01221, listeG00994, listeE51679, listeG03087, listeG09307, listeE51713, listeE51122, listeG09305, listeG02662, listeG09057, listeE51634, listeG02634, listeG09513, listeG09311, listeE51408, listeE51349, listeG09304, listeG02486, listeG09844, listeG01838, listeE51300, listeG09086, listeG09308, listeNovembre, listePersonnesProd, listePersonnesCoor, listePersonnesExplServ, listePersonnesPil, listePersonnesDBA,listePersonnesEditiqueEtArch, listePersonnes3pts, listePersonnesServDesk, listePersonnesChangMEP, listePersonnesInte, listePersonnesInteMF, listePersonnesInteOpen, listePersonnesFlux, listePersonnesSTE, listePersonnesSecurite, listePersonnesSECOP, listePersonnesRSI, listePersonnesSOC, listePersonnesArchiInfraSys, listePersonnesArchiTech, listePersonnesSysteme, listePersonnesRSB, listePersonnesReseaux, listePersonnesServBur, listePersonnesWindows, listePersonnesLinux).getMonPanelPageNovembre());
			this.panelPageNovembre.revalidate();
			this.panelPageNovembre.repaint();
		}
	}
}