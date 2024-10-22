/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.ex2;

/**
 *
 * @author Liza Savina
 */

public class Convertisseur {
    int nbConversions = 0;
 

public double CelciusVersKelvin(double tCelcius) {
        nbConversions++;
        return tCelcius + 273.15;
    }

    public double KelvinVersCelcius(double tKelvin) {
        nbConversions++;
        return tKelvin - 273.15;
    }

    public double CelciusVersFarenheit(double tCelcius) {
        nbConversions++;
        return (tCelcius * 9 / 5) + 32;
    }

    public double FarenheitVersCelcius(double tFarenheit) {
        nbConversions++;
        return (tFarenheit - 32) * 5 / 9;
    }

    public double KelvinVersFarenheit(double tKelvin) {
        nbConversions++;
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    public double FarenheitVersKelvin(double tFarenheit) {
        nbConversions++;
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }

   
    @Override
    public String toString() {
        return "Nombre de conversions effectuees : " + nbConversions;
    }

}
