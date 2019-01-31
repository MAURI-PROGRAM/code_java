/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Michael
 */
public class Hilo2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.print("E");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}
