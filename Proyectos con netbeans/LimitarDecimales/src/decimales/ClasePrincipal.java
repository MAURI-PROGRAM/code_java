/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Michael
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raiz cuadrada de "+numero+" es: "+raiz);
        
        DecimalFormat df = new DecimalFormat("#.000");
        
        System.out.println("La raiz cuadrada de "+numero+" es: "+df.format(raiz));
        
        System.out.println("La raiz cuadrada de "+numero+" es: "+String.format("%.4f", raiz));
        
        System.out.println("La raiz cuadrada de "+numero+" es: "+(double)Math.round(raiz*10000)/10000);
        
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        System.out.println("La raiz cuadrada de "+numero+" es: "+bd.doubleValue());
        
    }
}
