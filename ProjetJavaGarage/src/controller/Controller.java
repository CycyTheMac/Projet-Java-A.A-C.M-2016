
package controller;
import dataAccess.*;

public class Controller {
    
    private DataAccess dataAccess;
    
    public Controller(){
        dataAccess = new DataAccess();
    }
    
    public void checkNomUtilisateur(String username, String motDePasse) throws ExceptionLogin{
        
        try {
            dataAccess.checkNomUtilisateur(username,motDePasse);
        }
        catch (ExceptionNomUtilisateur exc){
            throw new ExceptionLogin();
        }
    }
} 