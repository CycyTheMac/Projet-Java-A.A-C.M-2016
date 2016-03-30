
package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

public class PanelOccasion extends JPanel{
    
    private JButton boutonAfficherAttente;
    private JButton boutonAfficherReparations;
    private JButton boutonTrierPar;
    private JButton boutonAfficherDetails;
    private JList listeVehicules;
    private JPanel panelBoutonsGauche;
    private JPanel panelBoutonsDroite;
    private JPanel panelListe;
    
    
    public PanelOccasion(){
        
        setLayout(new GridLayout(1,3));
        
        // Initialisations
        
        listeVehicules = new JList();
        boutonAfficherAttente = new JButton("Afficher les fiches en attente de validation");
        boutonAfficherReparations = new JButton("Afficher les fiches en attente d'examination");
        boutonAfficherAttente.setToolTipText("N'afficher dans la liste que les fiches de véhicules qui sont en attente de validation");
        boutonAfficherReparations.setToolTipText("N'afficher dans la liste que les fiches de véhicules qui ont été validées et qui peuvent recevoir des réparations");
        boutonTrierPar = new JButton("Trier par ..");
        boutonAfficherDetails = new JButton("Afficher les détails de cette fiche");
        
        boutonAfficherReparations.setBounds(10,10,250,100);
        boutonAfficherAttente.setBounds(10,160,250,100);
        boutonTrierPar.setBounds(10,10,250,100);
        boutonAfficherDetails.setBounds(10,160,250,100);
        listeVehicules.setBounds(1,1,250,400);
        
        panelBoutonsGauche = new JPanel();
        panelBoutonsDroite = new JPanel();
        panelListe = new JPanel();
        panelBoutonsDroite.setLayout(null);
        panelBoutonsGauche.setLayout(null);
        panelListe.setLayout(null);
        // Ajouts
        
        panelBoutonsGauche.add(boutonAfficherAttente);
        panelBoutonsGauche.add(boutonAfficherReparations);
        
        panelListe.add(listeVehicules);
        
        panelBoutonsDroite.add(boutonTrierPar);
        panelBoutonsDroite.add(boutonAfficherDetails);
        
        add(panelBoutonsGauche);
        add(panelListe);
        add(panelBoutonsDroite);
    }
}
