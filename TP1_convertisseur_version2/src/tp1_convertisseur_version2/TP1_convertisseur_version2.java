/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_version2;

import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class TP1_convertisseur_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double a;
        Double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Bonjour, saisissez une valeur :");
        a= sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :" + "\n" + "1) CelciusVersKelvin" + "\n" + "2) KelvinVersCelcius" + "\n" + "3)FarenheitVersCelcius" + "\n" + "4)CelciusVersFarenheit" + "\n" + "5)KelvinVersFarenheit" + "\n" + "6) FarenheitVersKelvin" );
        b=sc.nextDouble();
        
        if (b==1){
            CelciusVersKelvin(a);
            System.out.println(a + "degre Celcius est egal a " + CelciusVersKelvin(a) + "degre Kelvin.");
        }
        
        if (b==2){
            KelvinVersCelcius(a);
            System.out.println(a + "degre Kelvin est egal a " + KelvinVersCelcius(a) + "degre Celcius.");
        }
        
        if (b==3){
            FarenheitVersCelcius(a);
            System.out.println(a + "degre Farenheit est egal a " + FarenheitVersCelcius(a) + "degre Celcius.");
        }
        
        if (b==4){
            CelciusVersFarenheit(a);
            System.out.println(a + "degre Celcius est egal a " + CelciusVersFarenheit(a) + "degre Farenheit.");
        }
        
        if (b==5){
            KelvinVersFarenheit(a);
            System.out.println(a + "degre Kelvin est egal a " + KelvinVersFarenheit(a) + "degre Farenheit.");
        }
        
        if (b==6){
            FarenheitVersKelvin(a);
            System.out.println(a + "degre Farenheit est egal a " + FarenheitVersKelvin(a) + "degre Kelvin.");
        }
    }
    
   
    
    public static double CelciusVersKelvin(double tCelcius){
        tCelcius = tCelcius + 273;
        return(tCelcius);
   
}
    public static double KelvinVersCelcius(double tKelvin){
        tKelvin = tKelvin - 273;
        return(tKelvin);
   
}
    public static double FarenheitVersCelcius(double tCelcius){
        tCelcius = (tCelcius - 32) * (5 / 9);
        return(tCelcius);
    }
    
    public static double CelciusVersFarenheit(double tCelcius){
        tCelcius = (tCelcius * (5 / 9)) + 32;
        return(tCelcius);
    }
    
    public static double KelvinVersFarenheit(double tKelvin){
        tKelvin = (tKelvin * (9 / 5)) - 459.67;
        return(tKelvin);
    }
    
    public static double FarenheitVersKelvin(double tFarenheit){
        tFarenheit = (tFarenheit + 459.67) * (5 / 9);
        return(tFarenheit);
    }
    
    
}
