/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Michael
 */
public class Factorial {
    public int Imprimir(int parametro){
        if (parametro > 0){
            int valor = parametro * Imprimir(parametro-1);
            return valor;
        }
        return 1;
    }
}
