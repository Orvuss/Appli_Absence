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
 * Classe PageJoursFeries
 * @author ldatchi
 *
 */
public class PageJoursFeries extends JPanel implements ActionListener{

	/**
	 * Attributs privés de la classe PageJoursFeries
	 */
	//Attributs privés
	//Panel
	private JPanel panelPageJoursFeries;
	private JPanel panelMessage;
	private JPanel panelChamps;
	
	//Label
	private JLabel lblMessage;
	private JLabel lblJoursFeries;
	private JLabel lblTotaux;


	//Constructeur
	public PageJoursFeries() {	
	    /**
	     * Instanciation de mes panels "panelPageJoursFeries", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Instanciation des panels
	    this.panelPageJoursFeries = new JPanel();
	    this.panelMessage = new JPanel();
	    this.panelChamps = new JPanel();

	    /**
	     * Mise en place des background des panels "panelPageJoursFeries", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Background des panels
	    this.panelPageJoursFeries.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);

	    /**
	     * Mise en place des dispositions des panels "panelPageJoursFeries", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Disposition des panels
	    this.panelPageJoursFeries.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());
	    this.panelChamps.setLayout(new FlowLayout());

	    /**
	     * Instanciation des label "lblMessage", "lblNomCircuit", "lblTailleCircuit", "lblPaysCircuit" et "lblInsertion"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("Les jours fériés");
	    this.lblMessage.setFont(new Font("Century Gothic", Font.BOLD, 15));
	    String tableauJF = "<html><br>\r\n"
	    		+ "	<table border=1 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<th>Date</th>\r\n"
	    		+ "			<th>Nom</th>\r\n"
	    		+ "			<th>Jour</th>\r\n"
	    		+ "			<th>Jour férié</th>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>01/01/2022</td>\r\n"
	    		+ "			<td>1er janvier</td>\r\n"
	    		+ "			<td>Samedi</td>\r\n"
	    		+ "			<td>0</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>17/04/2022</td>\r\n"
	    		+ "			<td>Pâques</td>\r\n"
	    		+ "			<td>Dimanche</td>\r\n"
	    		+ "			<td>0</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>18/04/2022</td>\r\n"
	    		+ "			<td>Lundi de Pâques</td>\r\n"
	    		+ "			<td>Lundi</td>\r\n"
	    		+ "			<td>1</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>26/05/2022</td>\r\n"
	    		+ "			<td>Ascension</td>\r\n"
	    		+ "			<td>Jeudi</td>\r\n"
	    		+ "			<td>1</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>06/06/2022</td>\r\n"
	    		+ "			<td>Lundi de pentecôte</td>\r\n"
	    		+ "			<td>Lundi</td>\r\n"
	    		+ "			<td>1</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>01/05/2022</td>\r\n"
	    		+ "			<td>1er Mai</td>\r\n"
	    		+ "			<td>Dimanche</td>\r\n"
	    		+ "			<td>0</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>08/05/2022</td>\r\n"
	    		+ "			<td>8 Mai</td>\r\n"
	    		+ "			<td>Dimanche</td>\r\n"
	    		+ "			<td>0</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>14/07/2022</td>\r\n"
	    		+ "			<td>14 Juillet</td>\r\n"
	    		+ "			<td>Jeudi</td>\r\n"
	    		+ "			<td>1</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>15/08/2022</td>\r\n"
	    		+ "			<td>15 Août</td>\r\n"
	    		+ "			<td>Lundi</td>\r\n"
	    		+ "			<td>1</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>01/11/2022</td>\r\n"
	    		+ "			<td>1er Novembre</td>\r\n"
	    		+ "			<td>Mardi</td>\r\n"
	    		+ "			<td>1</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>11/11/2022</td>\r\n"
	    		+ "			<td>11 Novembre</td>\r\n"
	    		+ "			<td>Vendredi</td>\r\n"
	    		+ "			<td>1</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>25/12/2022</td>\r\n"
	    		+ "			<td>Noël</td>\r\n"
	    		+ "			<td>Dimanche</td>\r\n"
	    		+ "			<td>0</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "	</table>\r\n"
	    		+ "</html>";
	    String tableauTotaux = "<html>\r\n"
	    		+ "	<table border=1 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<th>Total jours fériés</th>\r\n"
	    		+ "			<th>Total RTT</th>\r\n"
	    		+ "			<th>Total jours de solidarité</th>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>7</td>\r\n"
	    		+ "			<td>31</td>\r\n"
	    		+ "			<td>1</td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "	</table>\r\n"
	    		+ "</html>";
	    this.lblJoursFeries = new JLabel(tableauJF);
	    this.lblTotaux = new JLabel(tableauTotaux);

	    /**
	     * Mise en place de la couleur d'écriture des label "lblMessage", "lblNomCircuit", "lblTailleCircuit" et "lblPaysCircuit"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);
	    
	    /**
	     * Ajout des attributs à mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelPageJoursFeries.add(panelMessage, BorderLayout.PAGE_START);
	    this.panelPageJoursFeries.add(panelChamps, BorderLayout.CENTER);
	    
	    this.panelMessage.add(lblMessage);

	    this.panelChamps.add(lblJoursFeries);
	    this.panelChamps.add(lblTotaux);

	    //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
  		this.setVisible(true);
	}
	
	public JPanel getMonPanelPageJoursFeries() {
    	return panelPageJoursFeries;
    }
	
	/**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
        
	}
}