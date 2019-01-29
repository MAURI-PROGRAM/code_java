/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llfunciones;

/**
 *
 * @author Michael
 */
public class LLfunciones {
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0,SecadoCompleto = 0;
    
    public LLfunciones(int Kilos, int TipoDeRopa){
        this.kilos = Kilos;
        this.TipoDeRopa = TipoDeRopa;
    }
    private void Llenado(){
        if(kilos <= 12){
            llenadoCompleto = 1;
            System.out.println("Llanado completo");
        }else{
            System.out.println("La carga de la ropa esta muy llena, reduce la carga");
        }
    }
    
    private void Lavado(){
        Llenado();
        if(llenadoCompleto == 1){
            if(TipoDeRopa == 1){
                System.out.println("Ropa blanca / Lavado suave");
                LavadoCompleto = 1;
            }else if(TipoDeRopa == 2){
                System.out.println("Ropa de color /lavado intenso");
                LavadoCompleto= 1;
            }else{
                System.out.println("El tipo de ropa no esta disponible");
                LavadoCompleto=1;
            }
        }
    }
    
    private void Secado(){
        Lavado();
        if(LavadoCompleto == 1){
            System.out.println("Secando");
            SecadoCompleto= 1;
        }
    }
    
    public void CicloFinalizado(){
        Secado();
        if(SecadoCompleto == 1){
            System.out.println("TU ropa esta lista");
        }
    }
}
