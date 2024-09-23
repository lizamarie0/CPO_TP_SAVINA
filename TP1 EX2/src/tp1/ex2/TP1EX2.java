/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1.ex2;

import java.util.Scanner;
import static tp1.ex2.TP1EX2.KelvinVersCelcius;

/**
 *
 * @author Liza Savina
 */
public class TP1EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Celcius;
        double Kelvin;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer le nombre :");
Celcius=sc.nextInt(); // On demande a sc de donner le prochain entier
Kelvin = Celcius + 273;
System.out.println("\n la temperature en kelvin est" + Kelvin);
    }
    
    
    double Celcius;
    double Kelvin;
   
    public static double CelciusVersKelvin (double Celcius) {
        Celcius = Celcius + 273 ;
        return (Kelvin);
}
    
    public static double KelvinVersCelcius (double Kelvin) {
        Kelvin = Kelvin - 273;
        return (Kelvin);
}
    
    public static double FarenheitVersCelcius (double Farenheit) {
        Farenheit = (Farenheit - 32) * 5/9 ;
        return (Farenheit);


}
    public static double CelciusVersFarenheit (double Celcius) {
        Celcius = (Celcius * 1.8) + 32 ;
        return (Celcius);
        
    }
    
    public static double KelvinVersFarenheit (double Kelvin) {
        Kelvin = Kelvin * 9.5 + 459.67 ;
        return (Kelvin);
    }
    
    public static double FarenheitVersKelvin (double Farenheit) {
        Farenheit = (Farenheit - 32)/1.8 +273.15;
        return (Farenheit);
    }
}