/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import operaciones.ClaseHijaResta;
import operaciones.ClaseHijaSuma;
/**
 *
 * @author Michael
 */
public class ClasePrincipal {
    public static void main(String args[]){
        ClaseHijaSuma objSuma = new ClaseHijaSuma();
        objSuma.PedirDatos();
        objSuma.Sumar();
        System.out.println("El resultado de la suma es:");
        objSuma.MostrarResultado();
        
        ClaseHijaResta objResta = new ClaseHijaResta();
        objResta.PedirDatos();
        objResta.Restar();
        System.out.println("El resultado de la suma es:");
        objResta.MostrarResultado();
    }
}
