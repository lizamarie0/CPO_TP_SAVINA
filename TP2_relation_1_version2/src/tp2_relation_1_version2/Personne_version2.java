/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_version2;

/**
 *
 * @author Liza Savina
 */
public class Personne_version2 {
    String nom;
    String prenom;
    Personne_version2 Propriétaire = null;

    
    public Personne_version2(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
     
        
        
    }
    @Override
    public String toString () {
    return "le prenom est "+ prenom + "et le nom est  " + nom;
    }

    void ajouter_voiture(Voiture_version2 uneAutreClio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
