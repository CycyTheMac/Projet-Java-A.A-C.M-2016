
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class FenetreLogin extends JFrame {

    private JButton boutonConnexion;
    private JTextField fieldNomUtilisateur;
    private JPasswordField fieldMotDePasse;
    private JLabel labelNomUtilisateur;
    private JLabel labelMotDePasse;
    private Container container;
    private JPanel panelInformations;
    private JPanel panelBouton;
    private GestionnaireLogin gestionnaire;
    
    public FenetreLogin(){
        
        setBounds(500,400,350,200);
        this.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
        
        // INITIALISATIONS
        
        panelInformations = new JPanel();
        panelInformations.setLayout(new GridLayout(3,2,20,10));
        panelBouton = new JPanel();
        
        fieldNomUtilisateur = new JTextField();
        fieldMotDePasse = new JPasswordField();
        
        gestionnaire = new GestionnaireLogin(fieldNomUtilisateur,fieldMotDePasse,this);
        
        boutonConnexion = new JButton("Se connecter");
        boutonConnexion.addActionListener(gestionnaire);
        container = getContentPane();
        container.setLayout(new BorderLayout());
        labelNomUtilisateur = new JLabel("Nom d'utilisateur");
        labelMotDePasse = new JLabel("Mot de passe");
        
        //AJOUTS
        
        panelInformations.add(labelNomUtilisateur);
        panelInformations.add(fieldNomUtilisateur);
        panelInformations.add(labelMotDePasse);
        panelInformations.add(fieldMotDePasse);
        panelBouton.add(boutonConnexion);
        
        container.add(panelInformations,BorderLayout.CENTER);
        container.add(panelBouton,BorderLayout.SOUTH);
        
        getRootPane().setDefaultButton(boutonConnexion);
        setVisible(true);
    }
    
    public void infoCorrectes(){
        
        this.dispose();
        FenetrePrincipale w = new FenetrePrincipale();
    }
}
