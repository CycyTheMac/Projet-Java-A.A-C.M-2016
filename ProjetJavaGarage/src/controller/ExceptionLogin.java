/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Arthur
 */
public class ExceptionLogin extends Exception {
    
    public String getMessage(){
        return "Nom d'utilisateur ou mot de passe incorrect";
    }
}
