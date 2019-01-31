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
public class HiloProceso extends Thread{
    public void run(){
        for (int i = 0; i < 6; i++) {
            setPriority(i+1);
            System.out.println(i+getName()+getPriority());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
            
        }
    }
}
