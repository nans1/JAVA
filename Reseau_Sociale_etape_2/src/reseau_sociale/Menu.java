/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_sociale;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nans.champiotbayard
 */
//******************************************************************************   Menu principale
public class Menu {
    
     private ArrayList<User> userss = new ArrayList();
    //User users = new User();
    private static Scanner sc = new Scanner(System.in);
//******************************************************************************
  
       
   
    //************************************************************* Creation User 
    
        public  User  createUser(){
        
           
        
        
        System.out.println("veuillez saisir votre date de naissance : ");
        int brd = sc.nextInt();   // nextInt ne prend pas en compte les retour ligne ajoutez un nextLine

        sc.nextLine();
        System.out.println("***********************************************");
        System.out.println("veuillez saisir prenom : ");
        String prn = sc.nextLine(); 

        System.out.println("***********************************************");
        System.out.println("veuillez saisir votre nom : ");
        String nm = sc.nextLine();
        System.out.println("***********************************************");

        System.out.println("***********************************************");
        System.out.println(" Bienvenue : " + prn + "  " + nm);  // reponse 
        //System.out.println(" Age : " + brd);
        System.out.println("***********************************************");

        System.out.println("***********************************************");
        System.out.println("etes vous Utilisateur ou MODERATEUR : (1/2) ");
        int drt = sc.nextInt();
        sc.nextLine();
        System.out.println("***********************************************");
        
         if (drt == 1) {
        
             User users = new User(nm,prn,brd);
        this.userss.add(users);
        
        System.out.println(this.userss.get(0).getNom());
              System.out.println( "regarde ici :" + userss.size());
        return users;
        }
         else {
         
                System.out.println("***********************************************");
                System.out.println("MODERATEUR de quel niveaux ? : (1/2) ");
                int lvl = sc.nextInt();
                sc.nextLine();
                System.out.println("***********************************************");

               User moderateurs = new Moderateur(nm, prn, brd, lvl);
               this.userss.add(moderateurs);
               System.out.println(this.userss.get(0).getNom());
                System.out.println("regarde la potos :   " + userss.size());
        
               return moderateurs;
          
         }
         
        
        //return  int brd,String prn,String nm,int drt;
    }
//********************************************************************************
        
        
           public  void deleteUser() {
            System.out.println("nombre de user : " + userss.size());
           

            for (int i = 0; i < userss.size(); i++) {

            //message.getContent();
            //System.out.println(messages);
            
            System.out.println( "utilisateur num :  " + i +  "    prenom :  " + userss.get(i).getPrenom() + "   nom :  " + userss.get(i).getNom());
           

        }
            
            System.out.println("******************************************************" );
             System.out.println(" choisir le numéro du profil à supprimé : " );
            int chx = sc.nextInt();
            sc.nextLine();
            userss.remove(chx);
    }
         
         
        
    //*****************************************************************************  // SOUS Menu message  
    public static int displayMenu(User users) {
        int reponse;
        do {
             System.out.println("-------------------------------------------------------------------------------------------------------------------");
            System.out.println("Affiché mon profil   (1) ");
             System.out.println("---------------------------");
            System.out.println("Modifié mon profil   (2)");
             System.out.println("---------------------------");
            System.out.println("Ecrire un message    (3) ");
             System.out.println("---------------------------");
            System.out.println("Affiché un message   (4)");
             System.out.println("---------------------------");
            System.out.println("Ajoutez un amis      (5)");
             System.out.println("---------------------------");
            System.out.println("Affiche amis         (6)");
             System.out.println("---------------------------");
            System.out.println("Supprimer un message (7)");
             System.out.println("---------------------------");
             //System.out.println(((Moderateur)users).getLevel());
            if(users.getClass().getName().equals("reseau_sociale.Moderateur"))
            {
                System.out.println("*------Fonction Moderateur-----*");
                System.out.println("---------------------------");
                System.out.println("supprimé un message utilisateur (8)"); 
                System.out.println("-------------------------------------");
               if ( ((Moderateur)users).getLevel() ==  2)
                {
                    System.out.println("supprimé un utilisateur         (9)"); 
                    System.out.println("************************************");
                }
               
            }
            
             System.out.println("Quitté ou crée un new User (0)"); 
             System.out.println("*********************************************************************************************************************");
             
             reponse = sc.nextInt();
             sc.nextLine();
            return reponse;
        } while (reponse != 0);
    }

  
    
    
    
