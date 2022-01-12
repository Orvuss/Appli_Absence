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
//Pour git

/**
 * Classe PageAffectation
 * @author ldatchi
 *
 */
public class PageAffectation extends JPanel implements ActionListener{

	/**
	 * Attributs privés de la classe PageAffectation
	 */
	//Attributs privés
	//Panel
	private JPanel panelPageAffectation;
	private JPanel panelMessage;
	private JPanel panelChamps;
	
	//Label
	private JLabel lblMessage;
	private JLabel lblAffectation;
	private JLabel lblAffectation2;
	private JLabel lblAffectation3;

	//Constructeur
	public PageAffectation() {	
	    /**
	     * Instanciation de mes panels "panelPageAffectation", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Instanciation des panels
	    this.panelPageAffectation = new JPanel();
	    this.panelMessage = new JPanel();
	    this.panelChamps = new JPanel();

	    /**
	     * Mise en place des background des panels "panelPageAffectation", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Background des panels
	    this.panelPageAffectation.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);

	    /**
	     * Mise en place des dispositions des panels "panelPageAffectation", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Disposition des panels
	    this.panelPageAffectation.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());
	    this.panelChamps.setLayout(new FlowLayout());

	    /**
	     * Instanciation des label "lblMessage", "lblNomCircuit", "lblTailleCircuit", "lblPaysCircuit" et "lblInsertion"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("Affectation");
	    this.lblMessage.setFont(new Font("Century Gothic", Font.BOLD, 15));
	    String tableau = "<html>\r\n"
	    		+ "	<table border=1 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<th>Raccourci</th>\r\n"
	    		+ "			<th>Signification</th>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#E434DB'>tp</td>\r\n"
	    		+ "			<td>Temps partiel</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#2FE4D8'>c</td>\r\n"
	    		+ "			<td>Congé annuel prévu</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#2FE4D8'>cet</td>\r\n"
	    		+ "			<td>Compte épargne temps</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#215CBE'>c</td>\r\n"
	    		+ "			<td>Congé annuel validé (et cet)</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#37E73E'>r</td>\r\n"
	    		+ "			<td>RTT prévue</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#26992A'>r</td>\r\n"
	    		+ "			<td>RTT validé</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#891B3C'>rh</td>\r\n"
	    		+ "			<td>Récup, heures supp</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#F8F00A'>rc</td>\r\n"
	    		+ "			<td>Repos compensateur</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor=\"#C485BF\">mal</td>\r\n"
	    		+ "			<td>Maladie</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor=\"#ED9B4E\">mat</td>\r\n"
	    		+ "			<td>Congé de maternité</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>tt</td>\r\n"
	    		+ "			<td>Télétravail</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor=\"#F3CBA5\">f</td>\r\n"
	    		+ "			<td>Formation</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor=\"#8F6498\"> </td>\r\n"
	    		+ "			<td>Travail en accès distant</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "	</table>\r\n"
	    		+ "</html>";
	    String tableau2 = "<html>\r\n"
	    		+ "	<table border=1 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<th>Raccourci</th>\r\n"
	    		+ "			<th>Signification</th>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>EMA</td>\r\n"
	    		+ "			<td>Enfant malade</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>EMH</td>\r\n"
	    		+ "			<td>Hospitalist enft</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>MDC</td>\r\n"
	    		+ "			<td>Mariage de l'agent</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>MEN</td>\r\n"
	    		+ "			<td>Mariage d'un enfant</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>MDE</td>\r\n"
	    		+ "			<td>Mariage descendant</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>TPM</td>\r\n"
	    		+ "			<td>Tps partiel médical</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>TPM</td>\r\n"
	    		+ "			<td>Accident de trajet</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>ATW</td>\r\n"
	    		+ "			<td>Accident de travail</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>CRH</td>\r\n"
	    		+ "			<td>Jour de fractionnement</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "	</table>"
	    		+ "<table border=1 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#F68BF0'>aa</td>\r\n"
	    		+ "			<td>Pour toutes autres absences ce-dessus</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "	</table>\r\n"
	    		+ "</html>";
	    String tableau3 = "<html>\r\n"
	    		+ "	<table border=1 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<th>Raccourci</th>\r\n"
	    		+ "			<th>Signification</th>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>DCO</td>\r\n"
	    		+ "			<td>Décès conjoint</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>DDA</td>\r\n"
	    		+ "			<td>Décès grands-parents</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>DEN</td>\r\n"
	    		+ "			<td>Décès enfant</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>DPM</td>\r\n"
	    		+ "			<td>Décès parents</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>DFS</td>\r\n"
	    		+ "			<td>Décès frère/soeur</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>DBF</td>\r\n"
	    		+ "			<td>Décès beau-frère/belle-soeur</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>DMG</td>\r\n"
	    		+ "			<td>Déménagement</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>NAI</td>\r\n"
	    		+ "			<td>Congé paternité</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>MDL</td>\r\n"
	    		+ "			<td>Mandat législatif</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>MSD</td>\r\n"
	    		+ "			<td>Mandat syndical</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "	</table>"
	    		+ "<table border=1 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#F5A2F0'>a</td>\r\n"
	    		+ "			<td>Pour toute absence d'un collaborateur externe</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "	</table>\r\n"
	    		+ "</html>";
	    this.lblAffectation = new JLabel(tableau);
	    this.lblAffectation2 = new JLabel(tableau2);
	    this.lblAffectation3 = new JLabel(tableau3);

	    /**
	     * Mise en place de la couleur d'écriture des label "lblMessage", "lblNomCircuit", "lblTailleCircuit" et "lblPaysCircuit"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);
	    
	    /**
	     * Ajout des attributs à mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelPageAffectation.add(panelMessage, BorderLayout.PAGE_START);
	    this.panelPageAffectation.add(panelChamps, BorderLayout.CENTER);
	    
	    this.panelMessage.add(lblMessage);

	    this.panelChamps.add(lblAffectation);
	    this.panelChamps.add(lblAffectation2);
	    this.panelChamps.add(lblAffectation3);

	    //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
  		this.setVisible(true);
	}
	
	public JPanel getMonPanelPageAffectation() {
    	return panelPageAffectation;
    }
	
	/**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
        
	}
}