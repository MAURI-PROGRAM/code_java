/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Michael
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        OperacionesClasepadre mensajero_suma = new SumaClaseHija();
        mensajero_suma.PedirDatos();
        mensajero_suma.Operaciones();
        mensajero_suma.MostrarResultado();
        
        OperacionesClasepadre mensajero_Resta = new RestaClaseHija();
        mensajero_Resta.PedirDatos();
        mensajero_Resta.Operaciones();
        mensajero_Resta.MostrarResultado();
        
        
    }
    
}
