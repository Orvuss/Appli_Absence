package Secondaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;

import Mois.PageJanvier;
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
	private JLabel lblCommentaire;
	private JLabel lblDateDebut;
	private JLabel lblDateFin;
	private JLabel lblAffectation;
	private JLabel lblAutreAbsence;

	//JComboBox
	private JComboBox jcbAffectation;
	private JComboBox jcbAutreAbsence;

	//JDatePicker
	private JDatePickerImpl datePicker1;
	private JDatePickerImpl datePicker2;
	
	//JButton
	private JButton btnValider;
	private JButton btnQuitter;
	
	//Constructeur
	public PageAjouter() {
		//Configuration
		/**
		 * Titre, localisation, taille etc.. indispensable au début de chaque page IHM
		 */
	    this.setTitle("Ajouter");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(320, 300);
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

	    this.lblCommentaire = new JLabel("Voir page commentaire si nécessaire");
	    this.lblDateDebut = new JLabel("Date de debut : ");
	    this.lblDateFin = new JLabel("Date de fin : ");
	    this.lblAffectation = new JLabel("Choisissez l'affectation : ");
	    this.lblAutreAbsence = new JLabel("Pour autres absences : ");
	    
	    //DatePickerDebut
        SqlDateModel model = new SqlDateModel();
        Properties p = new Properties();
        p.put("text.day", "Day");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl panel = new JDatePanelImpl(model,p);
        this.datePicker1 = new JDatePickerImpl(panel, new DateLabelFormatter());
        this.datePicker1.setMaximumSize(new Dimension(150,30));
	    
        //DatePickerFin
        SqlDateModel model2 = new SqlDateModel();
        Properties p2 = new Properties();
        p2.put("text.day", "Day");
        p2.put("text.month", "Month");
        p2.put("text.year", "Year");
        JDatePanelImpl panel2 = new JDatePanelImpl(model2,p2);
        this.datePicker2 = new JDatePickerImpl(panel2, new DateLabelFormatter());
        this.datePicker2.setMaximumSize(new Dimension(150,30));
	    
	    String affectation[] = {
	    	"<html><p></p></html>",
	    	"<html><p bgcolor='#E434DB' color='black'>tp</p></html>", 
	    	"<html><p bgcolor='#2FE4D8' color='black'>c</p></html>",
	    	"<html><p bgcolor='#2FE4D8' color='black'>cet</p></html>",
	    	"<html><p bgcolor='#215CBE' color='white'>c</p></html>",
	    	"<html><p bgcolor='#37E73E' color='black'>r</p></html>",
	    	"<html><p bgcolor='#26992A' color='black'>r</p></html>", 
	    	"<html><p bgcolor='#891B3C' color='white'>rh</p></html>", 
	    	"<html><p bgcolor='#F8F00A' color='black'>rc</p></html>", 
	    	"<html><p bgcolor='#C485BF' color='black'>mal</p></html>",
	    	"<html><p bgcolor='#ED9B4E' color='black'>mat</p></html>",
	    	"<html><p>≡≡≡</p></html>",
	    	"<html><p bgcolor='#F3CBA5' color='black'>f</p></html>",
	    	"<html><p bgcolor='#8F6498' color='white'>tac</p></html>"
		  }; 
	    this.jcbAffectation = new JComboBox(affectation);
	    this.jcbAffectation.setPreferredSize(new Dimension(50, 30));
	    
	    String autreAbsence[] = {
		    	"<html><p></p></html>",
		    	"<html><p bgcolor='#F68BF0' color='black'>aa</p></html>", 
		    	"<html><p>EMA</p></html>",
		    	"<html><p>EMH</p></html>",
		    	"<html><p>MDC</p></html>",
		    	"<html><p>MEN</p></html>",
		    	"<html><p>MDE</p></html>", 
		    	"<html><p>TPM</p></html>", 
		    	"<html><p>TPM</p></html>", 
		    	"<html><p>ATW</p></html>",
		    	"<html><p>CRH</p></html>",
		    	"<html><p>DCO</p></html>",
		    	"<html><p>DDA</p></html>",
		    	"<html><p>DEN</p></html>",
		    	"<html><p>DPM</p></html>",
		    	"<html><p>DFS</p></html>",
		    	"<html><p>DBF</p></html>",
		    	"<html><p>DMG</p></html>",
		    	"<html><p>NAI</p></html>",
		    	"<html><p>MDL</p></html>",
		    	"<html><p>MSD</p></html>",
		    	"<html><p bgcolor='#F5A2F0'>a</p></html>"
			  }; 
		    this.jcbAutreAbsence = new JComboBox(autreAbsence);
		    this.jcbAutreAbsence.setPreferredSize(new Dimension(50, 30));
	    
	    /**
	     * Instanciation du bouton "btnQuitter" et écoute du bouton
	     */
	    //Instanciation du bouton
	    this.btnValider = new JButton("Valider");
	    this.btnValider.addActionListener(this);
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
	    
	    this.panelChamps.add(lblCommentaire);
	    this.panelChamps.add(lblDateDebut);
	    this.panelChamps.add(datePicker1);
	    this.panelChamps.add(lblDateFin);
	    this.panelChamps.add(datePicker2);
	    this.panelChamps.add(lblAffectation);
	    this.panelChamps.add(jcbAffectation);
	    this.panelChamps.add(lblAutreAbsence);
	    this.panelChamps.add(jcbAutreAbsence);

	    this.panelBouton.add(btnValider);
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
		String jtfRecupLettre;
		if(e.getSource() == btnValider) {
            java.sql.Date uneDateDebut = (java.sql.Date) PageAjouter.this.datePicker1.getModel().getValue();
            java.sql.Date uneDateFin = (java.sql.Date) PageAjouter.this.datePicker2.getModel().getValue();
//			if(uneDateHeureDebut == "1") {
//				System.out.println("Premier test");
//				jtfRecupLettre = jcbLettre.getSelectedItem().toString();
//				System.out.println(jtfRecupLettre);
//			}
//			if(nbJcbJourSelec == "2") {
//				System.out.println("Deuxième test");
//				jtfRecupLettre = jcbLettre.getSelectedItem().toString();
//				System.out.println(jtfRecupLettre);
//			}
		}
		if(e.getSource() == btnQuitter) {
			this.dispose();
		}
	}
}
