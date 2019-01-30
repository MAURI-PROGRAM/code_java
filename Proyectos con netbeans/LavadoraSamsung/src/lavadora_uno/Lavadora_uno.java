/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavadora_uno;
import Libreria.LLfunciones;
import java.util.Scanner;
/**
 *
 * @author Michael
 */
public class Lavadora_uno {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("La ropa es blanca o de color?");
        System.out.println("Presiona 1 ropa blanca / 2 ropa de color");
        
        int TipoDeRopa = entrada.nextInt();
        
        System.out.println("Cuantos kilos de ropa");
        int Kilos = entrada.nextInt();
        
        LLfunciones mensajero = new LLfunciones(Kilos,TipoDeRopa);
        mensajero.setTipoDeRopa(2);
        System.out.println("El tipo de ropa es "+mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();        
    }
}
