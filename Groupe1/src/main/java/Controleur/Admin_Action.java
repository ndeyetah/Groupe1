/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Dao.ConnexionBase;
import Model.Admin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.html.parser.DTDConstants.ID;

/**
 *
 * @author DESKLAPRO
 */
public class Admin_Action{
    //Ajouter
    public void Admin_add(Admin A){
        try {
            ConnexionBase cb=new ConnexionBase();
            cb.connect();
            //requete
            String rep="insert into Admin(prenom,nom,login,password)values('"+A.getPrenom()+"','"+A.getNom()+"','"+A.getLogin()+"','"+A.getPassword()+"')";
            
            //EXECUTER
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
      //MODIFIER
        public void Admin_update(Admin A){
        try {
            //ajouter
            ConnexionBase cb=new ConnexionBase();
            cb.connect();
            //requete
            String rep="update Admin set Prenom='"+A.Prenom()+"',nom='"+A.Nom()+"',login='"+A.Login()+"',password='"+A.getPassword()+"'";
            
//EXCUTER
cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Action.class.getName()).log(Level.SEVERE, null, ex);
        }

            }
//Supprimer

         public void Admin_DEl (Admin A){
                
           try {
            ConnexionBase cb=new ConnexionBase();
            cb.connect();        
            //REQUETE
            String rep="'delete from Admin where ID ='"+ID+"'";
            

 
            //EXECUTER
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Action.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            
         }