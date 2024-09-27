/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.ex3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class TP1EX3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        int a = generateurAleat.nextInt(100);
        System.out.println(a);
            
    
        int nb = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    nb=sc.nextInt(); // On demande a sc de donner le prochain entier
    
        if ( a == nb ) {
            System.out.println(" gagné");
        }
            
        if (a > nb) {
            System.out.println("  trop grand");
        }
        if (a < nb) {
            System.out.println("  trop petit");
        }
    }
}
    

