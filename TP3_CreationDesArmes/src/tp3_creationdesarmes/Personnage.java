/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_creationdesarmes;

/**
 *
 * @author Liza Savina
 */
public abstract class Personnage {
    String nom;
    int niveauDeVie;
    
    public Personnage(String nom, int niveauDeVie){
        this.niveauDeVie=niveauDeVie;
        this.nom=nom;
    }
    
    @Override
    public String toString () {
    return "le nom est : "+ nom + ", et son niveau de vie est : " + niveauDeVie;

    }
}
