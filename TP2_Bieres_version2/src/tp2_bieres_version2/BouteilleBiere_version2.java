/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_version2;

import booleen;

/**
 *
 * @author Liza Savina
 */
class BouteilleBiere_version2 {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    
    public BouteilleBiere_version2(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
        
        }

    


    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" \n" + degreAlcool + " degres " + "\n" + "Brasserie : " + brasserie ) ;

}

        public boolean Décapsuler(){
        if (!ouverte){
            ouverte = true;
            System.out.println("La biere" + nom + " est maintenant ouverte.");
        return true;
        }
        else{
            System.out.println("Erreur: la biere est deja ouverte");
        return false;
        }
        
        
    }
    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés )" + " est ouverte ? : " ;
    if (ouverte == true ){
        chaine_a_retourner += "oui" ;
    }
    else{
        chaine_a_retourner += "non" ;
    }
    return chaine_a_retourner ;
}
}
