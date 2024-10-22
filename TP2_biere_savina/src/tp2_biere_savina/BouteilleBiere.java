/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_biere_savina;

/**
 *
 * @author Liza Savina
 */
class BouteilleBiere {
    String Nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    boolean Decapsuler;
    

    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    Decapsuler= false;
    
}

    public BouteilleBiere() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

public void lireEtiquette() {
    System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
    
}


    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés)
    Ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
}

}
    

