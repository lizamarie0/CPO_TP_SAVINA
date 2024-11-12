/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_version2;

/**
 *
 * @author Liza Savina
 */
public class TP2_manip_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette_version2 assiette1 = new Tartiflette_version2 (500) ;
        Tartiflette_version2 assiette2 = new Tartiflette_version2 (600) ;
        Tartiflette_version2 assiette3 = assiette2 ;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
        
        
        Moussaka[] Moussaka_version2 = new Moussaka[10];
        for (int i=0; i < Moussaka_version2.length; i++) {
            Moussaka_version2[i] = new Moussaka_version2(200 + (i * 100));
        }
        for (int i = 0; i < Moussaka_version2.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " : " + Moussaka_version2[i].nbcalories + " calories.");
        }

        
    }
    
}
