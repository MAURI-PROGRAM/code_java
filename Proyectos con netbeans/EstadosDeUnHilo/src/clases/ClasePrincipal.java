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
public class ClasePrincipal {
    public static void main(String[] args) {
        HiloProceso hilo1 = new HiloProceso();
        HiloProceso hilo2 = new HiloProceso();
        
        hilo1.start();
        try {
            hilo1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo"+e);
        }
        
        hilo2.start();
        hilo2.stop();
        try {
            hilo2.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo 2"+e);
        }
        
        
    }
}
