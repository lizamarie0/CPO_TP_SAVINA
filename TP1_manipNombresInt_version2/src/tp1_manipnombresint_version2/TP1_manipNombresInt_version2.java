/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_version2;

import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class TP1_manipNombresInt_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        a= sc.nextInt();
        
        int b;
        System.out.println("\n Entrer le nombre :");
        b= sc.nextInt();
        
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println("la somme est : " + c + ", la difference est : " + d + ", le produit est : " + e + "\n" + "le quotient est : " + f + " le reste de la division euclidienne est : " + g);
    }
    
}
