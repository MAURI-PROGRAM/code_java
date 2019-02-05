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
public class SumaDeMatrices {
    public static void main(String[] args) {
        int matriz1 [][]= new int [3][3];
        int matriz2 [][]= new int [3][3];
        int matrizresultado [][]= new int [3][3];
        
        //llenado de la primer matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = (int)(Math.random()*10);
            }
        }
        
        //llenado de la segunda matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = (int)(Math.random()*10);
            }
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matrizresultado[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print("["+matriz1[i][j]+"]");
            }
            if(i==1){
                System.out.print("   +   ");
            }else{
                System.out.print("       ");
            }
            
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print("["+matriz2[i][j]+"]");
            }
            if(i==1){
                System.out.print("   =   ");
            }else{
                System.out.print("       ");
            }
            for (int j = 0; j < matrizresultado.length; j++) {
                System.out.print("["+matrizresultado[i][j]+"]");
            }
            System.out.println("");
            
        }
        
        
    }
}