    //****************************************************************************  // Menu / Sous Menu //
    /**
     * @param rep
     * @param users
     * @Methode choice @param reponse + User users choix des methodes de
     * modification et de creation Switch case
     */
    public  void choice(int rep, User users) {

        switch (rep) {

            case 1:

                System.out.println("affichage profil");
                System.out.println("Mon profil : ");
                System.out.println("------------------⦅⦿⦿⦆--------------------");
                System.out.println(users.getPrenom() + "  " + users.getNom());
                System.out.println(users.getAge());
                break;
            case 2:
                System.out.println("modif profil");
                modif_profil(rep, users);
                break;
            case 3:
                System.out.println("créer messsage");
                users.createMessage();
                //System.out.println(message.getTitle);

                break;
            case 4:
                System.out.println("afficher message");

                users.viewMessage();

                break;
            case 5:
                System.out.println("ajout d'amis");

                users.addFriend();
                //System.out.println(message.getContent() + "titre : " + message.getTitle() + "  message : ");

                break;

            case 6:
                System.out.println(" Mes amis  <**>---<**> ");

                users.viewFriend();
                //System.out.println(message.getContent() + "titre : " + message.getTitle() + "  message : ");

                break;
                
             case 7:
                   System.out.println("supprimé Mes message");       
                break;

             case 8:
               if(users.getClass().getName().equals("reseau_sociale.Moderateur"))
               {
              
                        System.out.println("suppression Message moderateur niv 2/1 ");
                        users.deleteMessage();
                        //afficher la liste des messages
                        //demander leuel voulez vous supprimer ?
                        //supprimer
               
               }

                break;
                
                
             case 9:
               if(users.getClass().getName().equals("reseau_sociale.Moderateur"))
               {
                 if ( ((Moderateur)users).getLevel() ==  2)
                 {        
                        System.out.println("suppression User moderateur niv 2");
                        //afficher la liste des utilisateurs 
                        //deleteUser();
                        //demander leuel voulez vous supprimer ?
                        //supprimer
                        deleteUser();
                 }
               }

                break;
                
                
            default:
                System.out.println("--------------------------                  ------------------------------");
                break;
        }

    }

    //****************************************************************************    EXIT
    /**
     * @return @Methode exit() permet de quitté l'application @return retour
     * (int).
     */
    public static int sortir() {
        System.out.println("Voulez vous creer un nouvel utilisateur (1)     ou quitté l'application (0)");
        int retour = sc.nextInt();
        //sc.nextLine();
        return retour;
    }

    //***************************************************************************   Modif Profil  
    /**
     * @param rep
     * @param myUser
     * @Methode modif_profil permet la modification du profil de @see User ,
     * parametre reponse + user
     *
     */
    public static void modif_profil(int rep, User myUser) {
        System.out.println("modifié nom (1) "
                + "/n Modifié mon prenom (2)" + " /n Modifié mon age (3)");
        rep = sc.nextInt();
        sc.nextLine();

        switch (rep) {

            case 0:

                System.out.println("affichage profil");
                System.out.println("Mon profil : ");
                System.out.println("------------------⦅⦿⦿⦆--------------------");
                System.out.println(myUser.getPrenom() + "  " + myUser.getNom());
                System.out.println(myUser.getAge());
                break;
            case 1:
                System.out.println("veuillez resaisir nom : ");
                myUser.setNom(sc.next());
                // sc.nextLine();
                System.out.println("votre nouveau nom : " + myUser.getNom());

                break;
            case 2:
                System.out.println("veuillez saisir prenom : ");
                myUser.setPrenom(sc.next());
                System.out.println("votre nouveau prenom : " + myUser.getPrenom());
                break;
            case 3:
                System.out.println("veuillez resaisir votre age : ");
                myUser.setAge(sc.nextInt());
                sc.nextLine();
                System.out.println("votre nouveau Age : " + myUser.getAge());
                break;

            default:
                System.out.println("erreur");
                 break;
        }

    }
    //**************************************************************************
    //static void choice(int reponse, User users, String[][] message) {
    //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //  }
}
