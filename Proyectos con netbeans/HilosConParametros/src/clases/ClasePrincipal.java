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
        Procesos hilo1 = new Procesos(" hilo1");
        Procesos hilo2 = new Procesos(" hilo2");
        hilo1.ValorCondicion(5);
        hilo2.ValorCondicion(10);
        hilo1.start();
        hilo2.start();
    }
}
