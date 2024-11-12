/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_version2;

/**
 *
 * @author Liza Savina
 */
public class TP2_Bieres_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere_version2 uneBiere = new BouteilleBiere_version2("Cuvée des trolls", 7, "Dubuisson") ;
        uneBiere.lireEtiquette();
        uneBiere.Décapsuler();
        
        BouteilleBiere_version2 secondeBiere = new BouteilleBiere_version2 ("Leffe", (float) 6.6,"Abbaye de Leffe") ;
        secondeBiere.lireEtiquette();
        uneBiere.Décapsuler();
        
        BouteilleBiere_version2 toisiemeBiere = new BouteilleBiere_version2 ("despe", (float) 4,"le pourquoi pas a Douarnenez") ;
        toisiemeBiere.lireEtiquette();
        uneBiere.Décapsuler();
        
        BouteilleBiere_version2 quatriemeBiere = new BouteilleBiere_version2 ("corona", (float) 5.5,"Le GH a Fouesnant") ;
        quatriemeBiere.lireEtiquette();
        uneBiere.Décapsuler();
        
        BouteilleBiere_version2 cinquiemeBiere = new BouteilleBiere_version2 ("La blonde", (float) 8,"Le cocorico a Brest") ;
        cinquiemeBiere.lireEtiquette();
        uneBiere.Décapsuler();
        
    }
    
}
