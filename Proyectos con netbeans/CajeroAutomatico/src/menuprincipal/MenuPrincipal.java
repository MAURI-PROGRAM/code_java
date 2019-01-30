/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprincipal;
import java.util.Scanner;
import operaciones.Cuenta;

/**
 *
 * @author Michael
 */
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int montoRetirar = 0;
        int montoDepositar = 0;
        Cuenta objcuenta = new Cuenta();
        do {
            System.out.println("Por favor selecione uma opcion:");
            System.out.println("    1. Consulta de saldo");
            System.out.println("    2. Retiro de efectivo");
            System.out.println("    3. Deposito de efectivo");
            System.out.println("    4. Salir");
            System.out.println("-------------------------------------");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Su saldo es:  "+objcuenta.getSaldo());
                    break;
                case 2:
                    System.out.print("Cuanto desea retirar: ");
                    montoRetirar = entrada.nextInt();                    
                    objcuenta.Retiro(montoRetirar);
                    System.out.println("Retiraste:  "+montoRetirar);
                    System.out.println("Su saldo es:  "+objcuenta.getSaldo());
                    break;
                case 3:
                    System.out.print("Cuanto desea depositar: ");
                    montoDepositar = entrada.nextInt();                    
                    objcuenta.Deposito(montoDepositar);
                    System.out.println("Depositaste:  "+montoDepositar);
                    System.out.println("Su saldo es:  "+objcuenta.getSaldo());
                    break;
                case 4:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Selecion invalida");
                    break;
            }
            System.out.println("-------------------------------------");
        } while (opcion != 4);
        
    }
    
}
