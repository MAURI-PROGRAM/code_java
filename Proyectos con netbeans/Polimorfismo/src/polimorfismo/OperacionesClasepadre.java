/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;
import java.util.Scanner;

/**
 *
 * @author Michael
 */
public abstract class OperacionesClasepadre {
    protected int valor1,valor2,resultado;
    Scanner entrada = new Scanner(System.in);
    public void PedirDatos(){
        System.out.println("Dame el primer valor");
        valor1 = entrada.nextInt();
        
        System.out.println("Dame el segundo valor");
        valor2 = entrada.nextInt();
    }
    
    public abstract void Operaciones();
    
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
