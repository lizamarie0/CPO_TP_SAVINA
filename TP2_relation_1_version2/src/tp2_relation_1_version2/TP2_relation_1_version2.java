/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_version2;

/**
 *
 * @author Liza Savina
 */
public class TP2_relation_1_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture_version2 uneClio = new Voiture_version2 ("Clio", "Renault", 5 ) ;
        Voiture_version2 uneAutreClio = new Voiture_version2 ("Clio", "Renault", 5 ) ;
        Voiture_version2 une2008 = new Voiture_version2 ("2008", "Peugeot", 6 ) ;
        Voiture_version2 uneMicra = new Voiture_version2 ("Micra", "Nissan", 4 ) ;
        Personne_version2 bob = new Personne_version2("Bobby", "Sixkiller");
        Personne_version2 reno = new Personne_version2("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

        
        bob.liste_voiture[0] = uneClio ;
        bob.nbVoitures = 2 ;
        uneClio.Propriétaire = bob ;
        une2008.Propriétaire = bob ;
        System.out.println("la premiere voiture de Bob est : " + "\n" + bob.liste_voiture[0] + "\n" + "Et sa deuxieme est : " + "\n" + bob.liste_voiture[1]) ;
        
        reno.liste_voiture[0] = uneAutreClio ;
        reno.liste_voiture[1] = uneMicra;
        reno.nbVoitures = 2 ;
        uneAutreClio.Propriétaire = reno ;
        uneMicra.Propriétaire = reno ;
        System.out.println("la premiere voiture de Reno est : " + "\n" + reno.liste_voiture[0] + "\n" + "Et sa deuxieme est : " + "\n" + reno.liste_voiture[1]) ;
                  
        reno.ajouter_voiture(uneAutreClio);          
        bob.ajouter_voiture(uneClio);
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);
        bob.ajouter_voiture(uneMicra);
        System.out.println( "Alors, Reno possede " + reno.nbVoitures + " voitures. " + "\n" + "Et Bob possede " + bob.nbVoitures + " voitures.");
    }
    
}
