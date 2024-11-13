/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author Liza Savina
 */
public class baton extends Arme {

    int finesse;
    
    public baton(String nom, int niveauattaque, int finesse) {
        super(nom, niveauattaque);
        this.finesse=finesse;
    }
    
    
    
}
    

