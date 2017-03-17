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
public class Moderateur extends User {

    private int level;
    
    
      public Moderateur(String nom, String prenom, int age, int lvl) 
      {

        super(nom, prenom, age);
        this.level = lvl;
      }
      
  //**********************************************************    
   
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

  

}
