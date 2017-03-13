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
public class User {
    
      private  static Scanner sc = new Scanner(System.in);  
      private  int age;
       private  String nom;
        private String prenom;
        
        
    private  ArrayList<Friends> potos = new ArrayList<>();
    private ArrayList<Message> messages = new ArrayList<>();  
    
        
        
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
        
    
     public  ArrayList< Message > createMessage()
    {
          // String message1[][];
            System.out.println("***********************************************");
            System.out.println("veuillez saisir le titre de votre message : ");
            String title = sc.nextLine();
                
            System.out.println("***********************************************");  
            System.out.println("veuillez saisir votre message : ");
            String content = sc.nextLine();
            System.out.println("***********************************************");
            Message message = new Message();
            message.setTitle(title);
            message.setContent(content);
            this.messages.add(message);
            
            
            
            System.out.println(this.messages.get(0).getContent());
            
            return this.messages;
        
            //System.out.println(message.getTitle() + "  ******  " + message.getContent() ); 
            //Message Mymessages = message;
            //String  message1[][]= {{message.getContent()},{message.getTitle()}};
           // System.out.println(message1);
           // return  message1;
           
    }
     
     
     
     public void viewMessage(){
         System.out.println(this.messages.size());
         
          for(int i = 0 ; i < messages.size() ; i++)
          {
              
              //message.getContent();
              //System.out.println(messages);
             System.out.println("titre : " + messages.get(i).getTitle());
             System.out.println("contenue :  " + messages.get(i).getContent());
              
          }
         
         
     }
     
      public void  addFriend ()
    {
         
         System.out.println("veuillez saisir le nom  de votre amis");
                     String nm = sc.nextLine();
                    System.out.println("veuillez saisir le prenom  de votre amis");
                    String prnm = sc.nextLine();
                    Friends myFriend = new Friends(nm,prnm);
                    //sc.nextLine();
                    System.out.println( "votre new Amis : " + myFriend.getNom() + "   " +  myFriend.getPrenom());
                     this.potos.add(myFriend);
            
            
            
            System.out.println(this.potos.get(0).getNom());
            
            
    }
      
      
           public void  viewFriend ()
    {
         
        for(int i = 0; i < potos.size() ; i++ ){
        
        System.out.println("nom : " + potos.get(i).getNom()+ " || prenom :  " + potos.get(i).getPrenom());
        System.out.println("------------------------------");
        
        }
            
    }


    
}
