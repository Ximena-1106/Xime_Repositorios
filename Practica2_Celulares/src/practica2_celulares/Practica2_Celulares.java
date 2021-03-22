/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_celular;

import java.util.ArrayList;

/**
 *
 * @author nueva
 */
public class Practica2_Celulares {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Celular>arreglo =new ArrayList<>();
        arreglo.add(new Samsung());
        arreglo.add(new Hawey());
         System.out.println(arreglo.get(0).imprimirMarca());
         System.out.println(arreglo.get(1).imprimirMarca());
         
         System.out.println(arreglo.get(0).imprimirInformacion());
         System.out.println(arreglo.get(1).imprimirInformacion());
    }
    
}