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
public class ConConstructor {
    private Scanner entrada = new Scanner(System.in);
    String nombre="";
    public ConConstructor(){
        
        System.out.println("¿CUal es tu nombre?");
        this.nombre = entrada.nextLine();
        System.out.println("TU nombre es: "+this.nombre);
    }
    
}
