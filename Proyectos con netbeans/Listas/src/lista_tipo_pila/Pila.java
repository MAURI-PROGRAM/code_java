/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_tipo_pila;

import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class Pila {
    private Nodo UltimoValorIngresado;
    int tamaño = 0;
    String Lista = "";
    public Pila(){
        UltimoValorIngresado = null;
        tamaño = 0;
    }
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    public void insertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente=UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamaño++;
    }
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamaño--;
        return auxiliar;
    }
    public int MostraUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    public int TamanoPila(){
        return tamaño;
    }
    public void VaciarPila(){
        while(!PilaVacia() ){
            EliminarNodo();
        }
    }
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        while (recorrido != null){
            Lista += recorrido.informacion+"\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null,Lista);
        Lista="";
    }
}
