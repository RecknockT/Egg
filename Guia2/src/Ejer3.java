
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
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
    
}
