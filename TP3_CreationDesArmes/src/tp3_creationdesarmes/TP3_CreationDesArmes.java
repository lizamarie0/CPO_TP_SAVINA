/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_creationdesarmes;

import Armes.Epee;
import Armes.baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Liza Savina
 */
public class TP3_CreationDesArmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Excalibur = new Epee("Excalibur", 7,5);
        Epee Durandal = new Epee("Durandal", 4,7);
        
        baton Chêne = new baton ("Chêne", 4, 5);
        baton Charme = new baton ("Charme", 5, 6);
        
        
        ArrayList<Arme> tableau = new ArrayList<Arme>();
        tableau.add(Excalibur);
        tableau.add(Durandal);
        tableau.add(Chêne);
        tableau.add(Charme);
        
        
        //System.out.println("La liste des epee disponible est : " + Excalibur + "\n" + Durandal + "\n" + " et les deux batons disponibles sont : " + Chêne + "\n" + Charme);
        
        System.out.println(tableau);
        
    }
    
}
