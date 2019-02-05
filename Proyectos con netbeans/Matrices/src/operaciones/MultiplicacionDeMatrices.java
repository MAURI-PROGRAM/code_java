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
public class MultiplicacionDeMatrices {
    public static void main(String[] args) {
        int matriz1 [][]= new int [2][3];
        int matriz2 [][]= new int [3][2];
        int matrizresultado [][]= new int [2][2];
        
        //llenado de la primer matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int)(Math.random()*10);
            }
        }
        
        //llenado de la segunda matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int)(Math.random()*10);
            }
        }
        //resultado
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz2.length; k++) {
                    matrizresultado[i][j] += matriz1[i][k] * matriz2[k][j];                    
                }
            }
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print("["+matriz1[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("  *  ");
        for (int i = 0; i < matriz2.length; i++) {    
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print("["+matriz2[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("  =  ");
        for (int i = 0; i < matrizresultado.length; i++) { 
            for (int j = 0; j < matrizresultado[0].length; j++) {
                System.out.print("["+matrizresultado[i][j]+"]");
            }
            System.out.println("");
        }

        
    }
}
