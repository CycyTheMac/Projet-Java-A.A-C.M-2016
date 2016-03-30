
package dataAccess;


public class DataAccess {
    
    public void checkNomUtilisateur(String nomUtilisateur,String motDePasse) throws ExceptionNomUtilisateur{
        
        // Sera remplacé par un check dans la DB, en attendant, username et password = admin
        
        if (!nomUtilisateur.equals("admin") || !motDePasse.equals("admin")){
            throw new ExceptionNomUtilisateur();   
        }
    }
}
