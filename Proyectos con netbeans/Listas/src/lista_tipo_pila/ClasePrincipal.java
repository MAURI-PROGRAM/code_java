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
public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion = 0, nodo =0;
        Pila pila =new Pila();
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "Menu de opcion \n\n"
                        + "1.- Insertar un nodo\n"
                        + "2.- Eliminar un nodo\n"
                        + "3.- ¿La pila esta vacia?\n"
                        + "4.- ¿Cual es el ultimo digito ingresado en la pila?\n"
                        + "5.- ¿Cuantos nodos tiene la pila?\n"
                        + "6.- Vaciar la pila\n"
                        + "7.- Mostrar contenido de la Pila\n"
                        + "8.- Salir"));
                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,"Porfavor Ingrese ell valor a guardar en el nodo"));
                        pila.insertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null,"Se ha eliminado un nodo con el valor: "+pila.EliminarNodo());
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }
                        break;
                    case 3:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila no esta vacia");
                        }
                        break;
                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null,"El ultimo valor ingresado en la pila es: "+pila.MostraUltimoValorIngresado());
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"La pila contine "+pila.TamanoPila()+" nodos.");
                        break;
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null,"Se ha vaciado la pila correctamente");
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        opcion=8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                        break;
                }
            } catch (NumberFormatException e) {
            }
        }while (opcion != 8);
    }
}
