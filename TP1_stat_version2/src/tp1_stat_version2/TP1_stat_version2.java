/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stat_version2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class TP1_stat_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un nombre ");
        m=sc.nextInt();
                
        int[] tableau = new int[m];
        
        for (int i =0; i < tableau.length; i++){
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(6);
            tableau [i] = n;
        }
        for (int i =0; i < tableau.length; i++){
            System.out.println("la face " + (i+1) + " contient la valeur : " + tableau[i]);
        }
      System.out.println();
           
      for (int i=0; i<6; i++){
            double b;
            b =(tableau[i]*(1.0)/m*(1.0))*100;
            System.out.println( "le numero " + (i+1) + " est tombe " + b + "% fois.");
}
    }
    
}
