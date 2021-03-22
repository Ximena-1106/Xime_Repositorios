/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2_celulares;

/**
 *
 * @author nueva
 */
public abstract class Celular {
public class Celular {
  private String marca; 
    private String procesador;
    private String diagonalDePantalla;
    private String tamanoBateria;
    private String modelo;
    //Constructor vacio
    public Celular(){
        this.marca="";
        this.procesador="";
        this.diagonalDePantalla="";
        this.tamanoBateria="";
        this.modelo="";
    }
    //metodo
    public String imprimirInformacion(){
        return "la marca de mi telefono es: "+marca
                +"y además tiene una panatalla de "+diagonalDePantalla
                +"pulgadas";
    }
    public  abstract String imprimirMarca();
}
