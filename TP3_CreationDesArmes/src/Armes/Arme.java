/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import java.util.ArrayList;

/**
 *
 * @author Liza Savina
 */
public abstract class Arme {
    String nom;
    int niveauattaque;
    int age;
    int finesse;
    
    public Arme (String nom, int niveauattaque){
        this.nom=nom;
        this.niveauattaque=niveauattaque;
        
    }
    @Override
    public String toString () {
    return "le nom est : "+ nom + ", et son niveau d'attaque est : " + niveauattaque;
}
}

