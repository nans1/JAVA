/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_sociale;



/**
 *
 * @author nans.champiotbayard
 */
public class Reseau_Sociale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("**********Bienvenu sur mon appli inutile *****************");
       /** 
        * Menu.createUser() fait appel à la methode de creation d'un utilisateur dans la classe Menu 
        
        */
       User users = Menu.createUser();
       
       do
       {
       
       //Creation user
     
                 
                
               // System.out.println(users.getNom());
       
          //affichage du menu      
          int reponse = Menu.displayMenu();
          
                       
           //traitement demandé
          
           Menu.choice(reponse,users);
           
       }while (Menu.exit() == 1);
           
       
                 
              
                
                
            }
       
      
        
}



//Le programme commence par vous demander les informations pour créer l’utilisateur correspondant. 
//Il propose ensuite plusieurs choix d’actions :
//Afficher votre profil ? (nom, prénom, etc.) 
//Modifier vos infos personnelles ?
//Ecrire un message ? (on suppose que l’on a un tableau de messages pour chaque utilisateur, qui est un tableau de String) 
//Afficher un message ?
//Ajouter un ami ? (on suppose que l’on a un tableau d’amis, qui est un tableau de String)
//Voulez-vous afficher le nom d’un ami ?
//Faire la saisie de plusieurs utilisateurs (boucle) jusqu’à ce que l’utilisateur choisisse de quitter le programme.  



