/*
liza savina 
 */
package ex.pkg1;

import java.util.Scanner;

/**
 *
 * @author Liza Savina
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        System.out.print("Please enter the operator: " + "\n" + "1) add" + "\n" + "2) substract" + "\n" + "3) multiply" + "\n" + "4) divide" + "\n" + "5) modulo");
    
int operateur;
Scanner sc = new Scanner(System.in);
System.out.println("\n Entrer l'operateur :");
operateur=sc.nextInt(); // On demande a sc de donner le prochain entier


int operande1;
System.out.println("\n Entrer le chiffre 1 :");
operande1=sc.nextInt(); // On demande a sc de donner le prochain entier

int operande2;
System.out.println("\n Entrer le chiffre 2 :");
operande2=sc.nextInt(); // On demande a sc de donner le prochain entier

while (operateur<1 || operande2>5){
    System.out.println("entrer le numero de l'operateur souhaiter :");
    operateur=sc.nextInt();
    
}
    if (operateur==1){
        int a= operande1 + operande2;
        System.out.println(a);
                }
                
    if (operateur==2){
        int b = operande1 - operande2;
        System.out.println(b);
                }
                
    if (operateur==3){
        int c = operande1 * operande2;
        System.out.println(c);
                }
                
    if (operateur==4){
        int d = operande1 / operande2;
        System.out.println(d);
                }
                
    if (operateur==5){
        int e= operande1 % operande2;
        System.out.println(e);
            
            
        
}

        
System.out.print("Le resultat est " +result);




        
        
        
        
        
      
   
    }
    
}
