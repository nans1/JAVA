/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_sociale;

//import java.util.ArrayList;

/**
 *
 * @author nans.champiotbayard
 */
public class Reseau_Sociale {
   
    
   // private ArrayList<User> userss = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("**********Bienvenu sur mon appli inutile *****************");
        /**
         * Menu.createUser() fait appel à la methode de creation d'un
         * utilisateur dans la classe Menu          *
         */
        int reponse;
        //User users = new User();
        Menu menu = new Menu();
        do {
              
               User u  = menu.createUser();
               

                do {

                    //Creation user
                    // System.out.println(users.getNom());
                    //affichage du menu      
                    reponse = Menu.displayMenu(u);

                    //traitement demandé
                   menu.choice(reponse, u);

                } while (reponse != 0);
                
        } while (Menu.sortir() == 1);

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

