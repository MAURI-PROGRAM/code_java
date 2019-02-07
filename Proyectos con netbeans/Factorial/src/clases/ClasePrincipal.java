/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intorduzca el numero para calcular su factorial");
        int numero = entrada.nextInt();
        Factorial objFactorial = new Factorial();
        int factorial = objFactorial.Imprimir(numero);
        System.out.println("El factorial de "+ numero+" es "+factorial);
    }
}
