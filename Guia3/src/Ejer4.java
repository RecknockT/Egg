
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ffune
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese la frase");
                String frase = leer.next();
                if (frase.substring(0,1).equalsIgnoreCase("A")) {
                    System.out.println("Correcto");
        } else {
                System.out.println("Incorrecto");
                
        }
    }
    
}
