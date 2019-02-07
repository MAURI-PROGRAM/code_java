/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class Recursividad {
    public void Imprimir(int x){
        if (x <= 5) {
            System.out.println(x+" ");
            Imprimir(x+1);
        }
    }
}
