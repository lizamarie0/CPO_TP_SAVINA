/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_version2;

/**
 *
 * @author Liza Savina
 */
public class Voiture_version2 {
    String modele;
    String marque;
    int PuissanceCV;
    Personne_version2 Proprietaire ;
    int nbVoitures;
    Voiture_version2 [] liste_voiture;
    

    
    
    public Voiture_version2 (String modele, String marque, int PuissanceCV){
        this.modele=modele;
        this.marque=marque;
        this.PuissanceCV=PuissanceCV;
        this.liste_voiture = new Voiture_version2[3];
        this.nbVoitures = 0;
        
    }
    @Override
    public String toString () {
    return "le modele est "+ modele + ", la marque est " + marque + "et la puissanceCV est : " + PuissanceCV;
}

}
