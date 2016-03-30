
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class FenetrePrincipale extends JFrame {
    
    private JMenuBar menuBar;
    private JTabbedPane onglets;
    private Container cont;
    private JPanel panelTransport;
    private JPanel panelOccasion;
    private JPanel panelPrepose;
    
    public FenetrePrincipale(){
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        
        panelTransport = new JPanel();
        panelOccasion = new PanelOccasion();
        panelPrepose = new JPanel();
        setBounds(10,10,1000,500);
        this.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
        
        // Initialisations
        
        cont = getContentPane();
        cont.setLayout(new BorderLayout());
        
        panelTransport = new JPanel();
        panelOccasion = new PanelOccasion();
        panelPrepose = new JPanel();
        
        onglets = new JTabbedPane();
        
        onglets.insertTab("Responsable Occasions",null,panelOccasion,"Occasions",0);
        onglets.insertTab("Transporteur",null,panelTransport,"Transporteur",1);
        onglets.insertTab("Préposé Achat",null,panelPrepose,"Achat",2);
        
        // Ajouts
        cont.add(onglets,BorderLayout.CENTER);
        
        setVisible(true);
    }
}
