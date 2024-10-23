/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ex4;

/**
 *
 * @author Liza Savina
 */
public class voiture {
    
           
        
        String model;
        String Marque;
        int puissanceCV;
        
    public voiture ( String model, String marque, int puissanceCV){
        this.model=model;
        this.Marque=marque;
        this.puissanceCV=puissanceCV;
        
}
        @Override
        public String toString () {
            return model + Marque + puissanceCV ;
}
}



    
    
    



    
