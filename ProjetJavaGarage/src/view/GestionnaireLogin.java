
package view;

import controller.ExceptionLogin;
import controller.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GestionnaireLogin implements ActionListener {

    private JTextField username;
    private JTextField password;
    private FenetreLogin fenetre;
    private Controller controller;
    
    public GestionnaireLogin(JTextField u, JTextField p,FenetreLogin j){
        
        username = u;
        password = p;
        fenetre = j;
        controller = new Controller();
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if (username.getText().equals("") || password.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez remplir les deux champs","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try {
                controller.checkNomUtilisateur(username.getText(),password.getText());
                FenetrePrincipale f = new FenetrePrincipale();
                fenetre.dispose();
            }
            catch (ExceptionLogin exc){
                JOptionPane.showMessageDialog(null,exc.getMessage() , "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
