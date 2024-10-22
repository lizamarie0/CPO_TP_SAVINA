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
 
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
    uneBiere.lireEtiquette();
    
    
    BouteilleBiere secondebiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
    secondebiere.lireEtiquette();

    
    BouteilleBiere troisiemebiere = new BouteilleBiere("despe", (float) 6.4,"pourquoi pas") ;
    troisiemebiere.lireEtiquette();
    
   
    BouteilleBiere quatiemebiere = new BouteilleBiere("corona", (float) 6.3,"JH") ;
    quatiemebiere.lireEtiquette();
    
    BouteilleBiere cinquiemebiere = new BouteilleBiere("la blonde", (float) 6.8,"La cabane") ;
    cinquiemebiere.lireEtiquette();

    }

    
    
        public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("La bière est maintenant ouverte.");
            return true;  // Retourne vrai si la bière a été décapsulée
        } else {
            System.out.println("Erreur : bière déjà ouverte.");
            return false;  // Retourne faux si la bière était déjà ouverte
        }
    }
  
        }
    
