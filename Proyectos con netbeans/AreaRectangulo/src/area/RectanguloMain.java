/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;
import java.util.Scanner;
/**
 *
 * @author Michael
 */
public class RectanguloMain {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el valor de la base:");
        int base = entrada.nextInt();
                
        System.out.println("Dame el valor de la altura");
        int altura = entrada.nextInt();
        
        Rectangulo mensaje = new Rectangulo(base,altura);
        mensaje.Imprimir();
    }
}
