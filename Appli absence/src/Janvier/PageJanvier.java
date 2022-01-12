package Janvier;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextArea;
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
import javax.swing.JTable;
import javax.swing.JTextField;

import Personnes.Personnes;
import Personnes.PersonnesProduction;

/**
 * Classe PageJanvier
 * @author ldatchi
 *
 */
public class PageJanvier extends JPanel implements ActionListener{
	//Pour git

	/**
	 * Attributs privés de la classe PageJanvier
	 */
	//Attributs privés
	//Panel
	private JPanel panelPagejanvier;
	private JPanel panelMessage;
	private JPanel panelChamps;
		
	//Label
	private JLabel lblMessage;
	private JLabel lblALire;
	

	//Constructeur
	public PageJanvier(ArrayList<PersonnesProduction> listePersonnesProd, ArrayList<PersonnesProduction> listePersonnesCoor) {	
	    /**
	     * Instanciation de mes panels "panelPagejanvier", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Instanciation des panels
	    this.panelPagejanvier = new JPanel();
	    this.panelMessage = new JPanel();
	    this.panelChamps = new JPanel();

	    /**
	     * Mise en place des background des panels "panelPagejanvier", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Background des panels
	    this.panelPagejanvier.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);

	    /**
	     * Mise en place des dispositions des panels "panelPagejanvier", "panelMessage", "panelBtnQuitter" et "panelChamps"
	     */
	    //Disposition des panels
	    this.panelPagejanvier.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());
	    this.panelChamps.setLayout(new FlowLayout());

	    /**
	     * Instanciation des label "lblMessage", "lblNomCircuit", "lblTailleCircuit", "lblPaysCircuit" et "lblInsertion"
	     */
	    //Instanciation des messages
	    this.lblMessage = new JLabel("À lire attentivement !");
	    this.lblMessage.setFont(new Font("Century Gothic", Font.BOLD, 15));

	    /**
	     * Mise en place de la couleur d'écriture des label "lblMessage", "lblNomCircuit", "lblTailleCircuit" et "lblPaysCircuit"
	     */
	    //Couleur de la police
	    this.lblMessage.setForeground(Color.white);
	    
	    
	    String resultatProd = "";
        for (PersonnesProduction maPersonneProd: listePersonnesProd) {
        	resultatProd += maPersonneProd.toString();
        }
        String resultatCoor = "";
        for (PersonnesProduction maPersonneCoor: listePersonnesCoor) {
        	resultatCoor += maPersonneCoor.toString();
        }
        
        
        
	    String texte = "<html>\r\n"
	    		+ "	<table border=0 align='center'>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<th>2022</th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th bgcolor='#E5600F'>BC</th>\r\n"
	    		+ "			<th bgcolor='#E5600F'>BC</th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "			<th> </th>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>Janvier</td>\r\n"
	    		+ "			<td> </td>\r\n"
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
	    		+ "			<td bgcolor='#28C7E3'>31</td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#1A1680' color='white'>Production</td>\r\n"
	    		+ "			<td bgcolor='#1A1680'></td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "			<td bgcolor='#1A1680'> </td>\r\n"
	    		+ "		</tr>\r\n"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>" + resultatProd + "</td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "		</tr>"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td bgcolor='#F6D309' color='black'>Exploitation & Services</td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "			<td> </td>\r\n"
	    		+ "		</tr>"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>" + resultatCoor + "</td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "		</tr>"
	    		+ "		<tr align='center'>\r\n"
	    		+ "			<td>" + resultatCoor + "</td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td bgcolor='#28C7E3'></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "			<td></td>\r\n"
	    		+ "		</tr>"
	    		+ "	</table>\r\n"
	    		+ "</html>";
	    
	    this.lblALire = new JLabel(texte);

	    
	    
	    
	    
	    /**
	     * Ajout des attributs à mes panels
	     */
	    //Ajout des attributs aux panels
	    this.panelPagejanvier.add(panelMessage, BorderLayout.PAGE_START);
	    this.panelPagejanvier.add(panelChamps, BorderLayout.CENTER);
	    
	    this.panelMessage.add(lblMessage);

	    this.panelChamps.add(lblALire);


	    //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
  		this.setVisible(true);
	}
	
	public JPanel getMonPanelPageJanvier() {
    	return panelPagejanvier;
    }
	
	/**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
	public void actionPerformed(ActionEvent e) {
	}
}