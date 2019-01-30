/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Michael
 */
public class Cuenta {
    private int saldo=500;
    public void Retiro(int monto){
        if (monto >= getSaldo()){
            System.out.println("monto no suficiente");
        }else{
            this.saldo -= monto;
            System.out.println("Retiro "+monto+" su saldo es "+this.getSaldo());
        }
    }
    public void Deposito(int monto){
        this.saldo += monto;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

}
