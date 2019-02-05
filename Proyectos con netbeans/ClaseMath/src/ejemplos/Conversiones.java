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
public class Conversiones {
    public static void main(String[] args) {
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        System.out.println("Deg a Rad: "+anguloEnGrados+"° - "+anguloEnRadianes+" rad");
        
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Rad a Deg: "+anguloEnRadianes+" rad - "+anguloEnGrados+"°");
    }
}
