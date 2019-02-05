/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Michael
 */
public class FuncionesTrigonometricas {
    public static void main(String[] args) {
        double resultado = 0;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de : "+anguloEnGrados+"° = "+resultado);
        
        anguloEnRadianes = Math.asin(resultado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco seno de: "+resultado+" = "+anguloEnGrados+"°");
        
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("Tangente de : "+anguloEnGrados+"° = "+resultado);
        
        anguloEnRadianes = Math.atan(resultado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco Tangente de: "+resultado+" = "+anguloEnGrados+"°");
        
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("Coseno de : "+anguloEnGrados+"° = "+resultado);
        
        anguloEnRadianes = Math.acos(resultado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco Coseno de: "+resultado+" = "+anguloEnGrados+"°");
 
    }
}
