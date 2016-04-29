/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin.pkg29;

import java.util.ArrayList;

/**
 *
 * @author slagogonzalez
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        ArrayList<Barco> barcos = new ArrayList();
        Barco vel = new Veleros(15,2);
        Barco dep = new Deportivas(14,30);
        Barco yat = new Yates(20,2,35);
        
        barcos.add(vel);
        barcos.add(dep);
        barcos.add(yat);
        
       for(Barco b:barcos){
           b.factura(3);
       }
    }
    
}
