package Personnes;
import java.awt. * ;
import java.awt.event.ActionEvent;
import javax.swing. * ;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * Classe PagePersonnes
 * @author ldatchi
 *
 */
public class PagePersonnes extends JPanel implements ActionListener {

	/**
	 * Attributs privés de la classe PagePersonnes
	 */
	//Attributs privés
	//Panel
    private JPanel panelPagePersonnes;
    private JPanel panelMessage;
    private JPanel panelTableau;

    //Label
  	private JLabel lblMessage;

  	//Tableau
    private JTable tableau;
    
    //Scrollbar
    private JScrollPane scrollPane;

    //Constructeur
    public PagePersonnes(ArrayList<Personnes> listePersonnes) {
    	/**
	     * Instanciation de mes panels "panelPagePersonnes", "panelMessage" et "panelTableau"
	     */
    	//Instanciation des panels
    	this.panelPagePersonnes = new JPanel();
        this.panelMessage = new JPanel();
        this.panelTableau = new JPanel();

	    /**
	     * Mise en place des background des panels "panelPagePersonnes", "panelMessage" et "panelTableau"
	     */
        //Background des panels
	    this.panelPagePersonnes.setBackground(Color.white);
	    this.panelMessage.setBackground(Color.black);
	    this.panelTableau.setBackground(Color.white);
	    this.panelPagePersonnes.setBackground(SystemColor.activeCaption);

	    /**
	     * Mise en place des dispositions des panels "panelPagePersonnes", "panelMessage" et "panelTableau"
	     */
        //Disposition des panels
	    this.panelPagePersonnes.setLayout(new BorderLayout());
	    this.panelMessage.setLayout(new FlowLayout());
        this.panelTableau.setLayout(new FlowLayout());

	    /**
	     * Instanciation du label "lblMessage"
	     */
        //Instanciation des messages
	    this.lblMessage = new JLabel("Affichage du tableau des réservations des matériels.");
	    
	    /**
	     * Mise en place de la couleur d'écriture du label "lblMessage"
	     */
	 	//Couleur de la police
	    this.lblMessage.setForeground(Color.white);
      
	    /**
	     * Création du tableau pour afficher les éléments dans le tableau
	     */
	    //Tableau
        Object data[][] = new Object[75][4];
        int i = 0;
        for (Personnes maPersonnes: listePersonnes) {
            data[i][0] = maPersonnes.getNomPersonnel();
            data[i][1] = maPersonnes.getPrenomPersonnel();
            data[i][2] = maPersonnes.getServicePersonnel();
            data[i][3] = maPersonnes.getMatriculePersonnel();
            i++;
        }
        String[] title = {
            "Nom",
            "Prénom",
            "Service",
            "Matricules",
        };
        this.tableau = new JTable(data, title);
        this.tableau.setPreferredScrollableViewportSize(new Dimension(350, 300));

        /**
         * Mise en place de la taille du tableau
         */
        //Taille
        this.tableau.setRowHeight(30);

        /**
         * Mise en place de la barre de scroll
         */
        //Barre de scroll
        this.scrollPane = new JScrollPane(this.tableau);
        this.panelTableau.add(this.scrollPane);
        
	    /**
	     * Ajout des attributs à mes panels
	     */
        //Ajout des attributs aux panels
        this.panelPagePersonnes.add(panelMessage, BorderLayout.PAGE_START);

        this.panelMessage.add(lblMessage);
        
        //Toujours à la fin
  		/**
  		 * Rendu visible de l'app etc.. toujours à la fin de la classe
  		 */
        this.panelPagePersonnes.add(this.scrollPane);
    }

    /**
     * Permet de retourner le panel circuit pour l'affichage
     * @return
     */
    public JPanel getMonPanelPagePersonnes() {
    	return panelPagePersonnes;
    }
    
    /**
	 * Action performed permettant la navigation entre les différentes classe pour permettre l'affichage
	 */
    public void actionPerformed(ActionEvent e) {

    }

	public Component getMonPanelAfficherMaterielDirecteur() {
		// TODO Auto-generated method stub
		return null;
	}
}
