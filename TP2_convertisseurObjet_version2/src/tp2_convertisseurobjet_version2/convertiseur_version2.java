/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_version2;

/**
 *
 * @author Liza Savina
 */
public class convertiseur_version2 {
    int nbConversions = 0;
    double CelciusVersKelvin;
    double KelvinVersCelcius;
    double CelciusVersFarenheit;
    double FarenheitVersCelcius;
    double KelvinVersFarenheit;
    double FarenheitVersKelvin;
    

    public double CelciusVersKelvin(double tCelcius){
        tCelcius = tCelcius + 273;
        return(tCelcius);
   
}
    public double KelvinVersCelcius(double tKelvin){
        tKelvin = tKelvin - 273;
        return(tKelvin);
   
}
    public double FarenheitVersCelcius(double tCelcius){
        tCelcius = (tCelcius - 32) * (5 / 9);
        return(tCelcius);
    }
    
    public double CelciusVersFarenheit(double tCelcius){
        tCelcius = (tCelcius * (5 / 9)) + 32;
        return(tCelcius);
    }
    
    public double KelvinVersFarenheit(double tKelvin){
        tKelvin = (tKelvin * (9 / 5)) - 459.67;
        return(tKelvin);
    }
    
    public double FarenheitVersKelvin(double tFarenheit){
        tFarenheit = (tFarenheit + 459.67) * (5 / 9);
        return(tFarenheit);
    }
    
    
    @Override
    public String toString () {
    return "nb de conversions"+ nbConversions;
}

}
