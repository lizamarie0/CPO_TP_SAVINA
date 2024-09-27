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
        double b;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer Celcius :");
System.out.println("\n commande :  " + "1) CelciusVersKelvin" + "2) KelvinVersCelcius" + "3) FarenheitVersCelcius" + "4) CelciusVersFarenheit" + "5) KelvinVersFarenheit" + "6) FarenheitVersKelvin");
b=sc.nextInt(); // On demande a sc de donner le prochain entier


    
    if (b==1) {
        public static double CelciusVersKelvin (double Celcius) {
            Celcius = Celcius + 273 ;
            return (Kelvin);

    
    if (b==2) {
        public static double KelvinVersCelcius (double Kelvin) {
            Kelvin = Kelvin - 273;
            return (Kelvin);
}
    if (b==3) {
        public static double FarenheitVersCelcius (double Farenheit) {
            Farenheit = (Farenheit - 32) * 5/9 ;
            return (Farenheit);
            
}

}   
    if (b==4) {
        public static double CelciusVersFarenheit (double Celcius) {
            Celcius = (Celcius * 1.8) + 32 ;
            return (Celcius);
     

    }
    
    if (b==5) {
        public static double KelvinVersFarenheit (double Kelvin) {
            Kelvin = Kelvin * 9.5 + 459.67 ;
            return (Kelvin);
    }
    

    if (b==5) {
        public static double FarenheitVersKelvin (double Farenheit) {
            Farenheit = (Farenheit - 32)/1.8 +273.15;
            return (Farenheit);
    }
}