/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valeur1;
        int valeur2;
        double somme = 0;
        double soustraction = 0;
        double multiplication = 0;
        double quotient = 0;
        double modulo = 0;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer la valeur1 :");
System.out.println("\n Entrer la valeur2 :");
valeur1=sc.nextInt(); // On demande a sc de donner le prochain entier
valeur2=sc.nextInt(); // On demande a sc de donner le prochain entier
somme = valeur1 + valeur2;
soustraction = valeur1 - valeur2;
multiplication = valeur1 * valeur2;
quotient = valeur1 /valeur2;
modulo = valeur1 % valeur2;
System.out.println("les valeurs sont "  + somme + " ; " + soustraction + " ; " + multiplication + " ; " + quotient + " ; " + modulo);
       
      

    }
    
}
