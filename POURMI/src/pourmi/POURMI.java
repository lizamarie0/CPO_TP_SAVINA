/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pourmi;

import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class POURMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter the operator:" + "\n" + "1) add" + "\n" + "2) substract" +"\n" + "3) multiply" +"\n"+ "4) divide" + "\n" + "5) modulo");
        
        int operateur;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        operateur= sc.nextInt();
        
        while (5<operateur||operateur<1){
        System.out.println("Erreur");
        System.out.println("\n Choisir un chiffre entre 1 et 5 :");
        operateur = sc.nextInt();
        }
        
        int operande1;
        System.out.println("Saisir le nombre");
        operande1 = sc.nextInt();
        
        int operande2;
        System.out.println("Saisir le nombre");
        operande2 = sc.nextInt();
        
        if (operateur == 1)
        {
            int a = operande1 + operande2;
            System.out.println("Le resultat est : " + a );
        }
        
        if (operateur == 2)
        {
            int b = operande1 - operande2;
            System.out.println("Le resultat est : " + b );
        }
        if (operateur == 3){
            int c = operande1 * operande2;
            System.out.println("Le resultat est : " + c );
        }
        if (operateur == 4){
            int d = operande1 / operande2;
            System.out.println("Le resultat est : " + d );
        }
        if (operateur == 5){
            int e = operande1 % operande2;
            System.out.println("Le resultat est : " + e );
        }
    }
    
}
