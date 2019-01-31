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
public class Procesos extends Thread{
    int num_int;
    public Procesos(String nom_hilo){
        super(nom_hilo);
    }
    @Override
    public void run(){
        for (int i = 0; i <= this.num_int; i++) {
            System.out.println(i+this.getName());
        }
        System.out.println("");
    }
    public void ValorCondicion(int valor){
        this.num_int = valor;
    }
}
