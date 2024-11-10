/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_version2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class TP1_guessMyNumber_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b;
        int compteur;
        int difficulter;
       
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        compteur = 0;
        System.out.println("Choisir un mode de difficulter : " + "\n" + "1)facile" + "\n" + "2)moyen" + "\n" + "3) difficile");
        difficulter = sc.nextInt();
        System.out.println("Saisir une valeur entre 0 et 100");
        b=sc.nextInt();
        
        if (difficulter == 1){
            for (int i=1; i<=10; i++){
                while (compteur <=10 && b!=n){
            
                    if (n > b){
                        System.out.println("trop petit");
        }
                    if (n < b){
                        System.out.println("Trop grand");
        }
                    
        
                System.out.println("Saisir une valeur entre 0 et 100");
                b=sc.nextInt();
                compteur +=1;
        }
                
    }
            if (b==n){
                System.out.println("gagner et le nombre de tentative est : " + compteur);
                
            } else {
                System.out.println("perdu et le nombre de tentative est : " + compteur);
            }
            }
        
        if (difficulter == 2){
            for (int i=1; i<=5; i++){
                while (compteur <=10 && b!=n){
            
                    if (n > b){
                        System.out.println("trop petit");
        }
                    if (n < b){
                        System.out.println("Trop grand");
        }
                    
        
                System.out.println("Saisir une valeur entre 0 et 100");
                b=sc.nextInt();
                compteur +=1;
        }
                
    }
            if (b==n){
                System.out.println("gagner et le nombre de tentative est : " + compteur);
                
            } else {
                System.out.println("perdu et le nombre de tentative est : " + compteur);
            }
            }
        
        if (difficulter == 3){
            for (int i=1; i<=2; i++){
                while (compteur <=10 && b!=n){
            
                    if (n > b){
                        System.out.println("trop petit");
        }
                    if (n < b){
                        System.out.println("Trop grand");
        }
                    
        
                System.out.println("Saisir une valeur entre 0 et 100");
                b=sc.nextInt();
                compteur +=1;
        }
                
    }
            if (b==n){
                System.out.println("gagner et le nombre de tentative est : " + compteur);
                
            } else {
                System.out.println("perdu et le nombre de tentative est : " + compteur);
            }
            }
        
        }
        
}
