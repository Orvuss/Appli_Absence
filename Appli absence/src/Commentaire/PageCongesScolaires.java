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
 * Classe PageCongesScolaires
 * @author ldatchi
 *
 */
public class PageCongesScolaires extends JPanel implements ActionListener{

	/**
	 * Attributs privés de la classe PageCongesScolaires
	 */
	//Attributs privés
	//Panel
	private JPanel panelPageCongesScolaires;
	private JPanel panelMessage;
	private JPanel panelChamps;
	
	//Label
	private JLabel lblMessage;
	private JLabel lblCongesScolaires;

	//Constructeur
	public PageCongesScolaires() {	
	    /**
	     * Instanciation de mes panels "panelPageCongesScolaires", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Instanciation des panels
	    this.panelPageCongesScolaires = new JPanel();
	    this.panelMessage = new JPanel();
	    this.panelChamps = new JPanel();

	    /**
	     * Mise en place des background des panels "panelPageCongesScolaires", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Background des panels
	    this.panelPageCongesScolaires.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);

	    /**
	     * Mise en place des dispositions des panels "panelPageCongesScolaires", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Disposition des panels
	    this.panelPageCongesScolaires.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());
	    this.panelChamps.setLayout(new FlowLayout());

	    /**
	     * Instanciation des label "lblMessage", "lblNomCircuit", "lblTailleCircuit", "lblPaysCircuit" et "lblInsertion"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("Congés scolaires");
	    this.lblMessage.setFont(new Font("Century Gothic", Font.BOLD, 15));
	    String tableau = "<html>\r\n"
	    		+ "	<table border=1 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th bgcolor='#F6D309' colspan=\"2\">Zone B(Mer)</th>\r\n"
	    		+ "			<th bgcolor='#DDA70B' colspan=\"2\">Zone C(Paris)</th>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Périodes</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>Début</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>Fin</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>Début</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>Fin</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Vacances de Noël(Janvier)</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>01/01/2022</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>02/01/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>01/01/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>02/01/2022</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Vacances d'hiver</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>05/02/2022</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>20/02/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>19/02/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>06/03/2022</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Vacances de printemps</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>09/04/2022</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>24/04/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>23/04/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>08/05/2022</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Vacances d'été</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>07/07/2022</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>31/08/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>07/07/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>31/08/2022</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Vacances de la Toussaint</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>22/10/2022</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>06/11/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>22/10/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>06/11/2022</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Vacances de Noël(Décembre)</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>17/12/2022</td>\r\n"
	    		+ "			<td bgcolor='#D2FBD5'>03/01/2023</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>17/12/2022</td>\r\n"
	    		+ "			<td bgcolor='#E9C869'>03/01/2023</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td bgcolor='#F6D309' colspan=\"2\">B</td>\r\n"
	    		+ "			<td bgcolor='#DDA70B' colspan=\"2\">C</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td bgcolor='#F07D00' colspan=\"4\">BC(Zones communes)</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "	</table>\r\n"
	    		+ "</html>";
	    this.lblCongesScolaires = new JLabel(tableau);

	    /**
	     * Mise en place de la couleur d'écriture des label "lblMessage", "lblNomCircuit", "lblTailleCircuit" et "lblPaysCircuit"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);
	    
	    /**
	     * Ajout des attributs à mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelPageCongesScolaires.add(panelMessage, BorderLayout.PAGE_START);
	    this.panelPageCongesScolaires.add(panelChamps, BorderLayout.CENTER);
	    
	    this.panelMessage.add(lblMessage);

	    this.panelChamps.add(lblCongesScolaires);

	    //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
  		this.setVisible(true);
	}
	
	public JPanel getMonPanelPageCongesScolaires() {
    	return panelPageCongesScolaires;
    }
	
	/**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
        
	}
}