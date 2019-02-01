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
        SinConstructor mensajero =new SinConstructor();
        mensajero.PedirNombre();
        mensajero.imprimir();
        
        ConConstructor mensajero1 = new ConConstructor();
        
    }
}
