/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouno;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class EjemploUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String palabra = "";
        int longitudPalabra = 0;
        String palabraInvertida = "";
        System.out.println("Ingrese la palabra a invertir");
        palabra = entrada.nextLine();
        longitudPalabra = palabra.length();

        for (int i = longitudPalabra; i > 0; i--) {
            palabraInvertida += palabra.substring(i-1,i);
        }
        
        System.out.println("Palabra invertida:  "+palabraInvertida);
    }
    
}
