/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class Admin {
    private int ID;
     private String Prenom;
      private String Nom;
       private String Login;
        private String Password;

    public int getID() {
        return ID;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }

    public Admin(String Prenom, String Nom, String Login, String password) {
        this.Prenom = Prenom;
        this.Nom = Nom;
        this.Login = Login;
        this.Password = password;
    }

    public Admin(int ID, String Prenom, String Nom, String Login, String password) {
        this.ID = ID;
        this.Prenom = Prenom;
        this.Nom = Nom;
        this.Login = Login;
        this.Password = password;
    }

    public Admin() {
    }

    public String Prenom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public String Nom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
