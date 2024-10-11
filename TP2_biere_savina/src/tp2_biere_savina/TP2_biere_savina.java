/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_biere_savina;

/**
 *
 * @author Liza Savina
 */
public class TP2_biere_savina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ;

    uneBiere.Nom = "Cuvée des trolls";
    uneBiere.degreAlcool = 7.0 ;
    uneBiere.brasserie = "Dubuisson";
    uneBiere.lireEtiquette();

        
BouteilleBiere secondebiere = new BouteilleBiere() ;
    secondebiere.Nom = "Leffe";
    secondebiere.degreAlcool = 6.6 ; 
    secondebiere.brasserie = "Abbaye de Leffe";
    secondebiere.lireEtiquette();
    }
    
}
