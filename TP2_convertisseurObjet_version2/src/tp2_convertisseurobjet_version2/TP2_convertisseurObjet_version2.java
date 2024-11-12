/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_version2;

import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class TP2_convertisseurObjet_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        convertiseur_version2 conv = new convertiseur_version2 ();
        double a;
        int b =0;
        
        
        System.out.println("Bonjour, saisissez une valeur : ");
        a = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :" + "\n" + "1) De Celcius vers Kelvin" + "\n" + "2) de Kelvin vers Celcius" + "\n" + "3) de Celcius vers Farenheit" + "\n" + "4) de Farenheit vers Celcius" + "\n" + "5) de Kelvin vers Farenheit" + "\n" + "6) de Farenheit vers Kelvin");
        b = sc.nextInt();
        
        if (b==1){
            System.out.println(a + " degres Celsius est egal a " + conv.CelciusVersKelvin(a) + " degres Kelvin.");  
        }
        if (b==2){
            System.out.println(a + " degres kelvin est egal a " + conv.KelvinVersCelcius(a) + " degres celcius.");  
        }
        if (b==3){
            System.out.println(a + " degres Farenheit est egal a " + conv.FarenheitVersCelcius(a) + " degres celcius.");  
        }
        if (b==4){
            System.out.println(a + " degres celcius est egal a " + conv.CelciusVersFarenheit(a) + " degres Farenheit.");  
        }
        if (b==5){
            System.out.println(a + " degres kelvin est egal a " + conv.KelvinVersFarenheit(a) + " degres Farenheit.");  
        }
        
    }
    
}
