/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseau_sociale;

import java.util.Scanner;

/**
 *
 * @author nans.champiotbayard
 */
//******************************************************************************   Menu principale
public class Menu {
    
    User users = new User();
    private  static Scanner sc = new Scanner(System.in);  
    
   public static User createUser()
   {
  
         System.out.println("cree votre profil :");

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
                System.out.println(" Bienvenue : " + prn  + "  " + nm);  // reponse 
                //System.out.println(" Age : " + brd);
                System.out.println("***********************************************");
                
                 
                User users; 
                users = new User();
                         
                users.setNom(nm);
                users.setPrenom(prn);
                users.setAge(brd);
                
                return users;
   }
   
  
 //*****************************************************************************  // SOUS Menu message  
    public static int displayMenu()
   {
       int reponse;
     do
     {
       System.out.println("Affiché mon profil (1) "
                        + "Modifié mon profil (2)");
                 
                        System.out.println("ecrire un message (3) "
                        + "affiché un message (4)");
                         System.out.println("Ajoutez un amis (5)" 
                        + "  affiche amis  (6)" + "     // quitter (7)");
         reponse = sc.nextInt();
        sc.nextLine();
        return reponse;
     
        }while (reponse != 7);
   }
    
 //*****************************************************************************  // Creation de messages
 
    
  //****************************************************************************  // Menu / Sous Menu
    
      
            /**   
             *@Methode choice @param reponse + User users choix des methodes de modification et de creation Switch case 
             */
    public static void choice (int rep,User users)
          
          
    {
       
        switch (rep){
                 
                case  1:
                    
                    System.out.println("affichage profil");
                    System.out.println("Mon profil : ");
                    System.out.println("------------------⦅⦿⦿⦆--------------------");
                    System.out.println( users.getPrenom() + "  " + users.getNom());
                    System.out.println(users.getAge());
                     break;  
                case  2:
                    System.out.println("modif profil");
                    modif_profil(rep,users);
                     break;  
                 case  3:
                     System.out.println("créer messsage");
                     users.createMessage();
                     //System.out.println(message.getTitle);
                    
                     break;  
                case  4:
                    System.out.println("afficher message");
                    
                    users.viewMessage();
                    
                    
                     break;
                 case  5:
                    System.out.println("ajout d'amis");
                   
                    users.addFriend();
                    //System.out.println(message.getContent() + "titre : " + message.getTitle() + "  message : ");
                    
                     break;
                     
                   case  6:
                    System.out.println(" Mes amis  <**>---<**> ");
                   
                    users.viewFriend();
                    //System.out.println(message.getContent() + "titre : " + message.getTitle() + "  message : ");
                    
                     break;
                   
                default:
                    System.out.println("erreur");
                    exit();
                    break;
          }
      
    }   
        
  //****************************************************************************    EXIT
    
    /**  
     *@Methode exit() permet de quitté l'application @return retour (int).
     */
    public static int exit()
    {
        System.out.println("Voulez vous quitter oui / non (0/1)");
        int retour = sc.nextInt();
        //sc.nextLine();
        return retour;
    }
    
    
    
    
    
  
   //***************************************************************************   Modif Profil  
    /** 
     *@Methode modif_profil permet la modification du profil de @see User , @param reponse

     */
    public static void modif_profil(int rep, User myUser)
    {
                    System.out.println("modifié nom (1) "
                     + "/n Modifié mon prenom (2)" + " /n Modifié mon age (3)");
                    rep = sc.nextInt();
                    sc.nextLine();
                    
                switch (rep){
                 
                case  0:
                    
                    System.out.println("affichage profil");
                    System.out.println("Mon profil : ");
                    System.out.println("------------------⦅⦿⦿⦆--------------------");
                    System.out.println( myUser.getPrenom() + "  " + myUser.getNom());
                    System.out.println(myUser.getAge());
                     break;  
                case  1:
                     System.out.println("veuillez resaisir nom : ");
                    myUser.setNom(sc.next());
                    // sc.nextLine();
                    System.out.println( "votre nouveau nom : " + myUser.getNom());
                    
                     break;  
                 case  2:
                      System.out.println("veuillez saisir prenom : ");
                      myUser.setPrenom(sc.next());
                      System.out.println( "votre nouveau prenom : " + myUser.getPrenom());
                     break;  
                case  3:
                    System.out.println("veuillez resaisir votre age : ");
                      myUser.setAge(sc.nextInt());
                      sc.nextLine();
                      System.out.println( "votre nouveau Age : " + myUser.getAge());
                      break;
               
                default:
                    System.out.println("erreur");
                    exit();
                    break;
          }
      
                    
    }
    //**************************************************************************
    //static void choice(int reponse, User users, String[][] message) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }
}
