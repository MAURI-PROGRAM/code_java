/*
 * Creado por Michael
 * Version 1.0
 * Creado el 28-01-2019
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
        
        //Aqui cuento los caracteres de la palabra
        longitudPalabra = palabra.length();

        for (int i = longitudPalabra; i > 0; i--) {
            palabraInvertida += palabra.substring(i-1,i);
        }
        
        System.out.println("Palabra invertida:  "+palabraInvertida);
    }
    
}
