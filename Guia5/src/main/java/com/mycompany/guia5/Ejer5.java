
package com.mycompany.guia5;

//@author Ale Funes

import java.util.Random;

public class Ejer5 {

   
    public static void main(String[] args) {
         Random rnd = new Random();
        int[][] matriz = new int [4][4];
        int[][] matrizB = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rnd.nextInt(10);  
                System.out.print(matriz[i][j]);
            }     
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizB[i][j] = matriz[i][j];
                System.out.print(matrizB[i][j]);
            }
            System.out.println("");
        }
        int cont = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != -matrizB[i][j]) {
                    System.out.println("No es asimetrica");
                    i = 5;
                    break;
                }
                cont++;
            }
        }
        if (cont == 16) {
            System.out.println("Es asimetrica");
        }
    }

}

